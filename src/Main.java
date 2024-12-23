import models.School;
import models.Student;
import models.Teacher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);
        File file = new File("src/students.txt");
        Scanner scanner = new Scanner(file);

        School group = new School("Hogwarts");
        int years=10;
        double percent=100;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            String genderString = parts[3];
            List<Integer> grades=new ArrayList<Integer>();
            for (int i = 4; i < parts.length; i++){
                grades.add(Integer.parseInt(parts[i]));
            }
            Student student = new Student(name, surname, age, genderString, grades);
            group.addStudent(student);
        }
        file = new File("src/teachers.txt");
        scanner=new Scanner(file);
        while (scanner.hasNext()){
            Teacher teacher = new Teacher(scanner.next(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
            group.addTeacher(teacher);
        }
        System.out.println(group);

        for (Student student : group.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " has a GPA of " + student.calcGpa());
        }
        System.out.println("\n");
        for (Teacher teachers : group.getTeachers()) {
            teachers.giveRaise(years, percent);
            String raised = teachers.isRaised(years) ? ("'s salary have raised to " + teachers.getSalary()) : "'s salary still the same at " + teachers.getSalary();
            System.out.println(teachers.getName() + " " + teachers.getSurname() + raised);;
        
        }
    }

}