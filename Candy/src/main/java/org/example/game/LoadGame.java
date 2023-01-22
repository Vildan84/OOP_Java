package org.example.game;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

public class LoadGame {

    private final HashMap<String, String> map = new HashMap<>();

    public void readJson(String path){
        JSONParser parser = new JSONParser();

        try{
            Reader reader = new FileReader(path);

            Object jsonObj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) jsonObj;

            String nameOne = (String) jsonObject.get("NameOne");
            map.put("NameOne", nameOne);
            String nameTwo = (String) jsonObject.get("NameTwo");
            map.put("NameTwo", nameTwo);
            String remainCandies = (String) jsonObject.get("RemainCandies");
            map.put("RemainCandies", remainCandies);
            String maxCandiesToTake = (String) jsonObject.get("MaxCandiesToTake");
            map.put("MaxCandiesToTake", maxCandiesToTake);

            reader.close();

        }catch (IOException | ParseException e){
            e.printStackTrace();
        }

    }

    public HashMap<String, String> getMap(){
        return this.map;
    }


}
