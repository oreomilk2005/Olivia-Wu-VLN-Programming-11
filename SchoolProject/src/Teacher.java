public class Teacher {

    //Fields for first name, last name, and subject
    private String firstName;
    private String lastName;
    private String subject;

    //Constructor for teacher with their name and subject
    public Teacher(String firstName, String lastName, String subject){
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
    }

    //Default constructor where we initiate the first name, last name, and subject of the teacher to "Unknown"
    public Teacher(){
        firstName = "Unknown";
        lastName = "Unknown";
        subject = "Unknown";
    }

    //Let any teacher print out in the fixed format of Name: first name last name   Subject: subject
    public String toString(){ return "Name: " + firstName + " " + lastName + "\tSubject: " + subject;}

    //Setters and getters of the three fields.
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
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

}