public class Student extends User {
    private double gpa;
    private String[] courses = new String[100];
    private int indexOfCourses = 0;

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }


    // Add a course to the courses array
    public void addCourse(String course) {
        if (indexOfCourses < courses.length) {
            courses[indexOfCourses++] = course;
        }
    }

    // Getter and setter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getData() {
        return super.getData() + ", GPA: " + gpa + ", Courses: " + String.join(", ", java.util.Arrays.copyOf(courses, indexOfCourses));
    }
}


