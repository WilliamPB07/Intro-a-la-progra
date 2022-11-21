/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo.modelos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author WilliamPB
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
   
   //devuelve verdadero cuando vehiculo no es NULO
   //lo que indica que hay un vehiculo estacionado en el espacio
   public boolean ocupado()
   {
       return vehiculo != null;
   }
   
   public double liberar(double montoPorHora)
   {
       if (vehiculo == null)
       {
          return 0D;   
       }
       
       LocalDateTime salida = LocalDateTime.now();
       long minutos = ChronoUnit.MINUTES.between(entrada, salida);
       long horas = minutos / 60;
       minutos = minutos % 60;
       double resultado = (horas * montoPorHora);
       if (minutos > 0)
       {
           resultado += montoPorHora;
       }
       vehiculo = null;
       return resultado;               
   }

    public boolean esVehiculoEstacionado(String placa)
    {
        if (vehiculo == null)
        {
            return false;
        }
        
        return vehiculo.placa.equalsIgnoreCase(placa);
    }
}
