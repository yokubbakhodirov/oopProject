package com.company.martialArts;

public abstract class MartialArts {
    private String name;

    public MartialArts(String name) {
        this.name = name;
    }

    public abstract void makeMove();

    public abstract String getReport();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
