
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
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Ingresa el número de objetos");
        int iNumero = sCaptu.nextInt();
        
        int iObjetos[] = new int [iNumero];
        for (int i = 0; i < iNumero; i++) {
            System.out.println("Numero de objeto");
            iObjetos[i] = sCaptu.nextInt();     
        }
        Scanner sCaptubusc = new Scanner(System.in);
        System.out.println("¿Cuál número quieres buscar?");
        int iEnco = sCaptubusc.nextInt();
        for (int i = 0; i < iObjetos.length; i++) {
            if(iObjetos[i]==iEnco)
                i++;
                System.out.println("El número que buscas está en la"
                                                + "posición +" + i);
            
        }
        }
   
}
