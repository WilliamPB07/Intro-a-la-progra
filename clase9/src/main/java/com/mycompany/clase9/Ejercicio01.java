/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

import java.util.Scanner;

/**
 *
 * @author wpena
 */
public class Ejercicio01
{
    Scanner entrada = new Scanner(System.in);
    
    public void ejecutar()
    {
        System.out.println("Por favor digite el tamaño de la  matriz: ");
        int n = entrada.nextInt();
        
        int matriz[][] = new int[n][n];
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println("Por favor digite valor de la matriz en posicion: [" + i + "," + j + "]" );
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Suma las cuatro esquinas
        int suma4esquinas = matriz[0][0] + matriz[0][n - 1] + matriz[n - 1][0] + matriz[n - 1][n - 1];
        
        int sumaDiagonal = 0;
        for(int i = 0;i <n; i++)
        {
            sumaDiagonal += matriz[i][i];
        }
        int sumaDiagonalInversa = 0;
        for(int i = 0; i < n; i++)
        {
            for (int j = n -1; j >= n; j--) 
            {
                sumaDiagonalInversa += matriz[n - j - 1][j];
            }
                
        }
        
        int numeroMayor = Integer.MIN_VALUE;
        
        for (int j = 0; j < n; j++) 
        {
            
                numeroMayor = matriz[n - j - 1][j];
        }    
                
        
        
        System.out.println("La suma de las 4 esquinas es igual a: " + suma4esquinas + "\nLa suma de la diagonal es igual a: " + sumaDiagonal + "\nLa suma de la diagonal inversa es igual a: " + sumaDiagonalInversa + "\nEl número mayor dentro de la matriz es: " + numeroMayor);
        
    }
}
