import javax.sql.rowset.FilteredRowSet;

public class Student {
    //Fields for first name, last name, grade, and student number
    //modelNum is the student number of the student we are currently at
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNum;
    static int modelNum = 0;

    //Constructor for student. The student number would increase by 1 for every new students.
    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNum = modelNum ++;
    }

    //Default constructor for student that initiate the name to "Unknown Student", grade to 0, and the student number to the next number in the line of the model number.
    public Student(){
        firstName = "Unknown";
        lastName = "Student";
        grade = 0;
        studentNum = modelNum ++;
    }

    //Change the printing format of the student to Name: name Grade: grade
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\tGrade: " + grade;
    }

    //Setters and Getters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getStudentNum() {
        return studentNum;
    }
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

}
