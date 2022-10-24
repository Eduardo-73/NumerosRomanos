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
          int menu;

          do{

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    --------------------------------------
                            MENU EJERCICIO
                          1º Números romanos 
                          2º Contar el número de vocales
                          3º Fin del programa
                    --------------------------------------
               
               """));

            switch (menu) {
                case 1:
                    int numRomano = Integer.parseInt(JOptionPane.showInputDialog(
                            null, "Introduce un número decimal del 1 al 10: "));

                    switch (numRomano) {
                        case 1 ->
                            JOptionPane.showMessageDialog(null, "I");
                        case 2 ->
                            JOptionPane.showMessageDialog(null, "II");
                        case 3 ->
                            JOptionPane.showMessageDialog(null, "III");
                        case 4 ->
                            JOptionPane.showMessageDialog(null, "IV");
                        case 5 ->
                            JOptionPane.showMessageDialog(null, "V");
                        case 6 ->
                            JOptionPane.showMessageDialog(null, "VI");
                        case 7 ->
                            JOptionPane.showMessageDialog(null, "VII");
                        case 8 ->
                            JOptionPane.showMessageDialog(null, "VIII");
                        case 9 ->
                            JOptionPane.showMessageDialog(null, "IX");
                        case 10 ->
                            JOptionPane.showMessageDialog(null, "X");
                    }
                    break;

                case 2:

                    String nombre = JOptionPane.showInputDialog("Inserte un nombre: ").toLowerCase();
                    char letra;
                    int contador = 0;
                    for (int i = 0; i < nombre.length(); i++) {
                       letra = nombre.charAt(i); 
                       if (letra == 'a'|| letra == 'e'|| letra == 'i' || letra == 'o'|| letra == 'u' ){  
                         contador = contador + 1; 
                       }
                       
                    }

                    JOptionPane.showMessageDialog(null, "El nombre tiene: " + contador + " vocales");

                    break;


                default:
                    JOptionPane.showMessageDialog(null, "Número equivocado ");

            }

        }while(menu !=3);
    }
}
