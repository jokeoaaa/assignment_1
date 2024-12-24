package models;

import java.util.HashMap;
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
        double average = (double) sum / grades.size();

        HashMap<String, Double> gpaScale = new HashMap<>();
        gpaScale.put("A", 4.0);
        gpaScale.put("B", 3.0);
        gpaScale.put("C", 2.0);
        gpaScale.put("D", 1.0);
        gpaScale.put("F", 0.0);

        if (average >= 90) {
            return gpaScale.get("A");
        } else if (average >= 80) {
            return gpaScale.get("B");
        } else if (average >= 70) {
            return gpaScale.get("C");
        } else if (average >= 60) {
            return gpaScale.get("D");
        } else {
            return gpaScale.get("F");
        }
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