package day44_lambda.send_message_task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person p1 = new Person("Sasha", 18, Gender.FEMALE);
        list.add(p1);

        list.add(new Person("Stanislav", 25, Gender.MALE));
        list.add(new Person("Alisher", 36, Gender.MALE));
        list.add(new Person("Alexandr", 22, Gender.MALE));
        list.add(new Person("Vlad", 26, Gender.MALE));
        list.add(new Person("Samanta", 44, Gender.FEMALE));
        list.add(new Person("Elvira", 19, Gender.FEMALE));
        System.out.println(list);

        personPredicate isRightCriteria = s -> s.getGender().equals(Gender.MALE) && s.getAge() >= 18 && s.getAge() <= 25;

        sendMessage(list, isRightCriteria);

    }
    public static void sendMessage(List<Person> list, personPredicate i) {
        List<Person> checkedList = new ArrayList<>();
        for (Person person : list) {
            if (i.checkCriteria(person)) {
                checkedList.add(person);
            }
        }
        System.out.println(checkedList);
    }
}
