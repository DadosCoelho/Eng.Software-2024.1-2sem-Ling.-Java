import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> forma = new ArrayList<>();

        Circulo circulo = new Circulo(15);
        Retangulo retangulo = new Retangulo(15,10);
        Triangulo triangulo = new Triangulo(3,5);

        forma.add(circulo);
        forma.add(retangulo);
        forma.add(triangulo);


        System.out.println(forma.get(0).calcularArea());
        System.out.println(forma.get(1).calcularArea());
        System.out.println(forma.get(2).calcularArea());
    }
}