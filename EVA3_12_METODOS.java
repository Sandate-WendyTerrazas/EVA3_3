/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_metodos;

/**
 *
 * @author wendy
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Invocar al método --> llamada --> call
        mostrarMensaje("Hola!!");
        mostrarMuchosMensajes("HOLA!!", 10);
    }
    
    //public static --> para la materia de POO
    //void --> ( tipo de dato) valor que regresa el metodo
    // void --> no regresa nada 
    // nombre del método --> identificador válido
    // reglas : empezar en minusculas, debe ser un verbo 
    // () <-- parámetros del método (argumento) --> valores que necesita 
    //para funcionar.
    public static void mostrarMensaje(String mensaje){ // encabezado (nombre del método)
        ///cuerpo del metodo: aquí va nuestro código
        System.out.println(mensaje);
    }
    
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }
}
