package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Karate extends MartialArts {
    private String info;
    private Map<String, List<Participant>> participants;

    public Karate() {
        participants = new HashMap<>();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void addSchedule(String time, String day) {
        String schedule = time + " " + day;
        participants.put(schedule, new ArrayList<>());
    }

    public List<String> getSchedules() {
        return new ArrayList<>(participants.keySet());
    }

    public List<Participant> getParticipants(String schedule) {
        return participants.get(schedule);
    }

    public List<Participant> getParticipants() {
        List<Participant> allParticipants = new ArrayList<>();
        participants.values().forEach(allParticipants::addAll);
        return allParticipants;
    }

    @Override
    public boolean register(String time, String day, Participant participant) {
        boolean result = false;

        for (Map.Entry<String, List<Participant>> entry : participants.entrySet()) {
            String[] schedule = entry.getKey().split(" ");

            if (schedule[0].equals(time) && schedule[1].equals(day)) {
                entry.getValue().add(participant);
                result = true;
            }
        }
        return result;
    }
}
