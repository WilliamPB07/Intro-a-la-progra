
package com.mycompany.ejerciciopractico02;

/**
 *
 * @author William PB
 */
import java.util.Scanner;
public class EjercicioPractico02 {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Cuantos años tiene de laborar el trabajador? ");
        int años = reader.nextInt();
        
        System.out.println("Cuantas horas a la semana labora: ");
        int horasSemana = reader.nextInt();
        
        
        System.out.println("Cuanto se le paga por hora? ");
        double precioHora = reader.nextDouble();
        
        double salarioBruto = ((horasSemana * 52 ) * precioHora )* años;
        double salarioNeto;
        if (años > 10)
        {
            salarioNeto = salarioBruto * 0.20;
            if (salarioNeto > 1000 && salarioNeto <= 2000);
            {
                salarioNeto = salarioNeto - (salarioNeto * 0.10);
            }
            else if (salarioNeto >= 2001)
            {
                salarioNeto = salarioNeto - (salarioNeto * 0.10);   
            }
            
        }
        else
        {
             System.out.println("Su salario neto es de: " + salarioNeto);
        }
    }
}
