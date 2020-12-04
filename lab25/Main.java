package ru.mirea.lab25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    private static void num1(){
        Calendar calendar = new GregorianCalendar(2000, Calendar.MAY, 10);
        Student student = new Student(1, 4.5, "Ivanov", calendar.getTime());
        System.out.println(student.toString("yyyy-MM-dd"));
    }
    private static void num2(){
        System.out.print("Введите дату в формате год-месяц-число часы:минуты\n");
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = df.parse(dateStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(df.format(date));
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    private static void num3(){
        Calendar calendar = new GregorianCalendar(2020, Calendar.NOVEMBER, 14, 15, 0);
        Date dateTake = calendar.getTime();
        Date dateDone = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("Стоянова \nДата получения: " + df.format(dateTake) + "\nДата сдачи: " + df.format(dateDone));
    }
    public static void main(String[] args){
        num1();
        num2();
        num3();
    }
}
