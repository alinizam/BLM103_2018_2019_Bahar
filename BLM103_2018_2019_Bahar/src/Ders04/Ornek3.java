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
public class Ornek3 {

    public static void main(String[] args) {
        //Birden 10'a kadar olan sayıları toplatınız.
        int i = 1;
        int toplam = 0;
        while (i <= 10) {
            toplam = toplam + i;
            System.out.println(i+" anlık toplam "+toplam);
            i++;

        }
        System.out.println("Toplam = "+toplam);
    }
}
