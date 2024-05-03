/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_for_each;

/**
 *
 * @author wendy
 */
public class EVA3_10_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String díasSemana[] = {"Domingo","Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for (String día : díasSemana) {
            System.out.println(día);
        }
        
        int salario [] = {30, 50, 25,35};
        for (int cant : salario) {
            System.out.println("$" + cant);
        }
        String mesAño [] = {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre", "Noviembre", "Diciembre"};
        for (String mes : mesAño) {
            System.out.println(mes);
    }
    } 
}

