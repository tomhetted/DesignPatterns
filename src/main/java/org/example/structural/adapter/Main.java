package org.example.structural.adapter;

public class Main {

    public static void main(String[] args) {
        CardReader cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();
    }

}
