/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Vize;

/**
 *
 * @author alinizam
 */
public class Soru5 {

    public static void main(String[] args) {
        int sayi = 10;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(sayi + " ");
                } else if (i > j) {
                    System.out.print("x ");
                } else {
                    System.out.print("y ");
                }
            }
            sayi -= 2;
            System.out.println("");
        }
    }
}
