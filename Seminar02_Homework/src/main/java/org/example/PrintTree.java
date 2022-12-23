package org.example;

import java.util.ArrayList;

public class PrintTree {
    static ArrayList<String> child = new ArrayList<>();
    public static void print(ArrayList<Knee> list){
        int gen = 0;
        for (Knee k: list){
            gen++;
            System.out.printf("Generation: %s\n", gen);
            for (Node n: k.getList()){
                if(!child.contains(n.name)){
                    child.add(n.name);
                    System.out.print(n.name + "/ ");
                }

            }
            System.out.println("");
        }
    }
}
