package org.example;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Класс Logic содержит логику заполнения матрицы волновым алгоритмом
 */

public class Logic {

    Deque<Point> deque = new LinkedList<>();

    public Integer[][] move(Integer[][] matrix, Point start){
        Point step = start;
        deque.add(step);
        matrix[step.getRow()][step.getCol()] = step.getIndex();

        while (!deque.isEmpty()){
            step = deque.pollFirst();

            if(step.getCol() - 1 >= 0 && matrix[step.getRow()][step.getCol() - 1] == 0){
                matrix[step.getRow()][step.getCol() - 1] = step.getIndex() + 1;
                deque.add(new Point(step.getRow(), step.getCol() - 1, step.getIndex() + 1));
            }
            if(step.getCol() - 1 >= 0 && step.getRow() - 1 >= 0 && matrix[step.getRow() - 1][step.getCol() - 1] == 0){
                matrix[step.getRow() - 1][step.getCol() - 1] = step.getIndex() + 1;
                deque.add(new Point(step.getRow() - 1, step.getCol() - 1, step.getIndex() + 1));
            }
            if(step.getRow() - 1 >= 0 && matrix[step.getRow() - 1][step.getCol()] == 0){
                matrix[step.getRow() - 1][step.getCol()] = step.getIndex() + 1;
                deque.add(new Point(step.getRow() - 1, step.getCol(), step.getIndex() + 1));
            }
            if(step.getCol() + 1 < matrix[1].length && step.getRow() - 1 >= 0 &&
                    matrix[step.getRow() - 1][step.getCol() + 1] == 0){
                matrix[step.getRow() - 1][step.getCol() + 1] = step.getIndex() + 1;
                deque.add(new Point(step.getRow() - 1, step.getCol() + 1, step.getIndex() + 1));
            }
            if(step.getCol() + 1 < matrix[1].length && matrix[step.getRow()][step.getCol() + 1] == 0){
                matrix[step.getRow()][step.getCol() + 1] = step.getIndex() + 1;
                deque.add(new Point(step.getRow(), step.getCol() + 1, step.getIndex() + 1));
            }
            if(step.getCol() + 1 < matrix[1].length && step.getRow() + 1 < matrix.length &&
                    matrix[step.getRow() + 1][step.getCol() + 1] == 0){
                matrix[step.getRow() + 1][step.getCol() + 1] = step.getIndex() + 1;
                deque.add(new Point(step.getRow() + 1, step.getCol() + 1, step.getIndex() + 1));
            }
            if(step.getRow() + 1 < matrix.length && matrix[step.getRow() + 1][step.getCol()] == 0){
                matrix[step.getRow() + 1][step.getCol()] = step.getIndex() + 1;
                deque.add(new Point(step.getRow() + 1, step.getCol(), step.getIndex() + 1));
            }
            if(step.getCol() - 1 >= 0 && step.getRow() + 1 < matrix.length &&
                    matrix[step.getRow() + 1][step.getCol() - 1] == 0){
                matrix[step.getRow() + 1][step.getCol() - 1] = step.getIndex() + 1;
                deque.add(new Point(step.getRow() + 1, step.getCol() - 1, step.getIndex() + 1));
            }
        }

        return matrix;
    }
}
