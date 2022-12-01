package day28_tasks.Person;

import com.sun.source.tree.IfTree;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if (name == null){
            return "Uknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 120){
            System.err.println("Incorrect age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender == 'F')){
            System.err.println("Incorrect gender");
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Incorrect Date Of Birth");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }



    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
