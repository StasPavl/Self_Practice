package day26_tasks.cydeoStudents;

public class Student {
    public String name;
    public int age;
    public char gender;
    public String id;
    public int batchNumber;
    public int groupNumber;


    public static String schoolName = "CYDEO";
    public static String magicWord = "Wooden Spoon";
    public static String language = "Java";

    public Student(String name, int age, char gender, String id, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
    public void study(){
        System.out.println(name + " studing Java");
    }
    public void attendClass() {
        System.out.println(name + " attends classes");
    }
    public void printSchoolName(){
        System.out.println("School name: "+ schoolName);
    }
    public void printProgLanguage(){
        System.out.println("Language is " + language);
    }

}
