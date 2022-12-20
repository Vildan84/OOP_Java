package org.example;

import java.util.ArrayList;

public class PrintTree {

    public static void print(ArrayList<Knee> list){
        int gen = 0;
        for (Knee k: list){
            gen++;
            for (Node n: k.getList()){
                System.out.printf("Gen: %d, %s\n", gen, n.name);
            }
        }
    }
}
