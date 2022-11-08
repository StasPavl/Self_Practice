package day19_tasks;

    public class ClassmatesTwo {
        public static void main(String[] args) {
            String[] classmates = {"Lilia Desyatnikov", "Olga Alexandropoulos", "Mili Mitic","Asel Akmatova","Najib Mohiby","Ugi Uyanga","Fatima Mahmood",
                    "Ilya Murayeu","Stanislav Pavlovskyi","Akram Salim"};
            String name ="";
            String reverseName = "";

            for (int i = 0; i < classmates.length; i++) {
                name = classmates[i] + " "; // Mili Mitic 10
                for (int j = name.length()-1; j>=0; j--){
                    char ch = name.charAt(j);
                    reverseName += ch;
                }

            }
            System.out.println(reverseName);

        }
    }
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */

