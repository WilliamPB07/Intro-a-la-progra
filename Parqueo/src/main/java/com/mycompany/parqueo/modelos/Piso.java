/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo.modelos;

/**
 *
 * @author wpena
 */
public class Piso 
{
    public Piso(int numeroPiso)
    {
        setNumeroPiso(numeroPiso);
    }
    
    //arreglo bidimensional para manejar los espacios de los pisos
    private Espacio espacios[][];
    private int filas;
    private int columnas;
    
    private int numeroPiso;

    public int getNumeroPiso() {
        return numeroPiso;
    }

    private void setNumeroPiso(int valor) {
        this.numeroPiso = valor;
    }
    
    //crea la cantidad de espacios por filas y ocmlumnas
    //Asume que los espacios estan distribuidos de manera simetrica
    public void crearEspacios(int filas, int columnas)
    {
        this.filas = filas;
        this.columnas = columnas;
        espacios = new Espacio[filas][columnas];
    }
    
    //Devuelve la cantidad de espacios en el piso
    public int getCantidadEspacios()
    {
        return filas * columnas;
    }    
    
    public int getCantidadEspaciosOcupados()
    {
         int ocupados = 0;
         for (int i = 0; i < filas; i++) 
         {
             for (int j = 0; j < columnas; j++) 
             {
                 //si el espaico esta ocupado entonces el contador aumentan en 1
                 if (espacios[i][j].ocupado() )
                 {
                     ocupados++; //ocupados +=1 | ocupados = ocupados + 1
                 }
             }
         }
         return ocupados;
    }
    //Devuelve la cantidad de espacios disponibles
    public int getCantidadEspaciosDisponibles()
    {
       return getCantidadEspacios() - getCantidadEspaciosOcupados();
    }
    
}