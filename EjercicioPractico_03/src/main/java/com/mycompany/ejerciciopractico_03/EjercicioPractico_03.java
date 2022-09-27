
package com.mycompany.ejerciciopractico_03;

import java.util.Scanner;

/**
 *
 * @author wpena
 */
public class EjercicioPractico_03 {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite el máximo de filas del triángulo: ");
        int numero = reader.nextInt();
        
        for (int i = 0; i <= numero; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
       
    }
}
