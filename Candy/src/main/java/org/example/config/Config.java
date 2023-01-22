package org.example.config;

public class Config {

    private String playerOneName = "Player1";
    private String playerTwoName = "Player2";
    private int remainCandies = 150;
    private int maxCandiesToTake = 28;
    private int minCandiesToTake = 1;

    Config(String name1, String name2, int allCandies, int maxCandies){
        this.playerOneName = name1;
        this.playerTwoName = name2;
        this.remainCandies = allCandies;
        this.maxCandiesToTake = maxCandies;
    }

    Config(String name1, String name2, int allCandies){
        this.playerOneName = name1;
        this.playerTwoName = name2;
        this.remainCandies = allCandies;
    }

    Config(String name1, String name2){
        this.playerOneName = name1;
        this.playerTwoName = name2;
    }

    public Config(){
    }


    public int getRemainCandies(){
        return this.remainCandies;
    }

    public int getMaxCandiesToTake(){
        return this.maxCandiesToTake;
    }

    public int getMinCandiesToTake(){
        return this.minCandiesToTake;
    }

    public void setRemainCandies(int number){
        this.remainCandies = number;
    }

    public String getPlayerOneName(){
        return this.playerOneName;
    }

    public String getPlayerTwoName(){
        return this.playerTwoName;
    }
}
