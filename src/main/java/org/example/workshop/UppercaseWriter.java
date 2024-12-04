package org.example.workshop;

import java.io.*;

public class UppercaseWriter {
    public static void main(String[] args) {

        // Используется FileInput(Output)Stream
//        try (FileInputStream inputStream = new FileInputStream("src/resources/source.txt");
//             FileOutputStream outputStream = new FileOutputStream("src/resources/result.txt", true)) {
//
//            int data;
//            while ((data = inputStream.read()) != -1) {
//                outputStream.write(Character.toUpperCase((char) data));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // Используется BufferedReader(Writer)
        try (BufferedReader reader = new BufferedReader(new FileReader("src/resources/source.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/result.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
