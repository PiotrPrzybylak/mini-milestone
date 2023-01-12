package org.example.airline;

public class Pilot {

    private boolean hasAnalogCompass;

    public Pilot(boolean hasAnalogCompass) {
        this.hasAnalogCompass = hasAnalogCompass;
    }

    public void awardWithACompass() {
        if (hasAnalogCompass) {
            throw new RuntimeException("This pilot already has a compass");
        }
        hasAnalogCompass = true;
    }
}
