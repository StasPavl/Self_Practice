package randomPractice;

public class StaticDemo {
    static String n1 = examName("O");
    {
        examName("A");
    }
    static {
        examName("C");
    }
    public static String examName(String str){
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
    }
}
