package org.jarurat_care_assignment.Controller;


import org.jarurat_care_assignment.Model.MessageRequest;
import org.jarurat_care_assignment.Service.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatController {

    @Autowired
    private Chat chatService;

    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody MessageRequest request) {

        String incomingMessage = request.getMessage();


        System.out.println("Received message: " + incomingMessage);


        String response = chatService.getReply(incomingMessage);

        return response;
    }
}

