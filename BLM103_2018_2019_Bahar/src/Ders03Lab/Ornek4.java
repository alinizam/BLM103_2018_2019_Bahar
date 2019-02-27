/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        int sayac = 0;
        int sayı = 15;
        if (sayı % 2 == 0) {
            sayac++;
            sayı /= 2;
            if (sayı % 2 == 0) {
                sayac++;
                sayı /= 2;
                if (sayı % 2 == 0) {
                sayac++;
                sayı /= 2;
                
            }
            }
        }
        System.out.println(sayac);
    }
}
