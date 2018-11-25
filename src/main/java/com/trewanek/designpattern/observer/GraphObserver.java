package com.trewanek.designpattern.observer;

public class GraphObserver implements Observer {
    public void update(NumberGenerator numberGenerator) {
        int count = numberGenerator.getNumber();
        System.out.print("GraphObserver:");
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }
}