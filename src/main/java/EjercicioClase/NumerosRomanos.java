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
           
            
           }
           
       }    
            
             
        
    }
}
