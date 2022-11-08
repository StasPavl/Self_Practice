package day19_tasks;

public class Classmates {

        public static void main(String[] args) {
            String[] classmates = {"Lilia Desyatnikov", "Olga Alexandropoulos", "Mili Mitic","Asel Akmatova","Najib Mohiby","Ugi Uyanga","Fatima Mahmood",
                    "Ilya Murayeu","Stanislav Pavlovskyi","Akram Salim"};

            String name ="";

            for (int i = 0; i < 10; i++) {
                name = classmates[i];
                //name = "Mili Mitic"
                System.out.println(name.charAt(0) + "." + name.charAt(name.indexOf(" ") +1) + ".");

            }

        }
    }
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
