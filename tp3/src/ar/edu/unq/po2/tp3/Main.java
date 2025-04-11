package ar.edu.unq.po2.tp3;

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



    }
}