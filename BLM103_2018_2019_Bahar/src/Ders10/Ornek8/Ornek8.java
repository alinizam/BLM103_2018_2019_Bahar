/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek8;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        //İçinde iki rakkamı geçmeyen satırları bulunuz ?
        int aranan=2; 
        int A[][] = {{1, 5 , 3}, {3, 2 , 6}, {1, 3, 3}};
        boolean varMi=false; 
        for (int i = 0; i < A.length; i++) {
             varMi=false;
             for (int j = 0; j < A[i].length; j++) {
                 if(A[i][j]==aranan){
                    varMi=true;
                    break;
                 }    
             }
             if (!varMi){
                 System.out.println(i+". satırda "+aranan+" yok");
             }
             
        }
    }
}
