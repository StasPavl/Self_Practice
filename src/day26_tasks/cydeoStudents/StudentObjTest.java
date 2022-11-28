package day26_tasks.cydeoStudents;

public class StudentObjTest {
    public static void main(String[] args) {
        Student student1 = new Student("Stanislav Pavlovskyi", 29,'M',"E43",28,12);
        student1.attendClass();
        student1.printProgLanguage();
        student1.printSchoolName();

        System.out.println(student1);
    }
}
