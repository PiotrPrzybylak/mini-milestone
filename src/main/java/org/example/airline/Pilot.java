package org.example.airline;

import java.time.LocalDate;

public class Pilot extends Employee {

    private boolean hasAnalogCompass;

    public Pilot(String name, LocalDate dateOfBirth, boolean hasAnalogCompass) {
        super(name, dateOfBirth);
        this.hasAnalogCompass = hasAnalogCompass;
    }

    public void awardWithACompass() {
        if (hasAnalogCompass) {
            throw new RuntimeException("This pilot already has a compass");
        }
        hasAnalogCompass = true;
    }

    public boolean isReady() {
        return hasAnalogCompass;
    }
}
