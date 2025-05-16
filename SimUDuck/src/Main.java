import Cliente.*;
import FlyBehavior.VolarConJetpack;
import QuackBehavior.Quack;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pato pato1 = new PatoGoma();
        Pato pato2 = new PatoPelirrojo();
        Pato pato3 = new PatoReal();
        Pato pato4 = new PatoSeñuelo();

        System.out.println("Mostrar Pato de Goma: \n");
        pato1.mostrar();
        pato1.realizarQuack();
        pato1.nadar();
        pato1.realizarVuelo();

        System.out.println("\n");

        System.out.println("Mostar Pato pelirrojo: \n");
        pato2.mostrar();
        pato2.realizarVuelo();
        pato2.nadar();
        pato2.realizarQuack();

        System.out.println("\n");

        System.out.println("Mostrar Pato real: \n");
        pato3.mostrar();
        pato3.realizarVuelo();
        pato3.nadar();
        pato3.realizarQuack();

        System.out.println("\n");

        System.out.println("Mostrar Pato Señuelo: \n");
        pato4.mostrar();
        pato4.realizarVuelo();
        pato4.nadar();
        pato4.realizarQuack();

        System.out.println("\n----------------- Transformacion del pato de goma ----------------- ");

        pato1.setQuackBehavior(new Quack());
        pato1.setFlyBehavior(new VolarConJetpack());

        System.out.println("\nPato de goma modificado: \n");
        pato1.mostrar();
        pato1.realizarVuelo();
        pato1.nadar();
        pato1.realizarQuack();


    }
}