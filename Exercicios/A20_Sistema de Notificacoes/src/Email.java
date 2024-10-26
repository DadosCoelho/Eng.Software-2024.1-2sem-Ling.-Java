public class Email implements Notificacao{
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando mensagem para o email: " + email + ", " + mensagem);
    }
}
