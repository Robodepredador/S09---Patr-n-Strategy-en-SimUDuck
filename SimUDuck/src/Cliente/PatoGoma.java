package Cliente;

import FlyBehavior.NoVuela;
import QuackBehavior.Squeak;

public class PatoGoma extends Pato{

    public PatoGoma(){
        flyBehavior = new NoVuela();
        quackBehavior = new Squeak();
    }

    @Override
    public void mostrar(){
        System.out.println("Aqui esta el pato de goma amarillo");
    }

}
