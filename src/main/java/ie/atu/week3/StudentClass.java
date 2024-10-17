package ie.atu.week3;


public class StudentClass {

    // Private Fields
    private String name;
    private String email;
    private String course;

    // Default Constructor (no arguments)
    public StudentClass() {
    }

    // Constructor with only the name parameter
    public StudentClass(String name) {
        this.name = name;
    }

    // Constructor with name, email, and course parameters
    public StudentClass(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

