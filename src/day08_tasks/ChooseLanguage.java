package day08_tasks;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Solution 1");
        int numLanguage = 3;

        String result = "";

        result = (numLanguage == 1)?"Hello, thank for your call":(numLanguage == 2)?"Hola, gracias para llamar":
                (numLanguage == 3)?"Merhaba, aradiginiz icin tesekkurler":
                        (numLanguage == 4) ? "Privet, spasibo za vash zvonok":"Merci ,pour votre appel";
        System.out.println(result);

        System.out.println("--------------------------");
        System.out.println("Solution 2");

        switch(numLanguage){
            case 1:
            result = "Hello, thank for your call";
            break;
            case 2 :
            result = "Hola, gracias para llamar";
            break;
            case 3:
            result = "Merhaba, aradiginiz icin tesekkurler";
            break;
            case 4:
            result = "Privet, spasibo za vash zvonok";
            break;
            case 5:
            result = "Merci ,pour votre appel";
            break;
            default:
                result = "Invalid landuade";
        }
        System.out.println(result);
    }
}
