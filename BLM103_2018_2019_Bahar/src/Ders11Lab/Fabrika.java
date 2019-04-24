/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author alinizam
 */
public class Fabrika {

    static Malzeme malzemeler[] = new Malzeme[5];

    static void malzemeAta(Malzeme m) {
        for (int i = 0; i < malzemeler.length; i++) {
            if (malzemeler[i] == null) {
                malzemeler[i] = m;
                break;
            }
        }
    }

    void malzemeSil(int i) {
        malzemeler[i] = null;
    }

    //Fabrikadaki mevcut malzeme adedini gösteren bir metot tasarlayınız.
    int getMalzemeAdet() {
        int toplam = 0;
        for (Malzeme malzeme : malzemeler) {
            if (malzeme != null) {
                toplam++;
            }
        }
        return toplam;
    }
    
     int getMalzemeTutar() {
        int toplam = 0;
        for (Malzeme malzeme : malzemeler) {
            if (malzeme != null) {
               toplam+=malzeme.fiyat;
            }
        }
        return toplam;
    }

}
