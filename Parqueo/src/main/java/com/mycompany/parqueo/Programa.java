/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueo;
import com.mycompany.parqueo.modelos.*;
import java.util.Scanner;

/**
 *
 * @author WilliamPB
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
                               4. Pagar
                               0. Salir.
                               """);
            //captura la opcion del usuario
            int opcion = entrada.nextInt();
            boolean resultado = false;
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
                    
                case 3:
                    resultado = reservarEspacio(entrada);
                    //Si el resultado de reservar espacio es FALSO
                    if (!resultado)
                    {
                        System.out.println("El vehiculo no puede ser estacionado. ");
                    }
                    break;
                    
                case 4:
                    resultado = pagarEspacio(entrada);
                    break;
                    
                //Salir    
                case 0: continuar = false;
                    System.out.println("Ha salido del programa.");
                break;
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
                    
                    //Crea el arreglo de pisos
                    pisos = new Piso[largo];
                    
                    //Inicializa el arreglo de los pisos
                    for (int i = 0; i < largo; i++)
                    {
                        pisos[i] = new Piso((i + 1));
                    }
                    
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
    
    //Busca el primer espacio vacio para reservarlo
    private  boolean reservarEspacio(Scanner entrada)
    {
        boolean resultado = false;
        //Recorre cada piso buscando un espacio vacio
        for (int i = 0; i < pisos.length; i++)
        {
           Piso piso = pisos[i];
            if (piso.getCantidadEspaciosDisponibles() > 0)
            {
                Vehiculo vehiculo = crearVehiculo(entrada);
                if (vehiculo != null)
                {
                    Espacio espacio = piso.getEspacioDisponible();
                    espacio.estacionarVehiculo(vehiculo);
                }
            }
        }
        return resultado;
    }
    
    private Vehiculo crearVehiculo(Scanner entrada)
    {
        Vehiculo resultado = null;
        boolean continuar = true;
        do 
        {
            System.out.println
            (
                    """
                    Elija el tipo de vehiculo:
                    1.Motocibleta
                    2.Sedan
                    3.Todo Terreno
                    4.Camion
                    """        
            );
        int opcion = entrada.nextInt();
        switch (opcion)
        {
            case 0:
                continuar = false;
                break;
                
            case 1: 
                
            case 2:
                
            case 3: 
                
            case 4: 
                //parce para solventar el problema del brinco de la lectura de la placa
                entrada.nextLine();
                
                System.out.print("Escriba el número de placa: ");
                String placa = entrada.nextLine();
                
                System.out.print("Escriba la marca del vehiculo: ");
                String marca = entrada.nextLine();
                
                System.out.print("Escriba el modelo del vehiculo: ");
                String modelo = entrada.nextLine();
                
                resultado = 
                        //Condicion ternaria
                        //Condicion ? Verdadero : Falso
                        //Verdadero | falso => condicion
                        opcion == 1
                            ? new Motocicleta(placa, marca, modelo, 0)
                            : opcion == 2
                                    ? new Sedan(placa, marca, modelo, 0)
                                    : opcion == 3
                                        ? new TodoTerreno(placa, marca, modelo, 0)
                                        : new Camion(placa, marca, modelo, 0);
                                            
                continuar = false;
                break;
                
            default:
                System.out.println("El tipo de vehiculo no esta definido.");
                break;
        }
        } while (continuar);
        return resultado;
    }
    
    private boolean pagarEspacio(Scanner entrada)
    {
        entrada.nextLine();
        System.out.print("Escriba la placa del vehiculo a buscar: ");
        String placa = entrada.nextLine();
        
        for (int i = 0; i < pisos.length; i++)
        {
            Piso piso = pisos[i];
            Espacio espacio = piso.getEspacioOcupado(placa);
            if (espacio != null)
            {
                double montoPorPagar = espacio.liberar(1200);
                System.out.println("El monto por pagar es: " + montoPorPagar);
                return true;
            }
            
        }
        //Falso por defecto porque no se encontro la placa
        return false;
        
    }
    
}
