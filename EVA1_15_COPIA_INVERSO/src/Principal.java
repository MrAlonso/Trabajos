
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
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Cuántas personas son?");
        int iCant = sCaptu.nextInt();
         
        int aiEdades[] = new int [iCant];
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad");
            aiEdades[i] = sCaptu.nextInt();
        }
        //Imprimir
        System.out.println("Tu arreglo inverso es: ");
        for (int i = 0; i < iCant; i++) {
            System.out.println(aiEdades[(iCant-1)-i]);   
        }

        
    }    
    
}
