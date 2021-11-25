import java.io.*;
import java.util.*;

public class Student extends User {

    private String name;
    private String password;
    private String id;
    private String[] course;
    // private double totalMarks;
    // private int calculateAttendence;
    // private String grades;

    public Student() {

    }

    public Student(String id, String name, String password, String[] course) throws IOException {
        this.name = name;
        this.id = id;
        this.password = password;
        this.course = course;
        FileManagement fm = new FileManagement();
        fm.loginInput(this.id, this.password, 1);
        String[] marks = { "0", "0", "0", "0", "0"};
        fm.detailsInputStudent(this.id, this.name, this.course, marks, 1, 1);
    }

    // public double getMarks() {
    //     return totalMarks;
    // }

    // public int getAttendence() {
    //     return calculateAttendence;
    // }

    // public String getGrades() {
    //     return grades;
    // }

    public static void getDetails(String id) throws IOException {
        FileManagement fm = new FileManagement();
        String str = fm.infoReader(id, 1);
        int index[] = new int[13];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ',') {
                index[count] = i;
                count++;
            }
        }
        System.out.println("Name of the student is :- " + str.substring(index[0], index[1]));
        System.out.println("Identity number of the student is :- " + id);
        for (int i = 2; i < 11; i = i + 2) {
            System.out.println("Course of the student and marks obtained in it are :- "
                    + str.substring(index[i], index[i + 1]) + " " + str.substring(index[i + 1], index[i + 2]));
        }
        System.out.println("The total attendence of the student is :- " + str.substring(index[1], index[2]));
        System.out.println("The grades of the student is :- " + str.substring(index[12]));
    }

}
