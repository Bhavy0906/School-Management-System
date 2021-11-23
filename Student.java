import java.io.*;
import java.util.*;

public class Student extends User {

    private String name;
    private String id;
    private double totalMarks;
    private int calculateAttendence;
    private String grades;

    public Student (String name, String id)
    {
        this.name = name;
        this.id = id;
        User.student.put(id, name);
        totalMarks = 0;
        calculateAttendence = 0;
        grades = "";
    }

    public double getMarks ()
    {
        return totalMarks;
    }

    public int getAttendence ()
    {
        return calculateAttendence;
    }

    public String getGrades ()
    {
        return grades;
    }

    public void getDetails ()
    {
        System.out.println("Name of the student is :- " + this.name);
        System.out.println("Identity number of the student is :- " + this.id);
        System.out.println("The total marks scored by the student is :- " + this.totalMarks);
        System.out.println("The total attendence of the student is :- " + this.calculateAttendence);
        System.out.println("The grades of the student is :- " + this.grades);
    }
    
}
