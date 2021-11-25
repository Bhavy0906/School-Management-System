import java.io.*;
import java.util.*;

public class Student extends User {

    private String name;
    private String password;
    private String id;
    private double totalMarks;
    private int calculateAttendence;
    private String grades;

    public Student ()
    {
        
    }

    public Student (String id, String name, String password)
    {
        this.name = name;
        this.id = id;
        this.password = password;
        FileManagement fm = new FileManagement();
        try {
            fm.loginInput(this.id, this.password, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        totalMarks = 0;
        calculateAttendence = 0;
        grades = "NC";
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
        System.out.println("The total marks scored by the student is :- " + getMarks());
        System.out.println("The total attendence of the student is :- " + getAttendence());
        System.out.println("The grades of the student is :- " + getGrades());
    }
    
}
