package ar.edu.unq.po2.tp3.equipodetrabajo;

import java.util.ArrayList;

public class EquipoDeTrabajo {
    private String name;
    private ArrayList<Persona> employees;

    public EquipoDeTrabajo(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Persona employee) {
        this.employees.add(employee);
    }

    public int getAverageEmployeesAge() {
        int totalAge = 0;
        for (Persona employee : employees) {
            totalAge += employee.getAge();
        }
        return totalAge / employees.size();
    }
}
