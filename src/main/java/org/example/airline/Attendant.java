package org.example.airline;

import java.util.Set;

public class Attendant {

    private final Set<Language> languages;

    public Attendant(Set<Language> languages) {
        this.languages = Set.copyOf(languages);
    }

}
