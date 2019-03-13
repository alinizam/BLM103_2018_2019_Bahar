/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        int sayi=1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10-i+1; j++) {
                System.out.print((sayi++) +" ");
            }
            System.out.println("");    
        }
    }
}
