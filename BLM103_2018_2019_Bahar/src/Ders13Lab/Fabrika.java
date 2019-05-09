/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Fabrika {

    ArrayList<Personel> personeller = new ArrayList();
    Birim Birimler[] = new Birim[5];

    void personelEkle(Personel p) {
        personeller.add(p);
    }

    String[] getPersonelTurAdet() {
        String[] turAdetler = new String[5];
        int[] adetler = new int[5];
        for (Personel p : personeller) {
            if (p instanceof Sozlesmeli) {
                adetler[3]++;
                turAdetler[3] = "Sözleşmeli " + adetler[3];
            } else if (p instanceof Kadrolu) {
                adetler[4]++;
                turAdetler[4] = "Kadrolu " + adetler[4];
            } else if (p instanceof Memur) {
                adetler[1]++;
                turAdetler[1] = "Memur " + adetler[1];
            } else if (p instanceof Isci) {
                adetler[2]++;
                turAdetler[2] = "İşçi " + adetler[2];
            } else if (p instanceof Personel) {
                adetler[0]++;
                turAdetler[0] = "Personel " + adetler[0];
            }

        }
        return turAdetler;
    }

    Sozlesmeli getUzunCalisanSozlesmeli() {
        Sozlesmeli aranan = null;
        int enUzunSure = 0;
        for (Personel personel : personeller) {
            if (personel instanceof Sozlesmeli) {
                if (enUzunSure < ((Sozlesmeli) personel).sozlesmeSuresi) {
                    enUzunSure = ((Sozlesmeli) personel).sozlesmeSuresi;
                    aranan = (Sozlesmeli) personel;
                }
            }
        }
        return aranan;
    }

    ArrayList<Birim> getSozlesmesizBirim() {
        ArrayList<Birim> sozlesmesizBirimler = new ArrayList();
        for (Birim birim : Birimler) {
            boolean varMi = false;
            for (Personel p : personeller) {
                if (p.birim == birim && (p instanceof Sozlesmeli)) {
                    varMi = true;
                    break;
                }
            }
            if (!varMi) {
                sozlesmesizBirimler.add(birim);
            }
        }
        return sozlesmesizBirimler;
    }

}
