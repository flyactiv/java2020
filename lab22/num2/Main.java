package ru.mirea.lab22.num2;

import java.util.*;

public class Main {
    private static List<Student> students;

    private static Student searchStudent(String name) throws NotFound {
        return students.stream().filter(a -> a.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new NotFound(name));
    }

    private static void sortByGpa(){
        students.sort(new SortingStudents());
    }


    public static void main(String[] args)  {
        students = Arrays.asList(
                new Student(1, 5, "Charlie"),
                new Student(2, 3.5, "Tomas"),
                new Student(3, 4, "Michael"),
                new Student(4, 4.7, "Richard"),
                new Student(5, 4.4, "Alex"),
                new Student(6, 3.2, "Grigory")
        );

        System.out.println(students);
        sortByGpa();

        try {
            Student s = searchStudent("Charlie");
            System.out.println(s);
            searchStudent("Georgy");
        } catch (NotFound e){
            System.out.println(e.toString());
        }

        System.out.println(students);
    }
}