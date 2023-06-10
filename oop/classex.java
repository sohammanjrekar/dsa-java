package oop;

public class classex {
    public static void main(String[] args) {
        Student soham = new Student(13, "soham manjrekar", 52.16);
        System.out.println(soham.rollno);
    }

}

class Student {
    int rollno;
    String name;
    double marks;

    Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
