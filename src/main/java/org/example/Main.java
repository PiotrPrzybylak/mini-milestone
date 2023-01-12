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

        Flight flight = new Flight("123", new Pilot(true), new Pilot(true), List.of(), ENGLISH);
        flight.isReadyForTakeOff();

        Flight flight2 = new Flight("1234", new Pilot(true), new Pilot(false), List.of(
                new Attendant(Set.of(ENGLISH, GERMAN)),
                new Attendant(Set.of(ENGLISH, GERMAN)),
                new Attendant(Set.of(GERMAN))
        ), ENGLISH);
        flight2.isReadyForTakeOff();
    }

}