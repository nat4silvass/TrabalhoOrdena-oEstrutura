
package com.mycompany.ordenacao;

import com.mycompany.ordenacao.model.Bolha;
import com.mycompany.ordenacao.model.Insercao;
import com.mycompany.ordenacao.model.Selecao;
import javax.swing.JOptionPane;



public class Main {

    public static void main(String[] args) {
    int escolha = -1;
    while (escolha != 0) {
        escolha = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha um método de ordenação:\n" +
            "1. Seleção\n" +
            "2. Inserção\n" +
            "3. Bolha\n" +
            "0. Sair"
        ));
        
        switch (escolha) {
            case 1 -> {
                Selecao s = new Selecao();
                s.ordSelecao();
            }
                
            case 2 -> {
                Insercao i = new Insercao();
                i.ordInsercao();
            }
                
            case 3 -> {
                Bolha b = new Bolha();
                b.ordBolha();
            }
                
            case 0 -> JOptionPane.showMessageDialog(null, "Programa finalizado.");
                
            default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
        }
    }
}
}

