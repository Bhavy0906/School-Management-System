
/**
 * Teacher
 */

import java.io.IOException;
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

    void setDetails(String id, String course, String marks, String grade, String attendence) {
        String[] details = { course, marks, grade, attendence };
        detailMap.put(id, details);
    }

}