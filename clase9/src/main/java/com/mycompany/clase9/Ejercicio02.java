/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

/**
 *
 * @author wpena
 */
public class Ejercicio02 {
    
    public void ejecutar()
    {
        int n = 3;
        int matriz[][] = new int [n][n];
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) 
            {
                matriz[i][j] = (int)(Math.random() * 1000) + 1;
            }
        }
        int numeroMenor = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < numeroMenor)
                {
                    numeroMenor = matriz[i][j];
                }
            }
        }
        System.out.println("El numero menor es: " + numeroMenor);
    }
    
}
