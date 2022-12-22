package org.example;

import java.util.Iterator;

public class Films implements Iterator<String>, Comparable<Films> {
    String name, producer, genre, year;

    Films(String name, String producer, String genre, String year){

        this.name = name;
        this.producer = producer;
        this.genre = genre;
        this.year = year;
    }

    public String getYear(){
        return year;
    }
    public String getName(){
        return name;
    }
    public String getProducer(){
        return producer;
    }
    public String getGenre(){
        return genre;
    }

    public String getInfo() {
        return String.format("Название: %s\nРежиссёр: %s\nЖанр: %s\nГод: %s", name, producer,
                genre, year);
    }

    public boolean containsText(String text){
        if (this.name.length() >= text.length() && this.name.substring(0, text.length()).equalsIgnoreCase(text)){
            return true;
        }
        else if(this.producer.length() >= text.length() && this.producer.substring(0, text.length()).equalsIgnoreCase(text)){
            return true;
        }
        else if(this.year.length() >= text.length() && this.year.substring(0, text.length()).equalsIgnoreCase(text)){
            return true;
        }
        else return this.genre.length() >= text.length() && this.genre.substring(0, text.length()).equalsIgnoreCase(text);
    }

    int index;
    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        return switch (index) {
            case 1 -> String.format("Name: %s", name);
            case 2 -> String.format("Producer: %s", producer);
            case 3 -> String.format("Genre: %s", genre);
            default -> String.format("Year: %s", year);
        };
    }

    @Override
    public int compareTo(Films o) {

        if(this.year.matches("\\d+") && o.year.matches("\\d+")){
            return Integer.compare(Integer.parseInt(this.year), Integer.parseInt(o.year));
        }
        else return 0;
    }
}
