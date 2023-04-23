
package com.mycompany.ordenacao.model;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Bolha {
  public void ordBolha(){
    int[] numeros = new int[7];
        
    String input = JOptionPane.showInputDialog("Digite 7 números separados por vírgula:");
    String[] numerosString = input.split(",");
    for (int i = 0; i < numerosString.length; i++) {
        numeros[i] = Integer.parseInt(numerosString[i].trim());
    }
    System.out.println("Vetor sem ordenar: "+Arrays.toString(numeros));
    long inicio = System.currentTimeMillis();
    long fim;
    int aux,j;
    for (int i = 0; i < numeros.length; i++){
        for ( j =i+1; j < numeros.length; j++){
            if(numeros[i] > numeros[j] ){
                aux = numeros[j];
                numeros[j] = numeros[i];
                numeros[i]=aux;
                
            }
        }
    }
     fim = System.currentTimeMillis();
     System.out.println("tempo: "+(fim-inicio));   
     System.out.println("vetor ordenado por bolha"+Arrays.toString(numeros));
  }
}
