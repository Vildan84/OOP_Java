package org.example;

import java.util.Scanner;
public class Creator {
    public static Films input() {
        Scanner scan = new Scanner(System.in);
        String name, producer, genre, year;
        System.out.println("Введите название: ");
        name = scan.nextLine();
        System.out.println("Введите имя режисёра: ");
        producer = scan.nextLine();
        System.out.println("Введите название жанра: ");
        genre = scan.nextLine();
        System.out.println("Введите год выпуска: ");
        year = scan.nextLine();
        return new Films(name, producer, genre, year);
    }

}
