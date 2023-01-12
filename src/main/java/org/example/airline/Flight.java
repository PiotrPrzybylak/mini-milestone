package org.example.airline;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final static List<String> ids = new ArrayList<>();

    private final String id;

    private final Pilot captain;

    private final Pilot coPilot;

    private final List<Attendant> attendants;

    private Language language;

    public Flight(String id, Pilot captain, Pilot coPilot, List<Attendant> attendants, Language language) {
        if(ids.contains(id)) {
            throw new RuntimeException("Ids need to be unique: " + id);
        }

        this.id = id;
        this.captain = captain;
        this.coPilot = coPilot;
        this.attendants = attendants;
        this.language = language;
    }

    public boolean isReadyForTakeOff() {
        boolean isReadyForTakeOff = true;
        System.out.println("Checking attendants");
        if (attendants.size() != 3) {
            isReadyForTakeOff = false;
            System.out.println("FAIL: " + attendants.size() + " attendants instead of 3.");
        } else {
            System.out.println("PASS: There are 3 attendants.");
        }

        System.out.println("Flight "+ id + " status: " + isReadyForTakeOff);
        return isReadyForTakeOff;
    }
}
