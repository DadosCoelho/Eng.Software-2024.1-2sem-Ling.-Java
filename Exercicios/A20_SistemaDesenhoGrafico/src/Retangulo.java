public class Retangulo implements Forma{
    private long largura;
    private long altura;

    public Retangulo(long largura, long altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.multiplyExact(largura, altura);
    }

    @Override
    public void desenhar() {

    }
}
