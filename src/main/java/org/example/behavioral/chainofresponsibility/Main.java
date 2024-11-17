package org.example.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        RequestHandler employee = new EmployeeHandler();
        RequestHandler manager = new ManagerHandler();
        RequestHandler director = new DirectorHandler();

        // Устанавливаем цепочку: employee -> manager -> director
        employee.setNextHandler(manager);
        manager.setNextHandler(director);

        // Запросы с разным уровнем доступа
        Request lowLevelRequest = new Request(Priority.BASIC);
        Request midLevelRequest = new Request(Priority.INTERMEDIATE);
        Request highLevelRequest = new Request(Priority.CRITICAL);

        System.out.println("Processing low-level request:");
        employee.handleRequest(lowLevelRequest); // Ожидается обработка Employee

        System.out.println("\nProcessing mid-level request:");
        employee.handleRequest(midLevelRequest); // Ожидается обработка Manager

        System.out.println("\nProcessing high-level request:");
        employee.handleRequest(highLevelRequest); // Ожидается обработка Director

        System.out.println("\nProcessing null request:");
        employee.handleRequest(null); // Обработка null-запроса
    }
}
