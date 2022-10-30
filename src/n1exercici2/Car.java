package n1exercici2;

public class Car {
    private static final String trademark = "ford";
    private static String model;
    private final int potency;

    /* "Trademark" tiene que ser inicializada al declararse porque al ser static final pasa a ser
    constantes que no pueden ser modificadas en el resto del código. No puede ser inicializada en el constructor porque
    al ser static tiene que tener un valor independientemente de que se instancien objetos de la clase o no.
    Potency tiene que ser inicializada al declararse o en el constructor por ser una constante.
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
        potency = 140;
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
