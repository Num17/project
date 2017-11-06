package com.xiangyue.moodshare.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.xiangyue.moodshare.dao.ResourceMapper;
import com.xiangyue.moodshare.entity.Resource;
import com.xiangyue.moodshare.entity.User;

@Service
public class ResourceService {
	@Autowired
	private ResourceMapper resourceMapper;
	
	public void saveResourceMapper(MultipartFile file, User user, Resource resource, Integer score,
			HttpServletRequest request) throws IllegalStateException, IOException {
		if (!file.isEmpty()) {
			file.transferTo(new File(request.getSession().getServletContext().getRealPath("/") + "upload/"
					+ file.getOriginalFilename()));
			Date now = new Date();
			System.out.println(now);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String stringNow = dateFormat.format(now);

			resource.setName(file.getOriginalFilename());
			resource.setPosition(request.getSession().getServletContext().getRealPath("/") + "upload\\"
					+ file.getOriginalFilename());
			resource.setTime(stringNow);
			resource.setUserId(user.getUserId());
			resource.setScore(score);
			resourceMapper.saveResource(resource);
			System.out.println(
					request.getSession().getServletContext().getRealPath("/") + "upload/" + file.getOriginalFilename());
		}

	}

	public List<Resource> selectAllResources() {
		List<Resource> resources = resourceMapper.selectAllResources();
		return resources;
	}

	public void delectResourceById(Integer id) {
		resourceMapper.delectResource(id);

	}

	public List<Resource> selectAllResourcesAnduser() {
		List<Resource> resources = resourceMapper.selectAllResourcesAndUsers();
		return resources;
	}

	public Resource selectResourceById(Integer id) {
		Resource resource = resourceMapper.selectResourceById(id);
		return resource;

	}
    @Transactional
	public ResponseEntity<byte[]> downloadResource(Integer id, HttpSession session) throws IOException {
		Resource resource = resourceMapper.selectResourceById(id);
		// 获得下载Resource所需资源
		int score = resource.getScore();
		User userConsumer = (User) session.getAttribute("user");
		User userPro = resource.getUser();
		if (userConsumer.getUserScore() >= score) {
			int scoreCon = (int) ((userConsumer.getUserScore()) - score);
			int scorePro = (int) (userPro.getUserScore() - score);
//			userDao.updateById(userConsumer.getUserId(), scoreCon);
//			userDao.updateById(userPro.getUserId(), scorePro);
			byte[] body = null;
			ServletContext servletContext = session.getServletContext();
			InputStream in = servletContext.getResourceAsStream("/upload/" + resource.getName());
			body = new byte[in.available()];
			in.read(body);

			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Disposition", "attachment;filename=" + resource.getName());

			HttpStatus statusCode = HttpStatus.OK;

			ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);

			return response;
		} else {
			return null;
		}
	}
}
