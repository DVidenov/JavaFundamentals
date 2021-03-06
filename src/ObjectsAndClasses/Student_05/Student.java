package ObjectsAndClasses.Student_05;

public class Student {
    private String firstName;
    private String secondName;
    private double grade;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getGrade() {
        return grade;
    }

    public Student(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", firstName, secondName, grade);
    }
}
