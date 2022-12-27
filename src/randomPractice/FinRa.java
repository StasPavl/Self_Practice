package randomPractice;

public class FinRa {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        FinRa obj = new FinRa();
        System.out.println(obj.FINRA(numbers));

    }

        public String FINRA(int[] numbers) {


            String result = "";
            for (int each : numbers) {


                if (each % 3 == 0 && !(each % 5 == 0)) {
                    result += "FIN ";
                } else if (!(each % 3 == 0) && each % 5 == 0) {
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
