package org.example;

import org.example.airline.Attendant;
import org.example.airline.Flight;
import org.example.airline.Language;
import org.example.airline.Pilot;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight("123", new Pilot(), new Pilot(), List.of(), Language.ENGLISH);
        flight.isReadyForTakeOff();

        Flight flight2 = new Flight("1234", new Pilot(), new Pilot(), List.of(
                new Attendant(),
                new Attendant(),
                new Attendant()
        ), Language.ENGLISH);
        flight2.isReadyForTakeOff();
    }

}