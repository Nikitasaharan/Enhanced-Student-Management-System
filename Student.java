package model;

public class Student {
    private Integer rollNo;   // Wrapper class
    private String name;
    private String email;
    private String course;
    private Double marks;     // Wrapper class
    private String grade;

    public Student(Integer rollNo, String name, String email, String course, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        return "D";
    }

    public Integer getRollNo() { return rollNo; }
    public Double getMarks() { return marks; }

    public void display() {
        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
