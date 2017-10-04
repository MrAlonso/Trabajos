/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alons
 */
public class Principal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matrix[][]={
            {10,11,12,13,14},
            {15,16,17,18,19},
            {20,21,22,23,24},
            {25,26,27,28,29},
            {30,31,32,33,34}
        };
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
           
                System.out.print(matrix[i][j]+ " ");        
            }
            
        }
        System.out.println("El orden inverso impreso es: ");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        
                        
                    }
                    System.out.println(matrix[(5-1)-i][(5-1)-i]);
            
        }
    }
    
}
