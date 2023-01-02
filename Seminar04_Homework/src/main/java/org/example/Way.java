package org.example;


/**
 * Класс Way содержит логику построения кратчайшего пути от финиша к старту, обозначение 99
 */
public class Way {

    Point step;
    public void wayToStart(Integer[][] matrix, Point finish){

        int minIndex = 1000;

        if(finish.getCol() - 1 >= 0 && matrix[finish.getRow()][finish.getCol() - 1] > 0) {
            minIndex = matrix[finish.getRow()][finish.getCol() - 1];
            step = new Point(finish.getRow(), finish.getCol() - 1, minIndex);
        }
        if(finish.getRow() - 1 >= 0 && finish.getCol() - 1 >= 0 &&
                matrix[finish.getRow() - 1][finish.getCol() - 1] < minIndex &&
                matrix[finish.getRow() - 1][finish.getCol() - 1] > 0) {
            minIndex = matrix[finish.getRow() - 1][finish.getCol() - 1];
            step = new Point(finish.getRow() - 1, finish.getCol() - 1, minIndex);
        }
        if(finish.getRow() - 1 >= 0 && matrix[finish.getRow() - 1][finish.getCol()] < minIndex &&
                matrix[finish.getRow() - 1][finish.getCol()] > 0) {
            minIndex = matrix[finish.getRow() - 1][finish.getCol()];
            step = new Point(finish.getRow() - 1, finish.getCol(), minIndex);
        }
        if(finish.getRow() - 1 >= 0 && finish.getCol() + 1 < matrix[1].length &&
                matrix[finish.getRow() - 1][finish.getCol() + 1] < minIndex &&
                matrix[finish.getRow() - 1][finish.getCol() + 1] > 0) {
            minIndex = matrix[finish.getRow() - 1][finish.getCol() + 1];
            step = new Point(finish.getRow() - 1, finish.getCol() + 1, minIndex);
        }
        if(finish.getCol() + 1 < matrix[1].length && matrix[finish.getRow()][finish.getCol() + 1] < minIndex &&
                matrix[finish.getRow()][finish.getCol() + 1] > 0){
            minIndex = matrix[finish.getRow()][finish.getCol() + 1];
            step = new Point(finish.getRow(), finish.getCol() + 1, minIndex);
        }
        if(finish.getRow() + 1 < matrix.length && finish.getCol() + 1 < matrix[1].length &&
                matrix[finish.getRow() + 1][finish.getCol() + 1] < minIndex &&
                matrix[finish.getRow() + 1][finish.getCol() + 1] > 0) {
            minIndex = matrix[finish.getRow() + 1][finish.getCol() + 1];
            step = new Point(finish.getRow() + 1, finish.getCol() + 1, minIndex);
        }
        if(finish.getRow() + 1 < matrix.length && matrix[finish.getRow() + 1][finish.getCol()] < minIndex &&
                matrix[finish.getRow() + 1][finish.getCol()] > 0){
            minIndex = matrix[finish.getRow() + 1][finish.getCol()];
            step = new Point(finish.getRow() + 1, finish.getCol(), minIndex);
        }
        if(finish.getRow() + 1 < matrix.length && finish.getCol() - 1 >= 0 &&
                matrix[finish.getRow() + 1][finish.getCol() - 1] < minIndex &&
                matrix[finish.getRow() + 1][finish.getCol() - 1] > 0) {
            minIndex = matrix[finish.getRow() + 1][finish.getCol() - 1];
            step = new Point(finish.getRow() + 1, finish.getCol() - 1, minIndex);
        }

        int index = step.getIndex();
        matrix[step.getRow()][step.getCol()] = 99;

        while(index > 2){

            if(step.getCol() - 1 >= 0 && matrix[step.getRow()][step.getCol() - 1] == index - 1){
                step = new Point(step.getRow(), step.getCol()  - 1, index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            else if(step.getRow() - 1 >= 0 && matrix[step.getRow() - 1][step.getCol()] == index - 1){
                step = new Point(step.getRow() - 1, step.getCol(), index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            else if(step.getCol() + 1 < matrix[1].length && matrix[step.getRow()][step.getCol() + 1] == index - 1){
                step = new Point(step.getRow(), step.getCol()  + 1, index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            else if(step.getRow() + 1 < matrix.length && matrix[step.getRow() + 1][step.getCol()] == index - 1){
                step = new Point(step.getRow() + 1, step.getCol(), index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            else if(step.getRow() - 1 >= 0 && step.getCol() - 1 >= 0 &&
                    matrix[step.getRow() - 1][step.getCol() - 1] == index - 1){
                step = new Point(step.getRow() - 1, step.getCol() - 1, index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            else if(step.getRow() - 1 >= 0 && step.getCol() + 1 < matrix[1].length &&
                    matrix[step.getRow() - 1][step.getCol() + 1] == index - 1){
                step = new Point(step.getRow() - 1, step.getCol() + 1, index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            else if(step.getRow() + 1 < matrix.length && step.getCol() + 1 < matrix[1].length &&
                    matrix[step.getRow() + 1][step.getCol() + 1] == index - 1){
                step = new Point(step.getRow() + 1, step.getCol() + 1, index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            else if(step.getRow() + 1 < matrix.length && step.getCol() - 1 >= 0 &&
                    matrix[step.getRow() + 1][step.getCol() - 1] == index - 1){
                step = new Point(step.getRow() + 1, step.getCol() - 1, index - 1);
                matrix[step.getRow()][step.getCol()] = 99;
            }
            index--;
        }
    }
}
