package com.company.martialArts;

public class Karate extends MartialArts {
    private int numOfPunch;
    private int numOfKick;

    public Karate() {
        super("Karate");
    }

    @Override
    public void makeMove() {
        System.out.println("Karate: Performing a punch and a kick");
        numOfPunch++;
        numOfKick++;
    }

    @Override
    public String getReport() {
        return "Karate: numOfPunch = " + numOfPunch + ", numOfKick = " + numOfKick;
    }
}
