package day04_tasks;

public class ShippingAddress {
    public static void main(String[] args) {

        String fullName = "Stanislav Pavlovskyi";
        int buildingNumber = 1221;
        String streetName = "N Pierce street";
        String cite = "Arlington";
        String state = "VA";
        int zipCode = 22209;

        System.out.println("Your Shipping address is:\n" +
                fullName + "\n" +
                buildingNumber + " " + streetName + "\n" +
                cite + "," + state + " " + zipCode);
    }
}
