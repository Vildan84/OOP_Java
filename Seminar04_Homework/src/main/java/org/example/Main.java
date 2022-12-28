package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Point start = new Point(1, 15, 1);
        Point finish = new Point(9, 1, -9);
        Way way = new Way();
        Matrix m = new Matrix();
        Logic log = new Logic();

        Integer[][] matrix = m.fillMatrix(start, finish);
        Wall.createHorizontWall(matrix, 3, 6);
        Wall.createVerticalWall(matrix, 15, 5);
        Wall.createVerticalWall(matrix, 2, 5);

        System.out.println("Заполненная матрица");
        log.move(matrix, start);
        Printer.printMatrix(matrix);

        System.out.println();

        System.out.println("Проложенная дорога");
        way.wayToStart(matrix, finish);
        Printer.printMatrix(matrix);

    }
}