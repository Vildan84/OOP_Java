package org.example.service;

public class View {

    public String nextMove(String name, int number){
        return  String.format("Your move: %s; %d candies remain", name, number);
    }

    public String win(String name){
        return String.format("Congratulations %s you Win!!!", name);
    }

    public String error(){
        return "Wrong input, try again";
    }
}
