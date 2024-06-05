package com.company.martialArts;

public class Judo extends MartialArts {
    private int numOfThrows;
    private int numOfPins;

    public Judo() {
        super("Judo");
    }

    @Override
    public void makeMove() {
        System.out.println("Judo: performing a throw and a pin");
        numOfThrows++;
        numOfPins++;
    }

    @Override
    public String getReport() {
        return "Judo: numOfThrows = " + numOfThrows + ", numOfPins = " + numOfPins;
    }
}
