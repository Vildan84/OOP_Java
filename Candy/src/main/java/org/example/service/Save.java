package org.example.service;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Save {

    public void saveToJson(JSONObject obj, String path){

        try {

            FileWriter file = new FileWriter(path);
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
