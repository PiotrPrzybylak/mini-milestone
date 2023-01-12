package org.example;

import org.example.airline.Attendant;
import org.example.airline.Flight;
import org.example.airline.Pilot;

import java.util.List;
import java.util.Set;

import static org.example.airline.Language.ENGLISH;
import static org.example.airline.Language.GERMAN;

public class Main {
    public static void main(String[] args) {

        Pilot pilot1 = new Pilot(true);
        Pilot pilot2 = new Pilot(false);
        Flight flight = new Flight("123", pilot1, pilot2, List.of(), ENGLISH);
        flight.isReadyForTakeOff();

        pilot2.awardWithACompass();

        Flight flight2 = new Flight("1234", pilot2, pilot1, List.of(
                new Attendant(Set.of(ENGLISH, GERMAN)),
                new Attendant(Set.of(ENGLISH, GERMAN)),
                new Attendant(Set.of(ENGLISH))
        ), ENGLISH);
        flight2.isReadyForTakeOff();
    }

}