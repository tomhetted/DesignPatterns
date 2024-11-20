package org.example.behavioral.memento;

import java.util.Stack;

public class TextCaretaker {
    private final Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.load(history.pop());
        } else {
            System.out.println("Nothing to undo!");
        }
    }
}
