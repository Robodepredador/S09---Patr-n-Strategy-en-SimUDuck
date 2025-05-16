package Cliente;

import FlyBehavior.VolarConJetpack;
import QuackBehavior.Quack;

public class PatoPelirrojo extends Pato{

    public PatoPelirrojo(){
        flyBehavior = new VolarConJetpack();
        quackBehavior = new Quack();
    }

    public void mostrar(){
        System.out.println("Soy un pato pelirrojo");
    }

}
