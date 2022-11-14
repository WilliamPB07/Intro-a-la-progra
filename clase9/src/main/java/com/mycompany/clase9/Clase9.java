/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase9;

import java.util.Scanner;

/**
 *
 * @author wpena
 */
public class Clase9 {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Elige!!");
        int elegir = reader.nextInt();
        
        if (elegir == 1){
            Ejercicio01 programa = new Ejercicio01();
            programa.ejecutar();
        }
        if(elegir == 2){
            Ejercicio02 programa = new Ejercicio02();
            programa.ejecutar();
        }
    }
}
