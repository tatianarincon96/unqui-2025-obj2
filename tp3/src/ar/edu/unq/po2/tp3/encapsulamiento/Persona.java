package ar.edu.unq.po2.tp3.encapsulamiento;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String name;
    private LocalDate birthDate;

    public Persona(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public boolean menorQue(Persona persona) {
        return this.getAge() < persona.getAge();
    }
}
