package org.example.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextCaretaker caretaker = new TextCaretaker();

        editor.type("Hello, ");
        caretaker.save(editor);

        editor.type("world!");
        caretaker.save(editor);

        System.out.println("Current text " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After undo " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After another undo " + editor.getText());

        caretaker.undo(editor);
    }
}
