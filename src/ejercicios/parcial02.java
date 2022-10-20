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
public class parcial02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
        System.out.println("bienvenidos a nuestra pizzeria ");
         int tm,inex,p=20; double ar,r=3.14,ca,pv = 0,cf;
        System.out.println("seleccione la opcion de pizza que quiera llevar");
        System.out.println("[1]´PIZZA Pequeña de 10 pulgadas de diámetro"); 
        System.out.println("[2] PIZZA mediana 12 pulgadas de diámetro");
        System.out.println("[3] PIZZA grandes 16 pulgadas de  diámetro");
        tm=sc.nextInt();
        System.out.println("ingrese la cantidad de los ingredientes extras");
        System.out.println("pepinillos, champiñones, cebollas");        
        inex=sc.nextInt(); 
        switch (tm) {
            case 1:
                ar=(5^2)*3.14;
                ca=ar*inex;
                cf=10+p+ca;
                pv=cf*1.5;
                break;
            case 2:
                ar=(6^2)*3.14;
                ca=ar*inex;
                cf=12+p+ca;
                pv=cf*1.5;
                break;    
            case 3:
                ar=(8^2)*3.14;
                ca=ar*inex;
                cf=16+p+ca;
                pv=cf*1.5;
                break;    
                
          
        }
        
        System.out.println("precio de venta:"+pv); 
    }
    
}
