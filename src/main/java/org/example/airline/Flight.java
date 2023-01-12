package org.example.airline;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final static List<String> ids = new ArrayList<>();

    private final String id;

    private final Pilot captain;

    private final Pilot coPilot;

    private final List<Attendant> attendants;

    private final Language language;

    public Flight(String id, Pilot captain, Pilot coPilot, List<Attendant> attendants, Language language) {
        if (ids.contains(id)) {
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

        int attendantsThatAreNotReady = 0;
        for (Attendant attendant : attendants) {
            if (!attendant.isReady(language)) {
                attendantsThatAreNotReady++;
            }
        }

        if (attendantsThatAreNotReady > 0) {
            isReadyForTakeOff = false;
            System.out.println("FAIL: " + attendantsThatAreNotReady+ " attendants are not ready.");
        } else {
            System.out.println("PASS: All attendants ready.");
        }

        if (captain.isReady()) {
            System.out.println("PASS: Captain is ready");
        } else {
            isReadyForTakeOff = false;
            System.out.println("FAIL: Captain is not ready.");
        }

        if (coPilot.isReady()) {
            System.out.println("PASS: Co-pilot is ready");
        } else {
            isReadyForTakeOff = false;
            System.out.println("FAIL: Co-pilot is not ready.");
        }

        System.out.println("Flight " + id + " status: " + isReadyForTakeOff);
        return isReadyForTakeOff;
    }
}
