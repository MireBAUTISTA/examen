/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class parcial03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);    
       
     

      int s,ps = 0,cth,hsm=35, ht;
        String op = "";
        System.out.println("ingrese la cantidad de horas trabajas semanalmente");
        ht=sc.nextInt();
        if (ht<=35)
            ps=ht*15;
        if (ht>35)
            ps=ht*22;
        op = op.toUpperCase();
        
        System.out.println("pago semanal: "+ ps);
        
        System.out.println("¿Más trabajadores (S/N)?");
            op = sc.next();
         
    }
    
}
           
    
   
       