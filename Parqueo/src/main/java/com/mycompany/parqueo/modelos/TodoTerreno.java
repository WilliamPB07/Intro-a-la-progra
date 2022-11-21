/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo.modelos;

/**
 *
 * @author wpena
 */
public class TodoTerreno extends Vehiculo
{
    public TodoTerreno(String placa, String marca, String modelo, int annoFabricacion)
    {
        //Indica a la clase padre que debe construirse como el tipo Sedan 
        super(TiposVehiculo.TODO_TERRENO);
        
        //Asigna valores de las Propiedades
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.annoFabricacion = annoFabricacion;
    }
    
}
