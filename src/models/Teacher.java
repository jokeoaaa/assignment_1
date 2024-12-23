package models;

public class Teacher extends Person{
    private String subject;
    private int salary;
    private int yearsOfExperience;

    public Teacher(String name, String surname, int age, String genderString, String subject,  int yearsOfExperience, int salary) {
        super(name, surname, age, genderString);
        setSubject(subject);
        setSalary(salary);
        setYearsOfExperience(yearsOfExperience);
    }

    public void giveRaise(int age, double percent){
        if (this.yearsOfExperience > age){;
            this.salary += this.salary * (percent / 100);
        }
    }
    public boolean isRaised(int age){
        if (this.yearsOfExperience > age){
            return true;
        }
        return false;
    }
    public String getSubject() {
        return subject;
    }

    public int getSalary() {
        return salary;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return super.toString() + "I teach "+subject +".";
    }
}
