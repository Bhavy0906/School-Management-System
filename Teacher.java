
/**
 * Teacher
 */

import java.io.*;
import java.util.*;

public class Teacher extends User {
    private String name;
    private String id;
    private String password;
    Set<String> idOfStudents = new TreeSet<String>();
    private String marks;
    private String grades;
    private String attendence;
    TreeMap<String, String[]> detailMap = new TreeMap<>();

    public Teacher() {

    }

    public Teacher(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        FileManagement fm = new FileManagement();
        try {
            fm.loginInput(this.id, this.password, 2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        marks = "";
        grades = "NC";
        attendence = "";
    }

    public void basicDetails() {
        System.out.println("Hello " + name);
        System.out.println("Welcome to the school");
        System.out.println("Enter 1 for ");
    }

    void idOfStudent() {
        idOfStudents = getIDStudent();
    }

    void setDetails(String id, String[] course, String[] marks)throws IOException{
        // String[] details = {course, marks, grade, attendence};
        // detailMap.put(id, details);
        FileManagement fm = new FileManagement();
        fm.detailsInputStudent(id, name, course, marks, attendence);
    }   

    public void getDetails ()throws IOException
    {
        FileManagement fm = new FileManagement();
        String str = fm.infoReader(id, 2);
        int index[] = new int[4];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ',') {
                index[count] = i;
                count++;
            }
        }
        System.out.println("Name of the teacher is :- " + str.substring(index[1], index[2]));
        System.out.println("Id of the teacher is :- " + this.id);
        System.out.println("The couses taught by the teacher are :- " );
        for (int i = 1; i < 4; i++)
        {
            System.out.println(str.substring(index[i], index[i + 1]));
        }
    }
    

}