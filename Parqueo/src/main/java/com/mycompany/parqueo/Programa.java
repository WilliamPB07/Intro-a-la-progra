/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo;

import java.util.Scanner;

/**
 *
 * @author wpena
 */
public class Programa 
{
    
    public void ejecutar()
    {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        do
        {
            System.out.println("""
                               Sistema de parkeos
                               Elija una opcion del men\u00fa: 
                               1. Registrar pisos del parqueo.
                               2. Registrar espacios en un piso.
                               3. Reservar espacio.
                               """);
        }while(continuar);
    }
}
