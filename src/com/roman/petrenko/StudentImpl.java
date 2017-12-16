package com.roman.petrenko;

public class StudentImpl extends Observer {

    public StudentImpl(HobbyFootball hobbyFootball) {
        this.hobbyFootball = hobbyFootball;
        this.hobbyFootball.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Goals " + hobbyFootball.getGoal());
    }


}
