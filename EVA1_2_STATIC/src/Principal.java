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
    MiClasePrueba mcpObjeto = new MiClasePrueba();
    mcpObjeto.imprimitMensaje();
    System.out.println(mcpObjeto.sNom);
    MiClasePrueba2.imprimitMensaje();
    MiClasePrueba2.sNom = "Alonso Parra Espinoza";
    //Static significa que no se tiene que crear una instancia
    //que son fijas
    //Dinámicas son que van a estar cambiando y es cuando corre
        System.out.println(MiClasePrueba2.sNom);
    }
    
}

class MiClasePrueba{
    public String sNom = "Alonso";
    public void imprimitMensaje(){
        System.out.println("Hola mundo!!");
    }
}
class MiClasePrueba2{
    public static String sNom = "Alonso";
    public static void imprimitMensaje(){
        System.out.println("Hola mundo!!");
    }
}