package ru.mirea.lab22.num2;

public class Student {
    private int id;
    private double gpa;
    private String name;

    public Student(int id, double gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }


    @Override
    public String toString() {
        return "Student{" +
                "Id=" + id +
                ", GPA=" + gpa +
                ", Name='" + name + '\'' +
                '}';
    }

}