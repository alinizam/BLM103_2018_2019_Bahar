/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab.Ornek3;

/**
 *
 * @author alinizam
 */
public class Sivi {

    int sicaklik, toplamLitre, kaynamaNoktasi;

    void buharlas() {
        if (toplamLitre > 0) {
            toplamLitre--;
        }
    }

    int sicaklikArttir() {
        if (sicaklik < kaynamaNoktasi) {
            sicaklik++;
        } else {
            buharlas();
        }
        int sonuc;
        if (toplamLitre == 0) {
            sonuc = -1;
        } else {
            sonuc = toplamLitre;
        }
        return sonuc;
    }

}
