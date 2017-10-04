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
        
        //ARREGLOS MULTIDIMENSIONALES ARREGLOS DE ARREGLOS 
        //MATRIZ DE 2 X 2 DIMENSIONES [filas] x [columnas]
        int aiMatriz[][] = new int[2][2]; // 4 ENTEROS = 16 BYTES
        // LLENAR CON VALORES ALEATORIOS
        // for para filas
        //for para columnas
        
        for (int i = 0; i < 2; i++) { //cada fila
            for (int j = 0; j < 2; j++) {
                aiMatriz[i][j] = (int)(Math.random() * 10) + 1; //Llenar 1-10
            }
        }
        //Imprimir
        for (int i = 0; i < 2; i++) { //cada fila
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + aiMatriz[i][j] + "]" );
        
        }
            System.out.println(""); //NOS CAMBIA DE LINEA
    }
        //  USANDO FOR EACH
        for (int[] aiMatriz1 : aiMatriz) { //Recorre cada fila es un --> Arreglo
            //Usando otro for each // Recorrer columna
            for (int b : aiMatriz1) {
                System.out.print("[" + b + "]" );
                
            }
            System.out.println("");
        }
    } 
}
