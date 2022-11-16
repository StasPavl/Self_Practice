package utilities;

import java.util.Arrays;

public class ArrayUtility {
    public static int[]swapArr(int[]arr, int indexOfI, int indexOfJ){
        int[] new_array = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            if (i < indexOfI) {
                new_array[i] = arr[i];
            } else if (i == indexOfI) {
                new_array[i] = arr[indexOfJ];
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }
    public static char[]swapArr(char[]arr, int indexOfI, int indexOfJ){
        char[] new_array = new char[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            if (i < indexOfI) {
                new_array[i] = arr[i];
            } else if (i == indexOfI) {
                new_array[i] = arr[indexOfJ];
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }
    public static String[]swapArr(String[]arr, int indexOfI, int indexOfJ){
        String[] new_array = new String[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            if (i < indexOfI) {
                new_array[i] = arr[i];
            } else if (i == indexOfI) {
                new_array[i] = arr[indexOfJ];
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }
    public static double[]swapArr(double[]arr, int indexOfI, int indexOfJ){
        double[] new_array = new double[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            if (i < indexOfI) {
                new_array[i] = arr[i];
            } else if (i == indexOfI) {
                new_array[i] = arr[indexOfJ];
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }

    public static int[] insertArrArr(int[] arr, int indexOf, int element) {


        int[] new_array = new int[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {

            if (i < indexOf) {
                new_array[i] = arr[i];
            } else if (i == indexOf) {
                new_array[i] = element;
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }
    public static double[] insertArr(double[] arr, int indexOf, double element) {


        double[] new_array = new double[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {

            if (i < indexOf) {
                new_array[i] = arr[i];
            } else if (i == indexOf) {
                new_array[i] = element;
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }
    public static char[] insertArr(char[] arr, int indexOf, char element) {


        char[] new_array = new char[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {

            if (i < indexOf) {
                new_array[i] = arr[i];
            } else if (i == indexOf) {
                new_array[i] = element;
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }
    public static String[] insertArr(String[] arr, int indexOf, String element) {


        String[] new_array = new String[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {

            if (i < indexOf) {
                new_array[i] = arr[i];
            } else if (i == indexOf) {
                new_array[i] = element;
            } else {
                new_array[i] = arr[i - 1];
            }
        }
        return new_array;
    }

    public static int[] replaceAllArr(int[] arr, int oldElement, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static String[] replaceAllArr(String[] arr, String oldElement, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static char[] replaceAllArr(char[] arr, char oldElement, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static double[] replaceAllArr(double[] arr, double oldElement, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static int[] replaceOneArr(int[]arr, int indexOf, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if (i == indexOf){
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static char[] replaceOneArr(char[]arr, int indexOf, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if (i == indexOf){
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static double[] replaceOneArr(double[]arr, int indexOf, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if (i == indexOf){
                arr[i] = newElement;
            }
        }
        return arr;
    }
    public static String[] replaceOneArr(String[]arr, int indexOf, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if (i == indexOf){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }
    public static double[] merge(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }
    public static char[] merge(char[] arr1, char[] arr2){

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }
    public static String[] merge(String[] arr1, String[] arr2){

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static int[] reverse(int[] array){

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }
    public static double[] reverse(double[] array){

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }
    public static char[] reverse(char[] array){

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }
    public static String[] reverse(String[] array){

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }

    public static int[] addElement(int[] array, int element){
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }
    public static double[] addElement(double[] array, double element){
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }
    public static char[] addElement(char[] array, char element){
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }
    public static String[] addElement(String[] array, String element){
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }

    public static boolean contains(int[] array, int element){

        for (int each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }
    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }
    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }
    public static boolean contains(String[] array, String element){

        for (String each : array) {
            if(each.equals( element )){
                return true;
            }
        }

        return false;
    }
}
