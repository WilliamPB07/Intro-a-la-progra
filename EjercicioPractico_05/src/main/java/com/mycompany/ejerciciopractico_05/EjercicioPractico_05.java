package com.mycompany.ejerciciopractico_05;

import java.util.Scanner;



/**
 *
 * @author wpena
 */
public class EjercicioPractico_05 {

    public static void main(String[] args)
    {
      Scanner reader = new Scanner(System.in);
      
      System.out.print("Digite la cantidad de estudiantes: ");
      int estudiantes = reader.nextInt(), aprobados = 0;
      double Notas = 0, NotaMayor = 0, NotaMenor = 100;
      int i = 1;
     
      while (i <= estudiantes)
      {
          System.out.print("Digite la nota del estudiante: ");
          double Nota = reader.nextDouble();
          NotaMayor = Nota; 
          NotaMenor = Nota;
          Notas = Notas += Nota;
          if (Nota > NotaMayor)
          { 
             NotaMayor = Nota;
          } 
          else if (Nota < NotaMenor) 
          {
             NotaMenor = Nota;
          }
          if (Nota >= 70)
          {
              aprobados = aprobados +=1;
          }
          else
          {
              
          }
          
          
          i++;
      }
      double Promedio = Notas / estudiantes;      
      System.out.println("El promdeio de las notas es de: " + Promedio);
      System.out.println("La cantidad de estudiantes aprobados es de: " + aprobados); 
      System.out.println("La nota mayor ha sido un " + NotaMayor);
      System.out.println("La nota menor ha sido un " + NotaMenor);
    }
    
}
        
        
      
    

