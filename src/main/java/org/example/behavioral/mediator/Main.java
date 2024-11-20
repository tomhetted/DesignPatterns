package org.example.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");
        User admin = new AdminUser(chatRoom, "Admin");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(admin);

        user1.sendMessage("Hello, everyone!");
        admin.sendMessage("Please follow the chat rules.");
        user3.sendMessage("Understood, Admin!");
    }
}
