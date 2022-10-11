package day08_tasks;

public class Browser {
    public static void main(String[] args) {
        String browserName = "chrome";

        switch (browserName) {
            case "chrome":
                System.out.println("Chrome Browser is selected");
                break;
            case "opera":
                System.out.println("Opera Browser is selected");
                break;
            case "safari":
                System.out.println("Safari Browser is selected");
                break;
            case "edge":
                System.out.println("Edge Browser is selected");
                break;
            default:
                System.out.println("Invalid Browser Name");
        }
    }
}
