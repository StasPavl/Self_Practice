package day21_tasks;

public class MultiArr {
    public static void main(String[] args) {
        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};
        //arr10
        for (String[][][][][][][][][] arr9D : array) {
            for (String[][][][][][][][] arr8D : arr9D) {
                for (String[][][][][][][] arr7D : arr8D) {
                    for (String[][][][][][] arr6D : arr7D) {
                        for (String[][][][][] arr5D : arr6D) {
                            for (String[][][][] arr4D : arr5D) {
                                for (String[][][] arr3D : arr4D) {
                                    for (String[][] arr2D : arr3D) {
                                        for (String[] arr1D : arr2D) {
                                            for (String element : arr1D) {
                                                System.out.println(element);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


