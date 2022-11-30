package quiz.Constructor;

public class test1 {
    public static void main(String[] args) {
        test1 obj = new test1(100);

    }
    public test1(){
        System.out.println("1");

    }
    public test1(int b){
        this();
        System.out.println("3");
    }
    public test1(double a){
        this();

        System.out.println("2");
    }

}
