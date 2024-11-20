package org.example.behavioral.memento;

// Originator
public class TextEditor {
    private String text = "";

    public String getText() {
        return text;
    }

    public void type(String newText) {
        text += newText;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void load(TextMemento memento) {
        this.text = memento.getText();
    }
}
