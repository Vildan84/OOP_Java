package org.example;

public class Main {
    public static void main(String[] args){

        Point start = new Point(1, 15, 1);
        Point finish = new Point(9, 1, -9);
        Way way = new Way();
        Matrix m = new Matrix();
        Logic log = new Logic();

        Integer[][] matrix = m.fillMatrix(start, finish);
        Wall.createHorizontWall(matrix, 3, 6);
        Wall.createVerticalWall(matrix, 15, 5);
        Wall.createVerticalWall(matrix, 2, 5);
        Wall.createVerticalWall(matrix, 11, 6);

        System.out.println("Заполненная матрица");
        log.move(matrix, start);
        Printer.printMatrix(matrix);

        System.out.println();

        System.out.println("Проложенная дорога");
        way.wayToStart(matrix, finish);
        Printer.printMatrix(matrix);

    }
}