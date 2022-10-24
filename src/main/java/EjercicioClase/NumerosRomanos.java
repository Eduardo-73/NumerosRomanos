/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EjercicioClase;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class NumerosRomanos {

    public static void main(String[] args) {
        
        //Programa que analice los números romanos y las letra que tiene tu 
        //nombre
        
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog
        (null, """
                    --------------------------------------
                            MENU EJERCICIO
                          1º Números romanos 
                          2º Contar el número de vocales
                          3º Fin del programa
                    --------------------------------------
               
               """));
    
       while(menu != 3){ 
           
           if(menu == 1){
               
           int numRomano = Integer.parseInt(JOptionPane.showInputDialog(
                   null,"Introduce un número decimal "));
           String numero1 = "I", numero2 = "II", numero3 = "III", 
                  numero4 = "IV", numero5 = "V", numero6 = "VI",
                  numero7 = "VII",numero8 = "VIII", numero9 = "IX",
                  numero10 = "X"; 
           if (numRomano == 1){
               System.out.println(numero1);

           }else{
               System.out.println(numero2);
                    
           }
           
       }    
            
             
       }   
    }
}
