package day18_tasks;

public class CharWithHighestFrequancy {
    public static void main(String[] args) {
        String str = "aaaabbccccddeeee";
        int maxNum = -2147483648;
        String result = "";

        /*
        SOLUTION PLAN:
        1.find max repeating of char
        2.change max number to max repeating of char
        3.create another loop which going to compare maxNum(repeating of char) to count of repeating char in another loop
        4. if are equals print them
         */

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxNum) {
                maxNum = count;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    if (maxNum == count && !result.contains("" + ch)) {
                        result += ch + "\n";
                    }
                }
            }


        }
        System.out.println(result);

    }
}

/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"
		output:
			c
			e
 */

