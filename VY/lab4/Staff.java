public class Staff extends User {
    private double salary;
    private String[] subjects = new String[100];
    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public void addSubject(String subject) {
        if (indexOfSubject < subjects.length) {
            subjects[indexOfSubject++] = subject;
        }
    }

    // Getter and setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getData() {
        return super.getData() + ", Salary: " + salary + ", Subjects: " + String.join(", ", java.util.Arrays.copyOf(subjects, indexOfSubject));
    }
}


