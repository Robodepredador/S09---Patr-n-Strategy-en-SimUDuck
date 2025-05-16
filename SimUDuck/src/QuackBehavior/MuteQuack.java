package QuackBehavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("El pato no esta haciendo bulla");
    }
}
