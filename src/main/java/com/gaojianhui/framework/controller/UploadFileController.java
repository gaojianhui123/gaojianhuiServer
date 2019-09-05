package com.gaojianhui.framework.controller;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.gaojianhui.framework.model.AttachmentFile;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping(value = "/file")
public class UploadFileController {
	@Value("${assets.piclocation}")
    private String picLocation;
	
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	 public AttachmentFile uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws ParseException {

		String uuid = UUID.randomUUID().toString();
		String targetUrl=null;
		String uuidname = UUID.randomUUID().toString().replace("-", "").toLowerCase()+"."+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
        File destDir = new File(System.getProperty("user.dir") + File.separator + picLocation +
                File.separator +uuid);
        destDir.mkdirs();
        File destFile = new File(destDir.getPath(), uuidname);
        try {
            file.transferTo(destFile);
            targetUrl=	picLocation + uuid +  "/" + uuidname;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        AttachmentFile attachmentFile =new AttachmentFile();
        attachmentFile.setName(file.getOriginalFilename());
        attachmentFile.setSuffix(file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1).toLowerCase());
        attachmentFile.setUrl(targetUrl);
        attachmentFile.setUid(uuid);
        return attachmentFile;

    }
}
