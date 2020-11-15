package ru.mirea.lab19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution2 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/Александра/IdeaProjects/Lab1/src/ru/mirea/lab19/test.txt"));
        for (String line; (line = br.readLine()) != null;) {
            System.out.print(line);
        }
        br.close();
    }
}
