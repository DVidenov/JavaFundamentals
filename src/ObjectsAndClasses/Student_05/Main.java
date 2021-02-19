package ObjectsAndClasses.Student_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String studentData = scanner.nextLine();
            String firstName = studentData.split(" ")[0];
            String secondName = studentData.split(" ")[1];
            double grade = Double.parseDouble(studentData.split(" ")[2]);

            Student student = new Student(firstName, secondName, grade);
            students.add(student);
        }
        System.out.println(students);
    }
}
