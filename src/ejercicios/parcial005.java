package ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class parcial005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int ed,des,ct,pt; double pg = 0;
        System.out.println("ingrese su edad");
        System.out.println("Categoría [1] de 5 a 14 años");
        System.out.println("Categoría [2] de 15 a 19 años");
        System.out.println("Categoría [3] de 20 a 45  años");
        System.out.println("Categoría [4] de 46 a 65 años");
        System.out.println("Categoría [5] de 66 a mas ");
        ct=sc.nextInt();
        System.out.println("ingresar el precio del teatro");
        pt=sc.nextInt();
        switch (ct) {
            case 1:
                pg=pt*0.65;
                break;
            case 2:
                pg=pt*0.75;
                break;
            case 3:
                pg=pt*0.90;
                break;
            case 4:
                pg=pt*0.75;
                break;
            case 5:
                pg=pt*0.65;
                break;
                
  
        }
    
        System.out.println("precio a pagar con descuento incluido:"+pg);
    
    
  
    
    
    }
    
}
