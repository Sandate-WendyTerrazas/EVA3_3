/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_5dimensiones;

/**
 *
 * @author wendy
 */
public class EVA3_8_5DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo [][][][][] = new int [10][5][3][2][4]; // 1,200 enteros
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length ; j++) {
                 for (int k = 0; k < cubo[i][j].length ; k++) {   
                    for (int l = 0; l < cubo[i][j][k].length ; l++) {   
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            cubo [i][j][k][l][m] = (int) (Math.random() * 100);
                        }
                    }
                 }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length ; j++) {
                 for (int k = 0; k < cubo[i][j].length ; k++) {   
                    for (int l = 0; l < cubo[i][j][k].length ; l++) {   
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            cubo [i][j][k][l][m] = (int) (Math.random() * 100);
                        System.out.println("[" + cubo [i][j][k][l][m] + "]");
                    }
                 }
            }
        }                      
    }
    }
    
}
