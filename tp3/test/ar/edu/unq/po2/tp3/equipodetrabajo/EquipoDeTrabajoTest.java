package ar.edu.unq.po2.tp3.equipodetrabajo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipoDeTrabajoTest {

    private EquipoDeTrabajo equipoDeTrabajo;
    private Persona persona1;
    private Persona persona2;
    private Persona persona3;
    private Persona persona4;
    private Persona persona5;

    @BeforeEach
    void setUp() {
        equipoDeTrabajo = new EquipoDeTrabajo("Equipo 1");
        persona1 = new Persona("Juan", "Mendoza",25);
        persona2 = new Persona("Maria", "Leopardo",30);
        persona3 = new Persona("Pedro", "Aguirre",35);
        persona4 = new Persona("Ana", "Ledesma",28);
        persona5 = new Persona("Luis", "Guerrero",40);

        equipoDeTrabajo.addEmployee(persona1);
        equipoDeTrabajo.addEmployee(persona2);
        equipoDeTrabajo.addEmployee(persona3);
        equipoDeTrabajo.addEmployee(persona4);
        equipoDeTrabajo.addEmployee(persona5);
    }

    @Test
    void getName() {
        assertEquals("Equipo 1", equipoDeTrabajo.getName());
    }

    @Test
    void getAverageEmployeesAge() {
        int expectedAverageAge = 31;
        assertEquals(expectedAverageAge, equipoDeTrabajo.getAverageEmployeesAge());
    }
}