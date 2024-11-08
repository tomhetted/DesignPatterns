package org.example.structural.adapter;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        CardReader cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();
    }

}
