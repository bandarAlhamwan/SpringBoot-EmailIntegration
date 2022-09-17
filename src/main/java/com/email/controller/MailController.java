package com.email.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.dto.EmailRequest;
import com.email.service.EmailService;

@RestController
public class MailController {
	
	@Autowired
	private EmailService service;
	
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestBody EmailRequest request) {
		return service.sendSimpleEmail(request);
	}
	

	@PostMapping("/sendEmailWithAttachment")
	public String sendEmailWithAttachment(@RequestBody EmailRequest request) throws MessagingException {
		return service.sendEmailWithAttachment(request);
	}
}
