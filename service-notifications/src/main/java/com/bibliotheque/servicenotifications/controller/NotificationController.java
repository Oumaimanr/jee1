package com.bibliotheque.servicenotifications.controller;

import com.bibliotheque.servicenotifications.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public String sendEmailNotification(@RequestParam String to, @RequestParam String subject, @RequestParam String body) {
        emailService.sendNotification(to, subject, body);
        return "Notification sent successfully!";
    }
}

