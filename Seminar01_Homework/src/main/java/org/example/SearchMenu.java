package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class SearchMenu {
    Search sh = new Search();
    Scanner scan = new Scanner(System.in);
    public void searching(HashSet<Films> films){
        System.out.println("--------------------/////---------------------");
        System.out.println("Введите название фильма или Имя режиссёра или год или жанр: ");
        String text = scan.nextLine();
        sh.searchBy(films, text);
    }
}
