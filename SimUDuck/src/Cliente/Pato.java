package Cliente;


import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

public abstract class Pato {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void nadar(){
        System.out.println("El pato esta nadando");
    }

    public abstract void mostrar();

    public void realizarQuack(){
        quackBehavior.quack();
    }

    public void realizarVuelo(){
        flyBehavior.volar();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
