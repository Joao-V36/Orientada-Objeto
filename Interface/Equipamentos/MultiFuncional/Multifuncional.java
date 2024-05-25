package Interface.Equipamentos.MultiFuncional;

import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.copiadora.Copiadora;
import Interface.Equipamentos.impressora.Impressora;

public class Multifuncional implements Impressora, Digitalizadora, Copiadora {
    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
