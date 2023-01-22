package org.example.config;

import java.util.HashMap;

public class SetConfig {

    public Config setConfig(HashMap<String, String> map){
        String nameOne = map.get("NameOne");
        String nameTwo = map.get("NameTwo");
        String remainCandies = map.get("RemainCandies");
        String maxCandiesToTake = map.get("MaxCandiesToTake");
        return new Config(nameOne, nameTwo, Integer.parseInt(remainCandies),
                Integer.parseInt(maxCandiesToTake));
    }
}
