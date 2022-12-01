package day28_tasks.Person;

import java.time.LocalDate;

public class PersonTestObj {
    public static void main(String[] args) {
        Person person1 = new Person("Stanislav", 29, 'M', LocalDate.of(1993,2,10));

        System.out.println(person1);
    }
}
