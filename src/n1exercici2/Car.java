package n1exercici2;

public class Car {
    private static final String trademark = "Ford";
    private static String model;
    private final int potency = 140;

    /* Tanto "trademark" como "potency" tienen que ser inicializadas al declararse porque al ser final pasan a ser
    constantes que no pueden ser modificadas en el resto del código.
    Model sí que puede inicializarse en el constructor, pero al ser static, si se modifica para un objeto también será
    modificada para el resto de objetos de la clase Car

     */

    public static void brake () {
        System.out.println("El vehículo está frenando");
    }

    public void speedUp () {
        System.out.println("El vehículo está acelerando");
    }

    public Car (String model) {
        this.model=model;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPotency() {
        return potency;
    }

    public static String getTrademark() {
        return trademark;
    }
}
