package com.roman.petrenko;

public class Main {

    public static void main(String[] args) {
        HobbyFootball football = new HobbyFootball();
        new StudentImpl(football);

        System.out.println("The team scored 3 goals");
        football.setGoal(3);
    }
}
