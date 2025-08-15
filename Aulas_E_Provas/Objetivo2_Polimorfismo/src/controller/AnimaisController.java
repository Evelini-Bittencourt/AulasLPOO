package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimaisController {
    public static void main(String[] args) {
        Animal c1= new Cachorro(10,10);
        Animal c2= new Cachorro(20,20);
        Animal c3= new Cachorro(30,30);

        Animal peixe1=new Peixe(10,10,10);
        Animal peixe2=new Peixe(20,20,20);
        Animal peixe3=new Peixe(30,30,30);

        Animal pas1= new Passaro(10,10,10);
        Animal pas2= new Passaro(20,20,20);
        Animal pas3= new Passaro(30,30,30);

        List<Animal> animais=new ArrayList<>();
        animais.add(c1);
        animais.add(c2);
        animais.add(c3);
        animais.add(peixe1);
        animais.add(peixe2);
        animais.add(peixe3);
        animais.add(pas1);
        animais.add(pas2);
        animais.add(pas3);

        System.out.println("Lista de animais: " +animais);

        System.out.println("\n\nMovendo todos os animais para 2,2");
        animais.forEach(a ->{
            a.mover(2,2);
            a.desenhar();
            System.out.println(a);
            System.out.println("\n");
        });
        System.out.println("\n\nMovendo os cachorros para 8,8");
        animais.forEach(a ->{
            if(a instanceof Cachorro){
                a.mover(8,8);
                a.desenhar();
                System.out.println(a);
                System.out.println("\n");
            }

        });

        System.out.println("\n\nMovendo os passaros e peixes para 5,5,5");
        animais.forEach(a->{
            if(a instanceof Passaro){
                ((Passaro)a).mover3D(5,5,5);
                a.desenhar();
                System.out.println(a);
                System.out.println("\n");
            }else if(a instanceof Peixe){
                ((Peixe)a).mover3D(5,5,5);
                a.desenhar();
                System.out.println(a);
            }
        });

    }
}
