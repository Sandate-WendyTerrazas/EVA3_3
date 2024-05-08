/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_16_metodos_arreglos;

/**
 *
 * @author wendy
 */
public class EVA3_16_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos = new int [5]; //Mandamos el arreglo, nos lo devuelve lleno
        datos = llenar (datos); //Imprime los valores del arreglo
        imprimir (datos);
        System.out.println("");
        
        int [] datos2 = new int [15];
        datos2 = llenar (datos2);//Mandamos el arreglo, nos lo devuelve lleno
        imprimir (datos);//Imprime los valores del arreglo
       
    }
    public static void imprimir(int [] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[ " + arreglo [i] + "]");
        }
    }
    public static int [] llenar( int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 30);
        }
        return arreglo; 
    }
    
}
