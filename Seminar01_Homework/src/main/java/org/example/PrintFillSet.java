package org.example;

import java.util.HashSet;


public class PrintFillSet {

    public void print(HashSet<Films> fl){

        for (Films element: fl){
            System.out.println("--------------------/////---------------------");
            while(element.hasNext()){
                System.out.println(element.next());
            }

        }
    }

    public HashSet<Films> setFilm(HashSet<Films> set, Films film){
        set.add(film);
        return set;
    }
}
