package Interface.Equipamentos.Estabelecimento;

import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Digitalizadora.Scanner;
import Interface.Equipamentos.MultiFuncional.Multifuncional;
import Interface.Equipamentos.copiadora.Copiadora;
import Interface.Equipamentos.impressora.DeskJet;
import Interface.Equipamentos.impressora.Impressora;

public class Loja {
    public static void main(String[] args) {
        Multifuncional em = new Multifuncional();

      Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
