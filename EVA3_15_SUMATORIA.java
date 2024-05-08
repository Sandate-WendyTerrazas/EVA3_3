/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número hasta el cual desea calcular la sumatoria: ");
        int numero = scanner.nextInt();
        
        int resultado = calcularSumatoria(numero);
        System.out.println("La sumatoria es: " + resultado);
        
    }
    public static int calcularSumatoria(int limiteSuperior) {
        int sumatoria = 0;
        for (int i = 1; i <= limiteSuperior; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }
}
