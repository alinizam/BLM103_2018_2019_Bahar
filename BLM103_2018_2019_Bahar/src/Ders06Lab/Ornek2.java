/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        int sayi=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(sayi + " ");
                sayi*=2;
            }
            System.out.println();
        }
    }
}
