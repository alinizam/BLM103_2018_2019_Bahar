/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author alinizam
 */
public class Soru4 {
    public static void main(String[] args) {
        int k=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println("");
        }
    }
}
