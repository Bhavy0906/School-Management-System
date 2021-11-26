# School-Management-System
Description:-
Basic Information – The code is not in line with the description mentioned by our Teaching Assistant (TA) Pushkal Goyal. The code is a development code with different test cases and procedures, as explained in this file and the uploaded video. Please go through them once to understand the code better.
The GitHub link of the code is Uday-Mi/School-Management-System (github.com)
The code is a multi-class code and has several codes, which are controlled by the Main class.
The code is in Command User Interface (CUI).

The code contains five files, whose names are
Student.txt
Teacher.txt
Admin.txt
StudentInfo.csv
TeacherInfo.csv
All the files will have some basic information, which will be used during the sample video.
The file Admin.txt is a final file, which will not be edited or removed in any case, as it contains the critical information of Admin, who will be running the whole code.
The other two .txt files will contain the login information of the teacher and student.
Only Admin is authorized to create a new user in the form of teacher and student.
Teacher and student will be given their login credentials, which they will use to enter into the system.
They will not be authorized to create their login credentials.
The .csv files will contain information about Teacher and Student, regarding their names, courses they have taken, etc.
These four files are editable, and the TA could play with them as well.
He will have to follow the instructions, which the code will pose, at the runtime.
A special library opencsv-5.5.2.jar has been used. It has been added into the code and the TA is requested to run it once.

Contributions of the team members:-
It is difficult to specially mention each one’s contributions as both of them have worked equally. 
The code was made on Visual Studio Code by Microsoft initially, using the live share feature. When the code’s outline matured, a GitHub repository was created, and each one of them took care of each other’s progress.
Mentioning exclusively, Login.java and Signup.java were made by Bhavy, and Uday made FileManagement.java and Student.java.
However, in these four files as well, both of them worked together.

Class Details:-
Main: Regulate the whole program and interact with the user.
Admin: Stores information about the Admin and acts as a for easing the work of the Admin.
Details: Contains print statements, which need to be printed at each step.
FileManagement: Contains programs that create new files, write into the files, appends the files, edit the files, reads the files, etc.
Index: Contains a linear search function that helps in finding the index of an element
Input: Takes userID and password as input from the user and verifies them on different platforms.
Login: Helps the user to login into the system using valid login credentials.
MapReturn: Returns the treemap of teacher, student, or Admin based on who wants to get into the system.
Signup: Helps the Admin create new signup for a student or teacher who is newly admitted to the school.
Student: Prints the details of the student.
Teacher: Prints the basic details of the teacher and edits the data of the students in the StudentInfo.csv file
Type: Specifies whether the user is a student, teacher, or Admin.
User: Stores the treemap of a student, teacher, and Admin, containing the login information.
