/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek16 {
    public static void main(String[] args) {
        // 1 2 3 
        // 4 5 6
        // 7 8 9
        int n=4;
        int sayi=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((sayi++)+" ");
            }
            System.out.println();
        }     
   
        
    }
}
