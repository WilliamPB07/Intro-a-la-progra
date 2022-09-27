
package com.mycompany.ejerciciopractico_02;

import java.util.Scanner;

/**
 *
 * @author wpena
 */
public class EjercicioPractico_02 {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite el número que quiera para ver su tabla de multiplicación: ");
        int Numero = reader.nextInt();
        int Resultado;
        
        for (int i = 0; i <= 10; i++)
        {
            Resultado = Numero * i;
            
            System.out.println(Numero + " X " + i + " = " + Resultado);
        }
        
    }
}
