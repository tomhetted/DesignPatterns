package org.example.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    void sendMessage(String messahe, User user);
    void addUser(User user);
}

class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Не отправлять сообщение самому себе
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}