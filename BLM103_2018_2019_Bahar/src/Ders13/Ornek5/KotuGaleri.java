/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek5;

/**
 *
 * @author alinizam
 */
public class KotuGaleri {
    Araba genelArabalar[]=new Araba[5];
    Mercedes mercedesler[]=new Mercedes[5];
    Bmw bmwler[]=new Bmw[5];
    int getToplamArabaTutar(){
        int toplam=0;
        for (Araba araba : genelArabalar) {
            toplam+=araba.getFiyat();
        }
        for (Mercedes m : mercedesler) {
            toplam+=m.getFiyat();
        }
        for (Bmw b : bmwler) {
            toplam+=b.getFiyat();
        }
         return toplam; 
     } 
}
