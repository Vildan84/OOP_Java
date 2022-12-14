package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    PrintFillSet pf = new PrintFillSet();
    SearchMenu sh = new SearchMenu();
    boolean flag = true;
    Films film;
    HashSet<Films> films = new HashSet<>();
    public void menu(){

        while(flag){

            System.out.println("--------------------/////---------------------");
            System.out.println("1. - Добавить фильм в коллекцию\n2. - Посмотреть всю коллекцию\n3. - Поиск фильма\n4. - Выход");
            System.out.println("Выберете пункт меню: ");
            String number = scan.nextLine();
            switch (number){
                case "1" -> {
                    film = Creator.input();
                    pf.setFilm(films, film);
                }
                case "2" -> {
                    pf.print(films);
                }
                case "3" -> {
                    sh.searching(films);
                }
                case "4" -> {
                    flag = false;
                }
                default -> System.out.println("Неверный ввод");
            }
        }
    }
}
