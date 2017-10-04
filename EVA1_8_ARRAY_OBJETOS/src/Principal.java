
import java.text.Normalizer;

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
        Alumno aaDatosAlumno[]; //El identificador es nulo
        aaDatosAlumno = new Alumno[10]; //Creamos un arreglo de 10
                                        //Alumnos AQUI HABRÁ PREGUNTA
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Alonso", "16550480" , 0);
        }
    for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre: " + aaDatosAlumno1.getsNom());
            System.out.println("Matricula: " + aaDatosAlumno1.getsMatri());
            System.out.println("Carrera: " + aaDatosAlumno1.getiCar());
    } 
    //Copia el arreglo de alumnos
    Alumno aaCopia[] = new Alumno[10];
    //CREAR OBJETOS Y COPIAR ALUMNOS
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaCopia[i] = new Alumno(aaDatosAlumno[i].getsNom(),
                                    aaDatosAlumno[i].getsMatri(),
                                    aaDatosAlumno[i].getiCar());
        }
        //Imprimir copia
        for(Alumno aaCopia1: aaCopia) {
            System.out.println("Nombre: " + aaCopia1.getsNom());
            System.out.println("Matricula: " + aaCopia1.getsMatri());
            System.out.println("Carrera: " + aaCopia1.getiCar());
        }
        }
    
    }
 
class Alumno{
    private String sNom;
    private String sMatri;
    private int iCar;
    
   public Alumno(String sNombre, String sMatricula, int iCarrera){
       sNom = sNombre;
       sMatri = sMatricula;
       iCar = iCarrera;
       
   } 

        public String getsNom() {
            return sNom;
        }

        public void setsNom(String sNom) {
            this.sNom = sNom;
        }

        public String getsMatri() {
            return sMatri;
        }

        public void setsMatri(String sMatri) {
            this.sMatri = sMatri;
        }

        public int getiCar() {
            return iCar;
        }

        public void setiCar(int iCar) {
            this.iCar = iCar;
        }
   
}

