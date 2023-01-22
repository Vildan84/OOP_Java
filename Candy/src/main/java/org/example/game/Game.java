package org.example.game;

import java.util.Scanner;

import org.example.config.Config;
import org.example.service.CheckNumber;
import org.example.service.Save;
import org.example.service.View;
import org.example.service.WhoFirst;
import org.json.simple.JSONObject;

public class Game {

    JSONObject object = new JSONObject();
    String path = "/home/vildan/IdeaProjects/OOP_Java/Candy/src/main/resources/data.json";
    Save save = new Save();

    public void game(Config config, View view){

        object.put("NameOne", config.getPlayerOneName());
        object.put("NameTwo", config.getPlayerTwoName());
        object.put("RemainCandies", String.valueOf(config.getRemainCandies()));
        object.put("MaxCandiesToTake", String.valueOf(config.getMaxCandiesToTake()));

        int choice = WhoFirst.whoFirst();
        int winNumber = 0;
        String[] names = new String[]{config.getPlayerOneName(), config.getPlayerTwoName()};
        int numberOfCandies = config.getRemainCandies();
        int maxNumberToTake = config.getMaxCandiesToTake();
        int minCandiesToTake = config.getMinCandiesToTake();
        Scanner scan = new Scanner(System.in);


        while(!(numberOfCandies == 1)){
                System.out.println(view.nextMove(names[choice], numberOfCandies));
                String number = scan.nextLine();
                while(!CheckNumber.ifNumber(number) || Integer.parseInt(number) > maxNumberToTake ||
                Integer.parseInt(number) < minCandiesToTake || Integer.parseInt(number) >= numberOfCandies){
                    System.out.println(view.error());
                    number = scan.nextLine();
                }
                numberOfCandies -= Integer.parseInt(number);
                object.put("RemainCandies", String.valueOf(numberOfCandies));
                save.saveToJson(object, path);

                if(choice == 0){
                    choice = 1;
                    winNumber = 0;
                }
                else {
                    choice = 0;
                    winNumber = 1;
                }
        }
        System.out.println("/////////////////////////////////");
        System.out.println(view.win(names[winNumber]));
    }
}
