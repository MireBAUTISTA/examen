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
public class parcial01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int ct,v,ca = 0; double cv = 0;
    for(int  i=0; i<100; i++){
        System.out.println("ingrese su venta total");
        System.out.println("[1] 1,000,000 <= ventas totales < 3,000,000 ");
        System.out.println("[2] 3,000,000 <= ventas totales < 5,000,000  ");
        System.out.println("[3] 5,000,000 <= ventas totales < 7,000,000");
        System.out.println("[4]  7,000,000 <= ventas totales ");
        ct=sc.nextInt();
        switch (ct) {
            case 1:
                 System.out.println("ingrese su venta total");
                 v=sc.nextInt();
                if (1000000 <= v && v < 3000000 ){}
                    cv= (v*0.97); 
                    ca=(int) (cv*12);
                    break;
            case 2:
                 System.out.println("ingrese su venta total");
                 v=sc.nextInt();
                 if ( 3000000 <= v && v < 5000000){}
                    cv= (v*0.96); 
                    ca=(int) (cv*12);       
                    break;
            case 3:
                 System.out.println("ingrese su venta total");
                 v=sc.nextInt();
                 if ( 5000000<= v && v < 7000000){}
                    cv= (v*0.95); 
                    ca=(int) (cv*12);       
                    break;        
             case 4:
                 System.out.println("ingrese su venta total");
                 v=sc.nextInt();
                 if (7000000  <= v ){}
                    cv= (v*0.94); 
                    ca=(int) (cv*12);       
                    break;   
                         
            default:
              
               
        }
            System.out.println("ventas totales:"+cv); 
            System.out.println("ventas anuales"+ ca);
            
        }
    }
    
}

