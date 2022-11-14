/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo.modelos;

import java.time.LocalDateTime;

/**
 *
 * @author wpena
 */
public class Espacio 
{
    //Constructor quien recibe el numero de espacio
    public Espacio(int espacio)
    {
        setNumeroEspacio(espacio);
    }
    private int numeroEspacio;
    private Vehiculo vehiculo;
    private LocalDateTime entrada;
    
    
    
    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    private void setNumeroEspacio(int numeroEspacio) {
        this.numeroEspacio = numeroEspacio;
    }
    
    //Metodo que devuelve si verdadero si el vehiculo pudo ser parqueado
   public boolean estacionarVehiculo(Vehiculo valor)
   {
       if (vehiculo != null)
       {
            return false;
       }
       vehiculo = valor;
       entrada = LocalDateTime.now();
       return true;
   }

    
}
