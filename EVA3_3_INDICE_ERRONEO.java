/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_indice_erroneo;

/**
 *
 * @author wendy
 */
public class EVA3_3_INDICE_ERRONEO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos [] = new int [10];
        datos [10] = 100;// ERRO EN TIEMPO DE EJCUCION; El indie 10 no EXISTE
        System.out.println ("El valor en datos [10] = " + datos [10]);
    }
    
}
