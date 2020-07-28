import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create a new school
        School vln = new School(new ArrayList<>(), new ArrayList<>(), "vln", 39, 1);
        //Add 10 new students to the school
        vln.addStudent(new Student("Angel","Ace", 1));
        vln.addStudent(new Student("Ben", "Beau", 2));
        vln.addStudent(new Student("Col","Calm", 3));
        vln.addStudent(new Student("Dan", "Dat", 4));
        vln.addStudent(new Student("Elsa","Eng", 5));
        vln.addStudent(new Student("Fed", "Fun", 6));
        vln.addStudent(new Student("Gen","Gas", 7));
        vln.addStudent(new Student("Han", "Hu", 8));
        vln.addStudent(new Student("Ian","Ivy", 9));
        vln.addStudent(new Student("Jay", "Ji", 10));
        //Add 3 new teachers to the school
        vln.addTeacher(new Teacher("Ken", "Kay","Computer"));
        vln.addTeacher(new Teacher("Luna", "Lone", "Law"));
        vln.addTeacher(new Teacher("May","Mop","Math"));
        //Print out all the teachers and students
        System.out.println("Teachers: ");
        vln.showTeach();
        System.out.println("Students: ");
        vln.showStud();
        //Remove 2 students(6th and last student) and 1 teacher from the list(second teacher)
        vln.removeStud(vln.getStudents().get(5));
        vln.removeStud(vln.getStudents().get(8));
        vln.removeTeacher(vln.getTeachers().get(1));
        //Display both lists
        System.out.println("\nAfter removed:\nTeachers: ");
        vln.showTeach();
        System.out.println("Students:");
        vln.showStud();
    }
}
