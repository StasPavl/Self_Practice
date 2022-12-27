package JavaCodePractice;

public class DivideWithOut {
    //                      10             2       =      5
    public int divide(int dividend, int devisor){//step 1 and 2 find return type and arguments


        if (devisor == 0){                       // step 3 make sure our second not zero number
            System.err.println("Can not divede by zero");
            System.exit(1);
        }



        boolean isNegativeDividend = false;//step 4 checking ours first and second number if its negative number


        if (dividend < 0){
            isNegativeDividend = !isNegativeDividend; // true
            dividend = -dividend;

        }
        boolean isNegativeDevisor = false;

        if (devisor < 0) {
            isNegativeDevisor = !isNegativeDevisor; // true
            devisor = -devisor;
        }

        int result = 0;//step 5 create int variable for result 5

        while(dividend >= devisor){//step 6 creat while loop with condition  (When first number less then second we are stoping our loop)
            dividend -=devisor;// dividend = dividend - devisor
            result++;
        }

//                true                  false
        if (isNegativeDividend || isNegativeDevisor){//step 6 return our result but before we need to check if its negative
            return -result;
        }else {
            return result;
        }


    }

}

/*
Divide number with out / operator
 */
