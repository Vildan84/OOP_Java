package org.example.service;

import java.util.Random;

public class WhoFirst {

    public static Integer whoFirst(){
        Random random = new Random();
        return random.nextInt(2);
    }
}
