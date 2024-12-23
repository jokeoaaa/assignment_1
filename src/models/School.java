package models;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Student> students =new ArrayList<>();
    private ArrayList<Teacher> teachers =new ArrayList<>();

    public School (String name) {
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        String result = "School: "+name+"\n";
        result += "Students:\n";
        for (Student student : students) {
            result += student + "\n";
        }
        result += "Teachers:\n";
        for (Teacher teacher : teachers) {
            result += teacher + "\n";
        }
        return result;
    }

}
