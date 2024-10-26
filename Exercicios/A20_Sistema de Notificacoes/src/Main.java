import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        String mensagem = "Adquira a nova maquininha do mercado livre";

        Sms sms = new Sms(869999999);
        Email email = new Email("cliente@exemplo.com");
        PushNotification push = new PushNotification("ID_12345");

        notificacoes.add(sms);
        notificacoes.add(email);
        notificacoes.add(push);

        for(Notificacao notify : notificacoes){
            notify.enviarMensagem(mensagem);
        }

    }
}