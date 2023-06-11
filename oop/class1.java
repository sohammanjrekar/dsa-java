package oop;

public class class1 {
    public static void main(String[] args) {
        Student soham = new Student(13, "soham manjrekar", 52.16);
        System.out.println(soham.rollno);
    }

}

class Student {
    int rollno;
    String name;
    double marks;

    public Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}
