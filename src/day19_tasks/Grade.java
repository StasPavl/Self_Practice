package day19_tasks;

public class Grade {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah",};
        int [] scores = {90, 75, 80,};
        char [] grades = new char[names.length];


        //SOLUTION 2
        for (int i = 0; i < names.length; i++) {
            switch (scores[i]){
                case 90:
                    grades[i] = 'A';
                    break;
                case 80:
                    grades[i] = 'B';
                    break;
                default:
                    grades[i] = 'C';
                    break;
            }
            System.out.println(names[i] + "`s scores is " + scores[i] + ", and grade is " + grades[i]);
        }




        //SOLUTION 1
     /*   grades[0] = 'A';
        grades[1] = 'C';
        grades[2] = 'B';
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "`s scores is " + scores[i] + ", and grade is " + grades[i]);*/
    }

}
/*
given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];
         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
         			score >=90 == A
         			score <90 && score >=80 == B
         			score <80 == C
 */

