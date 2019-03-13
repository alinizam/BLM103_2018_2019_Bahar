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
public class Ornek1 {

    public static void main(String[] args) {
        //Belli bir aralıkta sınırlar dahil kaç tane sayının 7'ye bölündüğünü bulunuz.
        int altSinir = 10, ustSinir = 45;
        int toplam = 0;
        for (int i = altSinir; i <= ustSinir; i++) {
            if (i % 7 == 0) {
                toplam++;
            }
        }
        System.out.println("Toplam = "+toplam);
        
        //Aynı sorunun While ile çözümü
        toplam=0;
        int i = altSinir;
        while(i <= ustSinir ) {
            if (i % 7 == 0) {
                toplam++;
            }
            i++;
        }
        System.out.println("Toplam = "+toplam);        
    }
}
