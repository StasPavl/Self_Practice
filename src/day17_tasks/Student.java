package day17_tasks;

public class Student {
    public String firstName;
    public String lastName;
    public char gender;
    public int age;
    public String studentId;
    public char grade;
    public boolean isFullTime;

    public void setInfo(String firstName, String lastName, char gender, int age, String studentId, char grade, boolean isFullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }
    public void study(){
        System.out.println("Student " + firstName + " " + lastName + "(" + studentId + ") is studying right now");
    }
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
