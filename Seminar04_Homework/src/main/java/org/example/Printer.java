package org.example;

public class Printer {

    public static void printMatrix(Integer[][] matrix){

        int column = matrix[1].length;

        for (Integer[] integers : matrix) {
            for (int j = 0; j < column; j++) {
                if (integers[j] < 10 && integers[j] >= 0){
                    System.out.print("0" + integers[j] + "  ");
                }
                else{
                    System.out.print(integers[j] + "  ");
                }

            }
            System.out.println("");
        }
    }
}
