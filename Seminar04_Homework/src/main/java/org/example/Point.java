package org.example;

/**
 * Класс Point принимает значения строки, колонки и хранит индекс ячейки матрицы
 */
public class Point {

    int col, row, index;

    Point(int r, int c, int index){
        this.col = c;
        this.row = r;
        this.index = index;
    }

    public Integer getCol(){
        return this.col;
    }
    public Integer getRow(){
        return this.row;
    }
    public Integer getIndex(){ return this.index;}
    public boolean  check(int i, int j){
        return this.row == i && this.col == j;
    }
    public boolean evel(Point p){
        return this.row == p.getRow() && this.col == p.getCol();
    }
    public void getInfo(){
        System.out.printf("Row: %d Col: %d Index: %d\n", this.row, this.col, this.index);
    }
}
