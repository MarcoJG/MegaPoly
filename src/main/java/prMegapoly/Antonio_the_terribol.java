/*
* To change this license header, choose License Headers in Project
Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package trabajo;

import java.util.Scanner;

/**
 *
 * @author Antonio "el crack"
 */
public class Antonio_the_terribol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Se nos pide un programa que lea por teclado 10 numeros enteros, los muestre de menor a mayor,
//Y nos diga cuantos son pares y cuales son impares

        Scanner sc = new Scanner(System.in);
        int[] mi_array = new int[10];

        for (int i = 0; i < mi_array.length; i++) {
            mi_array[i] = sc.nextInt();
        }

        for (int j = 0; j < mi_array.length; j++) {
            if (j < mi_array.length && mi_array[j] > mi_array[j + 1]){
                int aux = mi_array[j]; //meto en aux el valor mas grande
                mi_array[j] = mi_array[j + 1]; // meto en j el valor mas peque. Meto en aux, el grande.
                mi_array[j + 1] = aux;
            }
            System.out.print("El valor de la posicion: " + j + " es: " + mi_array[j]);
        }
    }
}
