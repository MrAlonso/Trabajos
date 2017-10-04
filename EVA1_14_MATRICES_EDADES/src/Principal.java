
import java.util.Scanner;

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
        int aiArray2D[][];
        //DEFINIR PRIMERO EL NUMERO DE FILAS (GRUPO)
        //Preguntar numero de grupos
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Cuál es el número de grupos?");
        int iNoGpo = sCaptu.nextInt();
        //cantidad de grupos
        aiArray2D = new int[iNoGpo][]; //N de grupos
        //Para cada grupo, preuntarle el numero de alumnos
        int iNoAlu;
        for (int i = 0; i < iNoGpo; i++) {
            //PREGUNTAR EL NÚMERO DE ALUMNOS
            System.out.println("¿Número de Aalumnos para el grupo " + i + ":");
            iNoAlu = sCaptu.nextInt();
            aiArray2D[i] = new int[iNoAlu];
        }
        // ÉDIR LOS DATOS
        for (int i = 0; i < iNoGpo; i++) { //FILAS----> GRUPOS
            for (int j = 0; j < aiArray2D[i].length; j++) {
                System.out.println("Edad grupo " + i + ":");
                //length sirve para el tamaño
             aiArray2D[i][j] = sCaptu.nextInt();
            } 
        }
        //Calcular los promedios
        int iAcum;
        double dProm;
        for (int i = 0; i < aiArray2D.length; i++) { //FILAS----> GRUPOS
            //iAcum = 0;
           // dProm= 0;
            for (int j = 0; j < aiArray2D[i].length; j++) {
             //   iAcum += aiArray2D[i][j];   //Sumtoria de todas las edades
                                            //lengt sirve para el tamaño
            }       
       // dProm= iAcum / aiArray2D[i].length;
            System.out.println("Para el grupo " + 1 + ", el promedio de" +
                                                        " edad es:  ");
        
        
    }
    }
}
