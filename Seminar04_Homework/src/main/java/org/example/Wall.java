package org.example;

import java.util.Random;

/**
 * Класс Wall содержит методы для создания горизонтальных и вертикальных препятствий, обозначение -1
 */

public class Wall {
    public static void createHorizontWall(Integer[][] matrix, int row, int number){
        Random rand = new Random();
        int temp = rand.nextInt(0, matrix[1].length / 2);
        if(row < matrix.length){
            int target = temp + number;
            if(target <= matrix[1].length - 1){
                for(int i = temp; i <= target; i++){
                    matrix[row][i] = -1;
                }
            }
            else {
                createHorizontWall(matrix, row, number);
            }
        }
    }

    public static void createVerticalWall(Integer[][] matrix, int col, int number){
        Random rand = new Random();
        int temp = rand.nextInt(0, matrix.length / 2);
        if(col < matrix[1].length){
            int target = temp + number;
            if(target <= matrix.length - 1){
                for(int i = temp; i <= target; i++){
                    matrix[i][col] = -1;
                }
            }
            else {
                createHorizontWall(matrix, col, number);
            }
        }
    }
}
