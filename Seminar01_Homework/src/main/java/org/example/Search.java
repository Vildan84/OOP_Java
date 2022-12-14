package org.example;

import java.util.HashSet;

public class Search {
    public void searchBy(HashSet<Films> film, String text) {
        boolean flag = true;
        for (Films fl: film){
            if (fl.containsText(text)){
                System.out.println("--------------------/////---------------------");
                System.out.println(fl.getInfo());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Информация не найдена");
        }
    }
}
