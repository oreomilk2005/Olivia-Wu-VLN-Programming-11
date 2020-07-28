import java.util.ArrayList;

public class School {
    //Three fields of my choosing: school name, district number, and number of floors.
    private String schoolName;
    private int districtNum;
    private int floor;
    //Fields that hold ArrayLists of teachers, students, and courses. The course list is an ArrayList of Strings.
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<String> courses;

    //School constructor
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, String schoolName, int districtNum, int floor){
        //Assigning all the fields
        this.teachers = teachers;
        this.students = students;
        this.schoolName = schoolName;
        this.districtNum = districtNum;
        this.floor = floor;
        //Initializing an empty course list
        courses= new ArrayList<>();
        //Checking every teacher. If the subject of the teacher isn't in the course list, then we add the subject into the course list.
        for(Teacher teacher: teachers){
            if(!courses.contains(teacher.getSubject())){
                courses.add(teacher.getSubject());
            }
        }
    }

    //School default constructor
    public School(){
        //Initializing three new empty arraylists for teachers, students, and courses.
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
        //Initializing the fields of school name, district number, and floors to a default value.
        schoolName = "Unknown";
        districtNum = 1;
        floor = 1;
    }

    //Setters and getters for the three fields
    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    public int getDistrictNum() { return districtNum; }
    public void setDistrictNum(int districtNum) { this.districtNum = districtNum; }
    public int getFloor() { return floor; }
    public void setFloor(int floor) {this.floor = floor;}
    //Setters and Getters for Arraylists
    public ArrayList<Teacher> getTeachers() { return teachers; }
    public void setTeachers(ArrayList<Teacher> teachers) { this.teachers = teachers; }
    public ArrayList<Student> getStudents() { return students; }
    public void setStudents(ArrayList<Student> students) { this.students = students; }
    public ArrayList<String> getCourses() { return courses; }
    public void setCourses(ArrayList<String> courses) { this.courses = courses; }

    //Method to add a new teacher into the teacher list with a parameter of a specific teacher object
    public void addTeacher(Teacher teacher){
        //add() method of an ArrayList that adds a teacher to the ArrayList of teachers.
        teachers.add(teacher);
        //If the list of courses does not contain the subject the new teacher teaches, then we add the new teacher's subject into the list of courses.
        if(!courses.contains(teacher.getSubject())){
            courses.add(teacher.getSubject());
        }
    }
    //Method to add a new student to the student list with a parameter of a target student object.
    public void addStudent(Student student){students.add(student);}

    //Method to remove a teacher from the teacher list with a parameter of a target teacher object.
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);//Removes the teacher from the Arraylist of teacher using remove() method of the ArrayList.
        // This is a for-each loop that checks through the teacher list. Another way of writing this is for(int i = teachers.size()-1; i>= 0; i--)
        for(Teacher t: teachers){
        /*If the subject of the removed teacher is the same as another teacher, we do not have to remove the course(there is still a teacher teaching it),
        so we get out of the loop. If no teacher teaches the same subject as the removed teacher, then we remove the subject from the course list.*/
            if(t.getSubject().equals(teacher.getSubject()))return;
        }courses.remove(teacher.getSubject());
    }
    //Method to remove students from the ArrayList of students with a parameter of a target student object.
    public void removeStud(Student student){ students.remove(student); }

    //Method that shows all the teachers. It goes through the list of teachers and print each one out.
    public void showTeach(){ for(Teacher teacher:teachers){ System.out.println(teacher); } }
    //Method that displays all the students. It goes through the list of students and print each one out.
    public void showStud(){ for(Student student:students){ System.out.println(student); } }
}
