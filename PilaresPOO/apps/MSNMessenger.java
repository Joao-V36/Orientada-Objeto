package PilaresPOO.apps;

public class MSNMessenger extends ServiçoDeMensagem{


    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messanger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messanger");
    }
}
