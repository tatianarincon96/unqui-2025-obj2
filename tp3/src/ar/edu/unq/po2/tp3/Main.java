package ar.edu.unq.po2.tp3;

import ar.edu.unq.po2.tp3.equipodetrabajo.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.equipodetrabajo.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 4. Examinar las expresiones
        String a = "abc";
        String s = a;
        String t;

        System.out.println(s.length());
        //System.out.println(t.length()); --> Da error de sintaxis, t no está inicializada
        System.out.println((1 + a));
        System.out.println(a.toUpperCase());
        System.out.println("Libertad".indexOf("r"));
        System.out.println("Universidad".lastIndexOf('i'));
        System.out.println("Quilmes".substring(2,4));
        System.out.println((a.length() + a).startsWith("a"));
        System.out.println(s == a);
        System.out.println(a.substring(1,3).equals("bc"));

        DataTypes dataTypes = new DataTypes();
        System.out.println(dataTypes.getExamplePrimitiveDataType());
        // System.out.println(dataTypes.getExampleWrapperClass());
        dataTypes.defaultValuesInMethod();

        //-------------------------------------------------
        // 11. Equipo de trabajo
        EquipoDeTrabajo equipoDeTrabajo = new EquipoDeTrabajo("Equipo 1");
        Persona persona1 = new Persona("Juan", "Mendoza",25);
        Persona persona2 = new Persona("Maria", "Leopardo",30);
        Persona persona3 = new Persona("Pedro", "Aguirre",35);
        Persona persona4 = new Persona("Ana", "Ledesma",28);
        Persona persona5 = new Persona("Luis", "Guerrero",40);

        equipoDeTrabajo.addEmployee(persona1);
        equipoDeTrabajo.addEmployee(persona2);
        equipoDeTrabajo.addEmployee(persona3);
        equipoDeTrabajo.addEmployee(persona4);
        equipoDeTrabajo.addEmployee(persona5);

        System.out.println("Promedio del equipo de trabajo: " + equipoDeTrabajo.getAverageEmployeesAge());
    }
}