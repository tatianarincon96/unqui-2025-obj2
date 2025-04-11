package ar.edu.unq.po2.tp3.equipodetrabajo;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String name;
    private String lastName;
    private int age;

    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
