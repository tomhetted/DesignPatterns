package org.example.behavioral.mediator;

abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}

// Конкретная реализация пользователя
class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Конкретная реализация пользователя — администратор
class AdminUser extends User {
    public AdminUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Admin " + name + " broadcasts: " + message);
        mediator.sendMessage("[SYSTEM MESSAGE]: " + message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Admin " + name + " received: " + message);
    }
}