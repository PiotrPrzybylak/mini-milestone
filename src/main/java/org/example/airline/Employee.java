package org.example.airline;

import java.time.LocalDate;

public abstract class Employee {

    private final String name;

    private final LocalDate dateOfBirth;

    public Employee(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
