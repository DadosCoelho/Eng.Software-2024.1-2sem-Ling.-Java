public class VolumeA14E4 {
    public double calcularVolume(double lado){
        return lado * lado * lado;
    }

    public double calcularVolume(double comprimento, double largura, double altura){
        return comprimento * largura * altura;
    }

    public double calcularVolume(double raio, double altura){
        return (Math.PI * (raio * raio) * altura);
    }

}
