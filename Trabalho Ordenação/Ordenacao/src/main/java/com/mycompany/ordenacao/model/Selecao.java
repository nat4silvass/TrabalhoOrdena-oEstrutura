package com.mycompany.ordenacao.model;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Selecao {
  
    public void ordSelecao(){
    
        int[] numeros = new int[7];
        
        String input = JOptionPane.showInputDialog("Digite 7 números separados por vírgula:");
        String[] numerosString = input.split(",");
        for (int i = 0; i < numerosString.length; i++) {
            numeros[i] = Integer.parseInt(numerosString[i].trim());
        }
        
        System.out.println("Vetor sem ordenar: "+Arrays.toString(numeros));
        long inicio = System.currentTimeMillis();
        long fim;
        for (int i = 0; i < numeros.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }
            int aux = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = aux;
        }
        fim = System.currentTimeMillis();
        System.out.println("tempo: "+(fim-inicio));   
        System.out.println("Vetor ordenado com seleção: " + Arrays.toString(numeros));
    }
}    


