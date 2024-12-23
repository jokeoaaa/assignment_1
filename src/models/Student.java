package models;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private int id;
    private List<Integer> grades;
    private static int id_gen = 1;

    private void generateId() {
        id = id_gen++;
    }

    public Student(String name, String surname, int age, String genderString, List<Integer> grades) {
        super(name, surname, age, genderString);
        generateId();
        this.grades = new ArrayList<>(grades);
    }
    public double calcGpa() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    public void addGrades(List<Integer> newGrades) {
        grades.addAll(newGrades);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return super.toString() + "I am student with ID "+id +".";
    }
}