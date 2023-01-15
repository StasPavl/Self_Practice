package quiz;

public class OrderDriver {
    public static void main(String[] args) {
        System.out.println(Order.result + " ");
        System.out.println(Order.result + " ");

        new Order();
        new Order();
        System.out.println(Order.result + " ");
    }

}
class Order {
    static String result = "";

    {
        result+= "c";
    }

    static {
        result += "u";
    }
    static {
        result += "r";
    }
}
