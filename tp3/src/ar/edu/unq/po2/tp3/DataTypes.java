package ar.edu.unq.po2.tp3;

public class DataTypes {
    private int examplePrimitiveDataType = 0;
    private Integer exampleWrapperClass = null;

    public DataTypes() {
    }

    public int getExamplePrimitiveDataType() {
        return examplePrimitiveDataType;
    }

    public int getExampleWrapperClass() {
        return exampleWrapperClass;
    }

    public void setExamplePrimitiveDataType(int examplePrimitiveDataType) {
        this.examplePrimitiveDataType = examplePrimitiveDataType;
    }

    public void setExampleWrapperClass(Integer exampleWrapperClass) {
        this.exampleWrapperClass = exampleWrapperClass;
    }

    public void defaultValuesInMethod() {
        int a = 0;
        Integer b = null;
        System.out.println("El valor por defecto de un tipo primitivo es: " + a);
        System.out.println("El valor por defecto de un tipo objeto es: " + b);
    }

}
