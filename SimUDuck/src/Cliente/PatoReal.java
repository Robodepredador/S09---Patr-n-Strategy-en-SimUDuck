package Cliente;

import FlyBehavior.VolarConAlas;
import QuackBehavior.Quack;

public class PatoReal extends Pato{

    public PatoReal(){
        flyBehavior = new VolarConAlas();
        quackBehavior = new Quack();
    }
    public void mostrar(){
        System.out.println("Soy un pato de la vida real");
    }
}
