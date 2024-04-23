/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_2;

/**
 *
 * @author wendy
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JAVA: 0 primero elemento
        //     N -1 ULTIMO EKEMENTO 
        // N--> TOTAL DE ELEMNTOS ALMACENADOS EN EL ARREGLO ESTO NOMAS E JAVA EM PHYTON ES DIREFENTE 
        
        //VAMOS A CREAR UN ARREFLO Y LLLENARLO DE VALORES ALEATORIOS 
        // int datos [], x, y; --> solo datos es un arreglo
        //int datos, x, y; --> todas las variables son arreglos
        
        int datos[] = new int [10];//cuando sabemos la cantidad de repticiones siempre vamos usar el ciclo for
        
        //quiero valores entre 0 y 99, (1 - 100)
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100); // esto le quita la parte decimal no redondea, genera numeros 0 -99  
        }
        // imprimir los elemnetos del arreglo:
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos [i] + "]");  
    }
        
}
}

