/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_arreglos;

/**
 *
 * @author wendy
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LOS ARREGLOS EN JAVA SON ABJETOS
        //TENEMOS QUE CREARLOS ENTES DE USARLOS
        // {} SIRVEN PARA MANEJAR INDICES: ARREGLO{3} ACCESO A LA POSICION
        // declaracion = creacion (new) [tamaño del arreglo]
        int arreglo[] = new int[10]; //un arreglo de 10 enteros 
        // como accedemos a traves de los datos? a traves de indices
        //conocer las posiciones de los valores;
        //PRIMER POSICION DE UN ARREFLO ES CERO -->0
        //ULTIMA POSICION DE UN ARREGLO ES --> N - 1, DONDE
        //N ES EL TAMAN1O DEL ARREGLO
        arreglo[1] = 100;
        System.out.println("valor de arreglo [1] = " + arreglo [1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);//length es la cantidad de elementos que nos dice como almacenar
    }
    
}
