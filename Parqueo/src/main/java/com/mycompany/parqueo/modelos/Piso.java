/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo.modelos;

/**
 *
 * @author WilliamPB
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
        
        //Crea la matriz
        espacios = new Espacio[filas][columnas];
        
        //Inicializa la matriz
        for (int i = 0; i < filas; i++)
        {
            
            for (int j = 0; j < columnas; j++) 
            {
                //Asigna una nueva instancia de Espacio en cada celda de la matriz 
                //
                espacios[i][j] = new Espacio((i + 1) * (j + 1));
            }
        }
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
    
    //Devuelve el primer espaico disponiblen en el piso
    public Espacio getEspacioDisponible()
    {
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                Espacio espacio = espacios[i][j];
                if (!espacio.ocupado())
                {
                    return espacio;
                }
            }
        }
        
        return null;
    }
    
    public Espacio getEspacioOcupado(String placa)
    {
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++)
            {
                Espacio espacio = espacios[i][j];
                if (espacio.ocupado())
                {
                    if (espacio.esVehiculoEstacionado(placa))
                    {
                        return espacio;
                    }
   
                }
            }
        }
        
        return null;
    }
}
