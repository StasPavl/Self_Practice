package day18_tasks;

public class ContactObjectTest {
    public static void main(String[] args) {

        Contact contact1 = new Contact();
        contact1.setInfo("Stanislav Pavlovskyi","3014331866","lichfb@gmail.com");
        contact1.call();
        contact1.sendMessage();
        contact1.sendEmail();

        System.out.println(contact1);
    }
}
