package org.example.airline;

import java.time.LocalDate;
import java.util.Set;

public class Attendant extends Employee {

    private final Set<Language> languages;

    public Attendant(String name, LocalDate dateOfBirth, Set<Language> languages) {
        super(name, dateOfBirth);
        this.languages = Set.copyOf(languages);

    }

    public boolean isReady(Language language) {
        return languages.contains(language);
    }
}
