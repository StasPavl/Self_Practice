package replids;

public class Replace {
    public static void main(String[] args) {
        String str = "abc hi abc";
        int count =0;
        while(str.contains("hi")){
            count++;
            str = str.replaceFirst("hi","");
        }
        System.out.println(count);

    }
}

