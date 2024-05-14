/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_referencias;

/**
 *
 * @author wendy
 */
public class EVA3_19_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = new int [5];
        System.out.println(arreglo);
        int x = 100;
        System.out.println("Antes de llamar al método. x = " + x);
        
        sumarUno(x);//Le estoy enviando una copia de la x
        System.out.println("Después de llamar al método. x = " + x);
        System.out.println("------------");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo [i] + "]");
        }
    }
    
    public static void sumarUno (int valor){
        System.out.println("Antes de la operacion. Valor: " + valor);
        valor = valor + 1;
        System.out.println("Después de la operacion. Valor: " + valor);
    }
    public static void modificarArreglo (int [] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
    }
}
}