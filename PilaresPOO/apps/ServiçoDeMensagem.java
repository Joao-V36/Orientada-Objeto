package PilaresPOO.apps;

public abstract class ServiçoDeMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();



    protected void validarConectadoInternet(){
        System.out.println("Validando Se está conectado a Internet");
    }
}

