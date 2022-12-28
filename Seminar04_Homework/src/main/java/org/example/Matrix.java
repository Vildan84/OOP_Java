package org.example;

/**
 * Класс Matrix принимает значания Start, Finish и формирует матрицу
 */
public class Matrix {

    public Integer[][] fillMatrix(Point start, Point finish){
        int col = 20;
        int row = 10;
        Integer[][] matrix = new Integer[row][col];
        int rows = matrix.length;
        int column = matrix[1].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                if(start.check(i, j)){
                    matrix[i][j] = start.getIndex();
                }
                else if(finish.check(i, j)){
                    matrix[i][j] = finish.getIndex();
                }
                else{
                    matrix[i][j] = 0;
                }

            }
        }

        return matrix;
    }




}
