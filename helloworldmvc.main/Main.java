package fr.exia;

import java.io.IOException;

public class Main {
    public static void main(final String[] args) throws IOException {
        String file = "Helloworld.txt";

        try {
            String fileContent = DAOHelloWorld.readFile(file);
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}