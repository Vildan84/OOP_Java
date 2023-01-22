package org.example.game;

import org.example.config.Config;
import org.example.config.GetConfig;
import org.example.config.SetConfig;
import org.example.service.View;

import java.util.Scanner;

public class App {

    Scanner scan = new Scanner(System.in);
    Config config = new Config();
    View view = new View();
    String path = "/home/vildan/IdeaProjects/OOP_Java/Candy/src/main/resources/data.json";

    public void app(){
        System.out.println("////////////////////");
        System.out.println("1/Start game\n2/Configuration\n3/Load game\n4/Quit");
        System.out.println("Choose item: ");
        boolean flag = true;

        while(flag){
            String number = scan.nextLine();

            switch (number){
                case("1") -> {
                    Game game = new Game();
                    game.game(config, view);
                    app();
                }
                case("2") -> {
                    GetConfig manualConfig = new GetConfig();
                    manualConfig.getConfig();
                    SetConfig newConfig = new SetConfig();
                    config = newConfig.setConfig(manualConfig.getHashMap());
                    app();

                }
                case("3") -> {
                    LoadGame load = new LoadGame();
                    load.readJson(path);
                    SetConfig newConfig = new SetConfig();
                    config = newConfig.setConfig(load.getMap());
                    app();

                }
                case("4") -> flag = false;
                default -> System.out.println(view.error());
            }
        }



    }
}
