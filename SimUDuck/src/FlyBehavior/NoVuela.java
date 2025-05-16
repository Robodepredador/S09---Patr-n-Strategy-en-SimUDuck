package FlyBehavior;

public class NoVuela implements FlyBehavior{

    @Override
    public void volar(){
        System.out.println("El pato no esta volando");
    }
}
