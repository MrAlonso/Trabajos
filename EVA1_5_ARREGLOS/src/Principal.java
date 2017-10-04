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
        int alMisNume[] = new int[10]; //Arreglos
        for (int i = 0; i < 10; i++) { 
            alMisNume[i] = (int)(Math.random()*10) + i;
        }
        //FOR EACH
        for(int x : alMisNume){ //Equivalente a int x; for(int i=0 <10; i++()
            System.out.println(" x = " + x);
    }
        //Multiples arreglos.  <------ Todos son arreglos
        int[] alArreglo1, alArreglo2, alArreglo3;
        alArreglo1 = new int [3];
        alArreglo2 = new int [10];
        alArreglo3 = new int [100];
        
        //Arreglos y variables <---- SOLO AlArre[] es Arreglo
        int alArre[], iVar, iVar2;
        alArre= new int[10];
        iVar = 10;
        iVar = 30;
    }
    
}
