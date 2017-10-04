
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550480
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PRIMERO PREGUNTAR CUANTAS EDADES SE VA A CAPTURAR
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Cuántas edades se van a capturar?");
        int iCant = sCaptu.nextInt(); //Cantidad a capturar
        // Inicializar el arreglo
        int aiEdades[] = new int[iCant];
        //CAPTURAR
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad");
            aiEdades[i] = sCaptu.nextInt();
        }
        //Calcular el promedio de edades
        int iAcum = 0;
        for (int iVal : aiEdades){ //FOR EACH EN LA PRIMERA PARTE SE PONE-
            //-LA VARIABLE COMO RESULTADO
            iAcum = iAcum + iVal; //iAcum+= iVal; ES EQUIVALENTE
        }
        double dProm = iAcum/iCant;
        System.out.println("El promedio es: " + (iAcum/iCant));
    }
    
}
