public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.gpa = 0.0;
    }

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getData() {
        return "ID: " + this.id + ", Student: " + this.name + " " +
                this.surname + ", GPA: " + this.gpa;
    }

}
