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
public class Arreglo 
{
    public void ejecutar()
    {
        Scanner entrada = new Scanner(System.in);
        
        int canasta[][] = new int[2][5];

    for (int i = 0; i < canasta.length; i++)
    {
        for (int j = 0; j < canasta[i].length; j++)
        {
            System.out.println("Digite el marcador del equipo #" + (i + 1) + " para el periodo #" + j);
            canasta[i][j] = entrada.nextInt();
                    
            
        }
    }
    
    for (int i = 0; i < canasta.length; i++)
    {
        System.out.print(i + 1);
        for (int j = 0; j < canasta[i].length; j++)
        {
            System.out.print("\t" + canasta[i][j]);
                    
            
        }
        System.out.println("");
    }
    }
}
