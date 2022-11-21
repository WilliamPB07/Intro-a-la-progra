/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo.modelos;

/**
 *
 * @author WilliamPB
 */
public abstract class Vehiculo 
{
    //Constructor del vehiculo quien recibe el tipo como parametro
    public Vehiculo(TiposVehiculo tipoVehiculo)
    {
        setTiposVehiculo(tipoVehiculo);
    }
    
    
    
    public String marca;
    public String modelo;
    public int annoFabricacion;
    public String placa;
    
    //Atributo que sera modificado y accesado por encapsuladores
    private TiposVehiculo tipoVehiculo;
    
    void setTiposVehiculo (TiposVehiculo valor)
    {
        tipoVehiculo = valor;
    }  
    public TiposVehiculo getTiposVehiculo()
    {
        return tipoVehiculo;
    }
    
} 


