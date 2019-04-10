/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        //3'e bölünen ve 6 dan büyük elemanların toplamı
        int sayilar[] = {1, 5, 6, 8, 9};
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 3 == 0  && sayilar[i]>6) {
                toplam = toplam + sayilar[i];
            }
        }
        System.out.println("Toplam = " + toplam);
    }
}
