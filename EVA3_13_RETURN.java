/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("Valor 1:");
        int val1 = captu.nextInt();
        System.out.println("Valor 2:");
        int val2 = captu.nextInt();
        //Llamar a la funcion 
        //1. Guardar el resultado: conveniente si usamos el resultado muchas veces
        int resu = sumar (val1, val2);
        System.out.println("La suma = "+ resu);
        //2. Usar directamente el resultado de la función
        //Cuando solo usan el resultado una vez
        System.out.println("La suma = " + sumar (val1,val2));
        //3. Ignorara el resultado
        sumar (val1, val2);
    }
    
    public static int sumar(int num1, int num2){
        int resu = num1 + num2;
        return resu; //Es la última instrucción del método
                     //Después del return no puede haber más
                     // Instrucciones.
    }
}
