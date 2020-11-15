package ru.mirea.lab19;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine());

        while (true)
        {
            String data = reader.readLine();
            if(data.equals("exit")){
                outputStream.write(data.getBytes());
                break;
            }
            else {
                outputStream.write((data +"\r\n").getBytes());
            }
        }
        outputStream.close();
        reader.close();
    }
}
