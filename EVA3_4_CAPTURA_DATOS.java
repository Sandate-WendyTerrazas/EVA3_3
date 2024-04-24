/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA3_4_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vamos a cpaturara una lista de nombres 
        int cantidad;
        Scanner captu = new Scanner (System.in);
        System.out.println("Cuantos nombres vas a acapturar?");
        cantidad = captu.nextInt();
        String [] listaNombres = new String [cantidad];
        captu.nextLine();
        //HAY QUE PREGUNTAR CADA NOMBRE
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Nombre #" + (i + 1) + ": ");
            listaNombres[i] = captu.nextLine();
        }
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println(listaNombres [i]);
    }
    } 
}
