package PilaresPOO;

import PilaresPOO.apps.Facebook;
import PilaresPOO.apps.MSNMessenger;
import PilaresPOO.apps.ServiçoDeMensagem;
import PilaresPOO.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServiçoDeMensagem sm = null;

        String appEscolhido = "tele";

        if (appEscolhido.equals("msn"))
            sm = new MSNMessenger();

        else if (appEscolhido.equals("face"))
                sm = new Facebook();

        else if (appEscolhido.equals("tele"))
                sm = new Telegram();


            sm.enviarMensagem();
            sm.receberMensagem();


        }
    }
