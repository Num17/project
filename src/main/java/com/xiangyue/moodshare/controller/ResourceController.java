package com.xiangyue.moodshare.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xiangyue.moodshare.entity.Resource;
import com.xiangyue.moodshare.entity.User;
import com.xiangyue.moodshare.service.impl.ResourceService;

@Controller
public class ResourceController {
	@Autowired
	private ResourceService resourceService;

	@RequestMapping("/selectAllResourcesAndUsers")
	public String selectAllResourcesAndUsers(HttpSession session) {
		List<Resource> resources = resourceService.selectAllResourcesAnduser();
		session.setAttribute("resources", resources);
		return "Resource";
	}

	@RequestMapping("/uploadFile")
	public String updateFile(@RequestParam("score") Integer score, @RequestParam("file") MultipartFile file,
			HttpServletRequest request, HttpSession session) throws IllegalStateException, IOException {
		User user = (User) session.getAttribute("user");
		Resource resource = new Resource();
		resourceService.saveResourceMapper(file, user, resource, score, request);
        return "redirect:/selectAllResourcesAndUsers";
	}

	@RequestMapping("/resource/{id}")
	@ResponseBody
	public ResponseEntity<byte[]> downloadResource(@PathVariable("id") Integer id, HttpSession session)
			throws IOException {
		Resource resource = resourceService.selectResourceById(id);
		byte[] body = null;
		ServletContext servletContext = session.getServletContext();
		InputStream in = servletContext.getResourceAsStream("/upload/" + resource.getName());
		body = new byte[in.available()];
		in.read(body);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=" + resource.getName());

		HttpStatus statusCode = HttpStatus.OK;

		ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
		
		//resourceService.downloadResource(id, session);
		
		return response;
	}
}
