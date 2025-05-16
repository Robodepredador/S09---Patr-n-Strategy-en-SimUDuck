package Cliente;

import FlyBehavior.NoVuela;
import QuackBehavior.MuteQuack;

public class PatoSeñuelo extends Pato{

    public PatoSeñuelo(){
        flyBehavior = new NoVuela();
        quackBehavior = new MuteQuack();
    }

    public void mostrar(){
        System.out.println("Soy un pato que es disparado");
    }


}
