package org.jarurat_care_assignment.Service;


import org.springframework.stereotype.Service;

@Service
public class Chat {

    public String getReply(String message) {

        if (message == null) return "Invalid message";

        message = message.toLowerCase();

        switch (message) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "I don't understand";
        }
    }
}

