package JavaCodePractice;

public class FinRa {
    // int[] numbers = {1 to 30}


    public static String finra(int[] numbers) {
        String result = "";

        for (int each : numbers) {
// if each number reminder by 3 equals zro and each number reminder by 5 not equals zero, so we change that number to FIN with space at the end
            if (each % 3 == 0 && each % 5 != 0) {
                result += "FIN ";

            } else if (each % 3 != 0 && each % 5 == 0) {
                result += "RA ";

            } else if (each % 3 == 0 && each % 5 == 0) {
                result += "FINRA ";

            } else {
                result += each + " ";
            }
        }
        return result;
    }


}
