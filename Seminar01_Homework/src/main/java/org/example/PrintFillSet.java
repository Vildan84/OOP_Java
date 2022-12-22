package org.example;

import java.util.HashSet;
import java.util.LinkedList;

import static java.util.Collections.sort;


public class PrintFillSet {

    public void print(HashSet<Films> fl){

        LinkedList<Films> list = new LinkedList<>(fl);
        sort(list);
        for (Films element: list){
            System.out.println("--------------------/////---------------------");
            System.out.println(element.getInfo());
        }
    }

    public HashSet<Films> setFilm(HashSet<Films> set, Films film){
        set.add(film);
        return set;
    }
}
