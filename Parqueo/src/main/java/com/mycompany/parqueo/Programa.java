/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo;
import com.mycompany.parqueo.modelos.*;
import java.util.Scanner;

/**
 *
 * @author wpena
 */
public class Programa 
{
    private Piso pisos[];
    
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
                               0. Salir.
                               """);
            //captura la opcion del usuario
            int opcion = entrada.nextInt();
            switch(opcion)
            {
                //Registrar pisos
                //Crea el arreglo unidimensional de ambito global para el programa
                case 1:
                    registrarPisos(entrada);
                    
                //Registrar espacios
                //Indica la cantidad de espacios que existen en cada piso
                case 2:
                    for (int i = 0; i < pisos.length; i++)
                    {
                        registrarEntrada(entrada);
                    }
                    break;
                //Salir    
                case 0: continuar = false;
                
                //opcion no reconocida
                default:
                    System.out.println("Opcion invalida. Por favor intentelo de nuevo");
                
            }
        }while(continuar);
    }
    
     //Crea el arreglo unidimensional de ambito global para el programa
    private void registrarPisos(Scanner entrada)
    {
        System.out.println("Digite la cantidad de pisos que tiene el parqueo. ");
                    int largo = entrada.nextInt();
                    pisos = new Piso[largo];
                    
    }
    //Indica la cantidad de espacios que existen en cada piso
    private void registrarEntrada(Scanner entrada)
    {
         for (int i = 0; i < pisos.length; i++)
                    {
                        System.out.println("Digite la cantidad de espacios que tiene el piso #" + (i +1) + ".");
                        
                        //Cantidad de filas en el piso
                        System.out.print("Digite la cantidad de filas: ");
                        int filas = entrada.nextInt();
                        
                        //Cantidad de columnas por fila en el piso
                        System.out.print("Digite la cantidad de columnas: ");
                        int columnas = entrada.nextInt();
                        
                        Piso piso = pisos[i];
                        piso.crearEspacios(filas, columnas);
                    }
    }
}
