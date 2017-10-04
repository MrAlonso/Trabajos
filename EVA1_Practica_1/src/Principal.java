
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
    static double numeros;
    static double media;
    static double varianza;
    static double desviacion;
    static int n;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Edades a capturar");
        n= sc.nextInt();
        
        double numeros[]= new double[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Ingrese las edades"); 
            numeros[i]= sc.nextDouble();
        }
        double suma=0;
        for (double i : numeros) 
        {
         suma= suma+ i;
        }
         media= suma/n;
         System.out.println("La media es: "+ media);
         
         double sumatoria;
         for (int i = 0; i < n; i++) {
            sumatoria= Math.pow(numeros[i]- media,2);
            varianza= varianza + sumatoria;   
        }
         varianza= varianza/(n-1);
         
         desviacion= Math.sqrt(varianza);
         double redondeo= Math.rint(desviacion*100)/100;
         System.out.println("La desviación estandar es: "+ redondeo);
         
         int mNumRep=0;
         double moda = 0;
         for (int i = 0; i < numeros.length-3; i++) {
         int NumRep=0;
         for (int j = 0; j < numeros.length-3; j++) {
         if(numeros[i]==numeros[j]);
         NumRep++;
         }
         if(NumRep>mNumRep){
         moda= numeros[i];
         mNumRep=NumRep;         
         }
             System.out.println("La moda es: "+ moda);
        }
        }
} 
