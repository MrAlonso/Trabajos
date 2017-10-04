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
        int i = 5;
        System.out.println(" i = " + i);
        //CREAR UNA COPIA DE i
        int iCopia = i; //Se asigna el valor de la i a la variable iCopia
        System.out.println("Copia de i = " + iCopia);
        i++;
        System.out.println("i++ = " + i);
        System.out.println("iCopia =" + iCopia);
        //DECLARAR UN OBJETO DE TIPO NUMERO
        Numero nVal = new Numero(); //Creamos el objeto
        System.out.println("Valor de nVal.i =" + nVal.i);
        Numero nCopiaVal = nVal; //CREAMOS UNA "COPIA" <--no es copia
        System.out.println("Valor de nCopiaVal,i" + nCopiaVal.i);
        nVal.i++;
        //Imprimimos nVal y nCopiaVal
        System.out.println("Valor de nVal.i =" + nVal.i);    
        System.out.println("Valor de nCopiaVal,i" + nCopiaVal.i);
        //IMPRIMIR OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        //Crear copia real de un objeto
        Numero nCopiaReal = new Numero();
        nCopiaReal.i = nVal.i;
        System.out.println("Valor de nVal.i =" + nVal.i);    
        System.out.println("Valor de nCopiaReal,i" + nCopiaVal.i);
        //Imprimir lo objetos
        System.out.println(nVal);
        System.out.println(nCopiaReal);
    }
    
}
class Numero{
    public int i = 10;
}