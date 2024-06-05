package com.company.martialArts;

public class Judo extends MartialArts {
    private int numOfThrows;

    public Judo() {
        super("Judo");
    }

    @Override
    public void makeMove() {
        System.out.println("Judo: performing a throw");
        numOfThrows++;
    }

    @Override
    public String getReport() {
        return "Judo: numOfThrows = " + numOfThrows;
    }
}
