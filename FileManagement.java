import java.io.*;

public class FileManagement {

    // The class will contain the basic code of file initiation and usage.
    // Just copy paste it to the relevant portions.

    // Format of the file storing UserID and Password
    // UserID
    // Password
    // Even places have User ID and Odd places have password

    // Will return the file name in which the the login details would be stored
    public String typeTXT(int ch) {
        if (ch == 1)
            return "Student.txt";
        if (ch == 2)
            return "Teacher.txt";
        if (ch == 3)
            return "Admin.txt";
        return "";
    }

    //Admin class login details
    final public void adminDetails ()throws IOException
    {
        Writer out = null;
        String str = "Admin333031" + "\n" + "User@123";
        try {
            out = new FileWriter("Admin.txt");
            out.write(str);
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    // Will return the file name in which the basic details of the students and
    // teacher will be stored.
    public String typeCSV(int ch) {
        if (ch == 1)
            return "StudentInfo.csv";
        if (ch == 2)
            return "TeacherInfo.csv";
        return "";
    }

    // Creates empty .csv files of Student and Teacher storing the details of them
    public void emptyCsvFileCreation(int choice) throws IOException {
        Writer out = null;
        String str = "";
        try {
            out = new FileWriter(typeCSV(choice));
            out.write(str);
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    // Creates empty .txt files of student, teacher and admin storing the login
    // details
    public void emptyTxtFileCreation(int choice) throws IOException {
        Writer out = null;
        String str = "";
        try {
            out = new FileWriter(typeTXT(choice));
            out.write(str);
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    // Writes the basic details of the student into a .csv file
    public void detailsInputStudent(String userID, String name, String[] course, int[] marks, int attendence,
            double grades, int choice) throws IOException {
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter(typeCSV(choice), true));
            out.write(userID + "," + name + "," + attendence);
            for (int i = 0; i < 5; i++) {
                out.write(course[i] + "," + Integer.toString(marks[i]) + ",");
                grades = grades + marks[i];
            }
            grades = grades / 5;
            out.write(Double.toString(grades));
            // Will write the details into the .csv file in the format:-
            // UserID Name Attendence Course[i] Marks[i] Grades
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    // Writes the basic details of the teacher into a .csv file
    public void detailsInputTeacher(String userID, String name, String[] course, int choice) throws IOException {
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter(typeCSV(choice), true));
            out.write(userID + "," + name + ",");
            for (int i = 0; i < 3; i++) {
                out.write(course[i] + ",");
            }
            // Will write the details into the .csv file in the format:-
            // UserID Name Course[i]
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    // Writes the login details of the student, teacher and admin into a .txt file
    public void loginInput(String userID, String password, int choice) throws IOException {
        // choice denotes the values assigned to student, teacher, and admin
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter(typeTXT(choice), true));
            out.write(userID + "\n");
            out.write(password + "\n");
            // Will write the UserID and Password to the file and will store them
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    public String infoReader (String userID, int choice)throws IOException{
        BufferedReader input = null;
        String name = typeCSV(choice);
        String str = "";
        try {
            input = new BufferedReader(new FileReader(name));
            while ((str = input.readLine()) != null)
            {
                int len = userID.length();
                String sub = str.substring(0, len);
                if (sub.equals(userID))
                return str;
            }
        } catch (Exception e) {
            System.err.println(e);
            input.close();
        }
        return "";
    }

    public String loginSearch(String userID, int choice) throws IOException {
        BufferedReader input = null;
        String name = typeTXT(choice);
        String str = "";
        try {
            input = new BufferedReader(new FileReader(name));
            while ((str = input.readLine()) != null) {
                if (str.equals(userID))
                    return input.readLine();
                    // input.close();
            }
        } catch (Exception e) {
            System.err.println(e);
            input.close();
        }
        return "";
    }

}
