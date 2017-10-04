
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
    public static final int TAMA_ARRE = 5;
    public static void main(String[] args) {
        // TODO code application logic here
        int alEdad[];
        alEdad = new int[TAMA_ARRE];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < TAMA_ARRE; i++) {
            System.out.println("Introduce una edad: ");
            alEdad[i] = sCaptu.nextInt();
        }
        //Imprimir
        for(int x: alEdad){
            System.out.println("Edades: " + x);
        }
        //Crear duplicado
        int alCopiaEdad[];
        /*alCopiaEdad = alEdad;*/ //No crea un duplicado
        alCopiaEdad = new int[TAMA_ARRE];
        for (int i = 0; i < TAMA_ARRE; i++) {
            alCopiaEdad[i] = alEdad[i];
        }
        for(int x: alCopiaEdad){
            System.out.println(" Copia Edad = " + x);
        }
        System.out.println(alCopiaEdad);
        System.out.println(alEdad);
    }
    
}
