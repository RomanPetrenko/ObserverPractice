package com.roman.petrenko;
import java.util.*;

public class HobbyFootball {

    private int goal;
    private List<Observer> observersList = new ArrayList<>();

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observersList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer: observersList) {
            observer.update();
        }
    }

}
