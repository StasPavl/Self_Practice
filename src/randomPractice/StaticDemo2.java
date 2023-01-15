package randomPractice;

public class StaticDemo2 {
    StaticDemo2 sd = new StaticDemo2();
    void method1(){
        method4();
        StaticDemo2.method2();
       // StaticDemo2.method3();
    }
    static void method2(){}
    void method3(){
        method1();
        method2();
        sd.method4();
    }
    static void method4(){}
}
