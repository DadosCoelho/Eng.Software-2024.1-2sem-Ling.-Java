public class Sms implements Notificacao{
    private int numero;

    public Sms(int numero) {
        this.numero = numero;
    }

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando mensagem para o numero: " + numero + ", " + mensagem);
    }

    public void info(){
        System.out.println("SDsad");
    }
}
