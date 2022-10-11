package day08_tasks;

public class CydeoBatch {
    public static void main(String[] args) {


        String batchType = "US morning";
        String result;

        System.out.println("Solution 1: If Statement");


        if (batchType == "US morning" || batchType == "US evening" || batchType == "EU") {
            if (batchType == "US morning") {
                result = "Class times are 10-5 EST. M, T, Th, F.";
            } else if (batchType == "US evening") {
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            } else {
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        } else {
            result = "Invalid Batch";
        }
        System.out.println(result);
        System.out.println("--------------------------");


        System.out.println("Solution 2: Switch Statement");

        switch (batchType) {
            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result = "Invalid Batch";
        }
        System.out.println(result);

        System.out.println("----------------------");

        System.out.println("Solution 3: If Statement and Switch Statement");

        if (batchType == "US morning" || batchType == "US evening" || batchType == "EU") {
            switch (batchType) {
                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        } else {
            result = "Invalid Batch";
        }
        System.out.println(result);
    }
}
/*
If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"
 */