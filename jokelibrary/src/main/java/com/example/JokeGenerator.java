package com.example;

import java.util.Random;

public class JokeGenerator {

    public String getJoke(){
        Random random = new Random();
        return "This is Joke No." + random.nextInt(10);
    }
}
