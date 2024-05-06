/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un arreglo
        //llenarlo con valores aleatorios
        //preguntar al usuario el valor que busca 
        int res;
        Scanner captu = new Scanner (System.in);
        
        int arreglo [] = new int [10];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int)(Math.random() * 50) + 1;
        }
        //imprimirlo
        for (int valor : arreglo) {
            System.out.println(valor);
        }
        
        //PREGUNTAR AL USUARIO EL VALOR A BUSACAR 
        System.out.println("");
        System.out.println("Que valor buscas?");
        res = captu.nextInt();
        
        //BUSCAR:
        //RECORRER EL ARREGLO (CICLO FOR)
        //COMPARAR EL VALOR BUSCADO CONTRA EN VALOR EN EL ARREGLO (IF)
        // DTERMINE SI LO ENCUENTR, SI NO, SEGUIR BUSCANDO
        //REGRESAR AL RESULTADO: PUEDE VARIAR > PUEDE SER LA POSICIÓN
        // O VERDADER (SI LO ENCUENTRA) O FALSO (NO LO ENCUENTRA)
        
        int posi = -1; //una posicion no existe   
        for (int i = 0; i < arreglo.length; i++) {
            if (res == arreglo[i]);
        posi = i; //Almaceno la posición donde esta e valor
         break;
         
        }   
        System.out.println("posición = " + posi);
    }
}

        
    
    

