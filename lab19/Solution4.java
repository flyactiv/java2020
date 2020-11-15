package ru.mirea.lab19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Solution4 {

    public static void main(String[] args)  {
        String filePath = "C:/Users/Александра/IdeaProjects/Lab1/src/ru/mirea/lab19/test.txt";
        String text = "" +
                "Hello world!\n";

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
