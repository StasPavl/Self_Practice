package replids;

public class CatAndDog {
    public static void main(String[] args) {
        String str = "cat dog dog";
        int countCat = 0;
        int countDog = 0;

        while (str.contains("cat")){
            countCat++;
            str = str.replaceFirst("cat","");
        }
        while (str.contains("dog")){
            countDog++;
            str = str.replaceFirst("dog","");
        }
        if (countDog==countCat){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
