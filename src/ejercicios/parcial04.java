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
public class parcial04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int bl, pr,imp; double des = 0 ;
        System.out.println("ingrese el importe");
        imp=sc.nextInt();
        System.out.println("ingrese l color de la bolita ");
        System.out.println("[1]bolita rojo ");
        System.out.println("[2]bolita amarillo ");
        System.out.println("[3]bolita blanca ");
        bl=sc.nextInt();
        switch (bl) {
            case 1:
                des= imp*0.6;
                break;
            case 2:
                 des=imp*0.75;
                 break;
            case 3:
                 des=imp;
                 break; 
                
        }
         System.out.println("precio a pagar: "+des);
                
        }
        
    
    }
    

