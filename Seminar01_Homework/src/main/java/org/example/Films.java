package org.example;


import java.util.Iterator;

public class Films implements Iterator<String > {
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
        return String.format("Название: %s; Режиссёр: %s; Жанр: %s; Год: %s", name, producer,
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
        else if(this.genre.length() >= text.length() && this.genre.substring(0, text.length()).equalsIgnoreCase(text)){
            return true;
        }
        else{
            return false;
        }
    }

    int index;
    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index){
            case 1: return String.format("Name: %s", name);
            case 2: return String.format("Producer: %s", producer);
            case 3: return String.format("Genre: %s", genre);
            default: return String.format("Year: %s", year);
        }
    }
}
