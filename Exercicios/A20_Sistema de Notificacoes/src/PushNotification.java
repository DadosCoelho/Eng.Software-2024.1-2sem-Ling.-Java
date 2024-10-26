public class PushNotification implements Notificacao{
    private String ID_Dispositivo;

    public PushNotification(String ID_Dispositivo) {
        this.ID_Dispositivo = ID_Dispositivo;
    }

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando mensagem para o dispositivo: " + ID_Dispositivo + ", " + mensagem);
    }




}
