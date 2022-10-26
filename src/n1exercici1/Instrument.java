package n1exercici1;

public abstract class Instrument {
    private String name;
    private int price;

    public abstract void tocar ();

    {
        this.name = "instrumento por defecto";
        this.price = 0;

    }

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
