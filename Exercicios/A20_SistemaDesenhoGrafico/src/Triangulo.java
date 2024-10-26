public class Triangulo implements Forma{
    private long base;
    private long altura;

    public Triangulo(long base, long altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.floorDiv(Math.multiplyExact(base, altura),2);
    }

    @Override
    public void desenhar() {

    }
}
