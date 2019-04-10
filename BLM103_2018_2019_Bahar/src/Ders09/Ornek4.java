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
public class Ornek4 {
    public static void main(String[] args) {
        //Eleman toplamı
        int sayilar[]={1,5,6,8,2};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }
        System.out.println("Toplam = "+toplam);
    }
}
