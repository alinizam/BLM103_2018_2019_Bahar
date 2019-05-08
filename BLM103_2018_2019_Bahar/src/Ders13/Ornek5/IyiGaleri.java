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
public class IyiGaleri {

    Araba genelArabalar[] = new Araba[15];

    int getToplamArabaTutar() {
        int toplam = 0;
        for (Araba araba : genelArabalar) {
            if (araba != null) {
                toplam += araba.getFiyat();
            }
        }

        return toplam;
    }
}
