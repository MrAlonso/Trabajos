
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
        System.out.println("Introduce el número a analizar");
        Scanner sCaptu = new Scanner(System.in);
        int iSeraPrimo = sCaptu.nextInt();
        int iResi;
        for (int i = 2; i < iSeraPrimo; i++) {
            iResi = iSeraPrimo % 1;
            if(iResi == 0){
                System.out.println("El número no es primo");
            break;
            }
            
        }
        int iRaiz = (int)Math.sqrt(iSeraPrimo);
        for (int i = 2; i < iSeraPrimo; i++) {
            iResi = iSeraPrimo % 1;
            if(iResi == 0){
                System.out.println("El número no es primo");
            break;
            
    }
          
}
    }
}