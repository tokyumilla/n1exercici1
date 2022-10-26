package n1exercici2;

public class Main {
    public static void main(String[] args) {
        Car.brake();
        Car coche1 = new Car ("Kupra");
        coche1.speedUp();
        /* El método brake es static, por lo que podemos invocarlo sin necesidad de instanciar un objeto de su clase
        El método speedUp no es static, por lo que para invocarlo necesitamos instanciar primero un objeto de su clase. */

        System.out.println(Car.getTrademark());
        System.out.println(Car.getModel());
        //System.out.println(Car.getPotency()) Esto da error, porque potency no es static, y necesita que se instancie un objeto
        System.out.println(coche1.getPotency());

    }
}