package com.xiangyue.moodshare.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.xiangyue.moodshare.manager.UserShareManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.xiangyue.commons.utils.BaseResponseMessage;
import com.xiangyue.commons.utils.StringUtils;
import com.xiangyue.commons.utils.TimeFormat;
import com.xiangyue.moodshare.bean.PageResult;
import com.xiangyue.moodshare.entity.Newsletter;
import com.xiangyue.moodshare.entity.User;
import com.xiangyue.moodshare.service.NewsletterService;

@Controller
public class NewsletterController {

    @Autowired
    private NewsletterService newsletterService;
    @Autowired
    private UserShareManager userShareManager;
    public Integer PAGE_SIZE = 5;

    @ResponseBody
    @RequestMapping("/user-share-list")
    public PageResult<Newsletter> getUserShare(@RequestParam(required = false, value = "offSet") Integer offSet,
                                               @RequestParam(required = false, value = "userId") Integer userId) {

        return userShareManager.getShareList(offSet, PAGE_SIZE, userId);
    }

    @ResponseBody
    @RequestMapping("/share-mood")
    public BaseResponseMessage sharecontent(HttpServletRequest request, HttpSession session, Newsletter newsletter,
                                            @RequestParam(required = false, value = "file") CommonsMultipartFile file) {
        String realPath = session.getServletContext().getRealPath("/");
        if (StringUtils.notNull(file.getOriginalFilename())) {
            String fileName = TimeFormat.getTime() + file.getOriginalFilename();
            String path = realPath + "/moodimage/" + fileName;
            File f = new File(path);

            if (!f.exists())
                f.mkdirs();
            try {
                file.transferTo(f);
                newsletter.setLetterimage(request.getContextPath() + "/moodimage/" + fileName);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        User user = (User) session.getAttribute("user");
        if (StringUtils.notNull(newsletter.getLetter()))
            newsletterService.insert(newsletter, user);
        return BaseResponseMessage.successMessage;
    }

    @ResponseBody
    @RequestMapping("/newsletter-delete")
    public BaseResponseMessage delete(@RequestParam("nid") Long id) {
        newsletterService.delete(id);
        return BaseResponseMessage.successMessage;
    }

}