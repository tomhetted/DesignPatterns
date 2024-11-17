package org.example.behavioral.chainofresponsibility;

public interface RequestHandler {
    void handleRequest(Request request);
    void setNextHandler(RequestHandler nextHandler);
}

// Обработчик для обычного сотрудника
class EmployeeHandler implements RequestHandler {

    private RequestHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request == null) {
            System.out.println("Invalid request: Request is null.");
            return;
        }

        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Director handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for the request.");
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

// Обработчик для управляющего
class ManagerHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler next) {
        this.nextHandler = next;
    }

    @Override
    public void handleRequest(Request request) {
        if (request == null) {
            System.out.println("Invalid request: Request is null.");
            return;
        }

        if (request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Manager handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for the request.");
        }
    }
}

// Обработчик для директора
class DirectorHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler next) {
        this.nextHandler = next;
    }

    @Override
    public void handleRequest(Request request) {
        if (request == null) {
            System.out.println("Invalid request: Request is null.");
            return;
        }

        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Director handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for the request.");
        }
    }
}


