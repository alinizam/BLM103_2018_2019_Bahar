/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek7;

/**
 *
 * @author alinizam
 */
public class ArabaTest {

    public static void main(String[] args) {
        Araba arabalar[] = new Araba[3];
        arabalar[0] = new Araba();
        arabalar[0].fiyat = 50000;
        arabalar[1] = new Araba();
        arabalar[1].fiyat = 100000;
        arabalar[2] = new Araba();
        arabalar[2].fiyat = 150000;
        int toplam = 0;
        for (int i = 0; i < arabalar.length; i++) {
            toplam += arabalar[i].fiyat;
        }
        System.out.println("Toplam= "+toplam);
    }
}
