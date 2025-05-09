package model;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um cachorro");
    }

    @Override
    public String toString() {
        return "\nCachorro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
