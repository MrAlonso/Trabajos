/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alons
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArreglo3D[][][] = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                   aiArreglo3D[i][j][k] = (int)(Math.random() * 100)+1;
                    
                }
            }
        }
        for (int i = 0; i < 3; i++) { //Filas
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.println("");//Columnas
                for (int k = 0; k < 3; k++) { //Niveles
                    System.out.print("[" + aiArreglo3D[i][j][k]+ "]");
   
                }
    }
        }
    }
}
