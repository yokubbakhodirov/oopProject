package com.company;

import com.company.martialArts.Judo;
import com.company.martialArts.Karate;
import com.company.martialArts.MartialArts;
import com.company.participant.Participant;

public class Main {
    public static void main(String[] args) {
        MartialArts karate = new Karate();
        MartialArts judo = new Judo();

        Participant participant1 = new Participant("john", "hopkins", "123", karate);
        Participant participant2 = new Participant("anne", "hopkins", "123", judo);

        participant1.exercise();
        participant2.exercise();

        System.out.println("participant1.getProgress() = " + participant1.getProgress());
        System.out.println("participant2.getProgress() = " + participant2.getProgress());
    }
}
