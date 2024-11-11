package org.example.behavioral.command;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }

    public static void main(String[] args) {
        // Создаем объекты света и команд
        Light livingRoomLight = new Light("Living Room");

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Настраиваем пульт управления
        RemoteControl remote = new RemoteControl();

        // Включаем свет
        remote.setCommand(lightOn);
        remote.pressButton(); // "Living Room light is ON"

        // Выключаем свет
        remote.setCommand(lightOff);
        remote.pressButton(); // "Living Room light is OFF"

        // Отменяем последнее действие
        remote.pressUndo(); // "Living Room light is ON" (так как отмена включает свет)
    }
}
