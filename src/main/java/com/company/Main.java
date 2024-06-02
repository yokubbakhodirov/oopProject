package com.company;

public class Main {
    public static void main(String[] args) {
        Participant participant = new Participant("john", "hopkins", "001020304");
        Karate karate = new Karate();
        karate.addSchedule("10:00-12:00", "odd");
        karate.addSchedule("12:00-14:00", "even");

        boolean res = karate.register("10:00-12:00", "odd", participant);
        System.out.println(res);
    }
}
