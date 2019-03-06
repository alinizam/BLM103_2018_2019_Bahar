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
public class Ornek17 {

    public static void main(String[] args) {
        int sayi = 50;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(sayi+" ");
                if (i-1!=j) sayi -= i;
            }
            System.out.println();
        }
    }
}
