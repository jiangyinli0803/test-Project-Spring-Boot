package org.example.testprojectspringboot.Controller;

import org.example.testprojectspringboot.Model.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    Message message1 = new Message("001", "Max", "Call me back when you have time.");
    Message message2 = new Message("002", "John", "Have a nice day.");
    Message message3 = new Message("003", "William", "See you on weekend");
    List<Message> messages = new ArrayList<>(Arrays.asList(message1, message2, message3));

    @GetMapping
    public List<Message> getMessages() {
        return messages;
    }

    @PostMapping
    public List<Message> addMessage(@RequestBody Message message) {
        messages.add(message);
        return messages;
    }

    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable String id) {
        boolean removed = messages.removeIf(m -> m.getId().equals(id));
        if (removed) {
            return "The message with id " + id + " is deleted.";
        } else {
            return  "Message with id " + id + " not found.";
        }
    }





}
