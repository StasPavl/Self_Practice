package day08_tasks;

public class NumberToWord {
    public static void main(String[] args) {

        int num = 1;

        String result;

        result = (num>=0 && num<=9)?
                (num ==0) ? "Zero" :(num == 1)?"One":(num==2)?"Two":(num==3)?"Three"
                :(num==4)?"Four":(num==5)?"Five":(num==6)?"Six"
                :(num==7)? "seven" : (num==8) ? "Eight" : "nine"
        : "invalid number";
        System.out.println(result);
    }
}
