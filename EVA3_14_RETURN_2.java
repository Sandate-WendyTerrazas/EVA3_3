/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA3_14_RETURN_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("Base:");
        int base = captu.nextInt();
        System.out.println("Potencia:");
        int pot = captu.nextInt();
        //CALCULAR LA POTENCIA:
        int resu = calcularPot (base, pot);
        System.out.println("El resultado es = " + resu);
    }
    //Crear una funcion que calcule la potencia de un valor entero
    public static int calcularPot (int base, int potencia){
        //Necesitamos un ACUMULADOR
        // suma = suma * valor;
        //suma *= valor;
        int resu = 1; 
        for (int i = 0; i < potencia; i++) {
            resu = resu * base;
        }
        return resu; 
    }
}
