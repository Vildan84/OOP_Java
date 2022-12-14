package org.example;


public class Films {
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

}
