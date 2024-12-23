package models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String genderString;



    public Person(String name, String surname, int age, String genderString) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setGenderString(genderString);
    }

    private String getGenderString() {
        return genderString;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGenderString(String genderString) {
        this.genderString = genderString;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return genderString;
    }

    @Override
    public String toString() {
        return "Hi, I am "+name+" "+surname+", a "+age+" year old "+genderString+".";
    }
}
