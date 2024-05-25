package PilaresPOO.apps;

public class Telegram extends ServiçoDeMensagem{

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    }
}
