import java.io.*;
import java.util.*;
import com.opencsv.*;
import com.opencsv.exceptions.CsvException;

public class FileManagement {
    public int row = -1;
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

    // Admin class login details
    // final public void adminDetails ()throws IOException
    // {
    // Writer out = null;
    // String str = "Admin333031" + "\n" + "User@123";
    // try {
    // out = new FileWriter("Admin.txt");
    // out.write(str);
    // } catch (Exception e) {
    // System.err.println(e);
    // }
    // out.close();
    // }

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
    public void detailsInputStudent(String userID, String name, String[] course, String[] marks, int attendence,
            int choice) throws IOException {
        Writer out = null;
        double grades = 0;
        try {
            out = new BufferedWriter(new FileWriter(typeCSV(choice), true));
            out.write(userID + "," + name + "," + attendence + ",");
            for (int i = 0; i < 5; i++) {
                out.write(course[i] + "," + marks[i] + ",");
                grades = grades + Integer.parseInt(marks[i]);
            }
            grades = grades / 5;
            out.write(Double.toString(grades) + "\n");

            // Will write the details into the .csv file in the format:-
            // UserID Name Attendence Course[i] Marks[i] Grades
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    public void studentInfoAppend(String userID, String course, int marks) throws IOException {
        // int row = 0;
        try {
            String str = "";
            str = infoReader(userID, 1);
            String columns[] = str.split(",");
            Index index = new Index();
            int col = index.findIndex(columns, course);
            updateCSV("StudentInfo.csv", marks, row, col + 1);
            // while ((str = input.readLine()) != null)
            // {
            // row++;
            // int len = userID.length();
            // String sub = str.substring(0, len);
            // int index = str.indexOf(",", len);
            // if (sub.equals(userID))
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    // Writes the basic details of the teacher into a .csv file
    public void detailsInputTeacher(String userID, String name, String[] course, int choice) throws IOException {
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter(typeCSV(choice), true));
            out.write("\n" + userID + "," + name + ",");
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

    public String infoReader(String userID, int choice) throws IOException {
        BufferedReader input = null;
        String name = typeCSV(choice);
        String str = "";
        try {
            input = new BufferedReader(new FileReader(name));
            while ((str = input.readLine()) != null) {
                row++;
                int len = userID.length();
                String sub;
                if (str.charAt(0) == '"') {
                    sub = str.substring(1, len + 1);
                } else {
                    sub = str.substring(0, len);
                }
                if (sub.equals(userID))
                    return str;
            }
            input.close();
        } catch (Exception e) {
            System.err.println(e);
            input.close();
        }
        row = -1;
        return "";
    }

    public String loginSearch(String userID, int choice) throws IOException {
        BufferedReader input = null;
        String name = typeTXT(choice);
        String str = "";
        try {
            input = new BufferedReader(new FileReader(name));
            while ((str = input.readLine()) != null) {
                if (str.equals(userID)) {
                    String inp = input.readLine();
                    return inp;
                } else {
                    input.readLine();
                    continue;
                }
            }
            input.close();
        } catch (Exception e) {
            System.err.println(e);
            // input.close();
        }
        return "";
    }

    public void updateCSV(String fileToUpdate, int replace, int row, int col) throws IOException, CsvException {

        // Read existing file
        try {

            String line = "";
            String splitBy = ",";
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(fileToUpdate));
            List<String> body = new ArrayList<>();
            while ((line = br.readLine()) != null) // returns a Boolean value
            {
                body.add(line);
            }
            List<String[]> arrList = new ArrayList<>();
            for (int i = 0; i < body.size(); i++) {
                String[] employee = body.get(i).split(splitBy); // use comma as separator
                arrList.add(employee);
            }
            arrList.get(row)[col] = Integer.toString(replace);
            br.close();
            // // File inputFile = new File("StudentInfo.csv");
            // CSVReader reader = new CSVReader(new FileReader("StudentInfo.csv"));
            // List<String[]> csvBody = reader.readAll();
            // // get CSV row column and replace with by using row and column
            // System.out.println(csvBody.get(row));

            // reader.close();

            // Write to CSV file which is open
            // CSVWriter writer = new CSVWriter(new FileWriter(fileToUpdate));
            // writer.writeAll(arrList);
            // writer.flush();
            // writer.close();
            int len = arrList.size();
            int innerLen = arrList.get(0).length;
            String str = "";
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < innerLen - 1; j = j + 2) {
                    str = str + arrList.get(i)[j] + "," + arrList.get(i)[j + 1] + ",";
                }
                str = str + "\n";
            }
            FileWriter fw = new FileWriter(fileToUpdate);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void deleteEntry(String userID, int choice) throws IOException, CsvException {

        // Read existing file
        try {
            infoReader(userID, choice);
            String fileToUpdate = typeCSV(choice);
            String line = "";
            String splitBy = ",";
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(fileToUpdate));
            List<String> body = new ArrayList<>();
            while ((line = br.readLine()) != null) // returns a Boolean value
            {
                body.add(line);
            }
            List<String[]> arrList = new ArrayList<>();
            for (int i = 0; i < body.size(); i++) {
                String[] employee = body.get(i).split(splitBy); // use comma as separator
                arrList.add(employee);
            }
            arrList.remove(row);
            br.close();
            // // File inputFile = new File("StudentInfo.csv");
            // CSVReader reader = new CSVReader(new FileReader("StudentInfo.csv"));
            // List<String[]> csvBody = reader.readAll();
            // // get CSV row column and replace with by using row and column
            // System.out.println(csvBody.get(row));

            // reader.close();

            // Write to CSV file which is open
            // CSVWriter writer = new CSVWriter(new FileWriter(fileToUpdate));
            // writer.writeAll(arrList);
            // writer.flush();
            // writer.close();
            int len = arrList.size();
            int innerLen = arrList.get(0).length;
            String str = "";
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < innerLen - 1; j = j + 2) {
                    str = str + arrList.get(i)[j] + "," + arrList.get(i)[j + 1] + ",";
                }
                str = str + "\n";
            }
            FileWriter fw = new FileWriter(fileToUpdate);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    // public void detailsInputStudent(String id, String name, String[] course,
    // String[] marks, String attendence) {
    // }

}
