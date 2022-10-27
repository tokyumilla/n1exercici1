package n1exercici1;

public abstract class Instrument {
    private static String name;
    private static int price;

    public abstract void tocar ();

    static {
        name = "instrumento por defecto";
        price = 0;
        System.out.println("Se han asignado valores por defecto");
    }
    //Al realizar un bloque estático sólo se ejecutará una vez, si no fuera estático este código se
    //ejecutaría cada vez que se instancie un objeto.


    public Instrument () {}

    @Override
    public String toString() {
        return "El nombre del instrumento es: " + name + '\'' +
                ", y su precio: " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
