/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek1;

/**
 *
 * @author alinizam
 */
public class Personel {

    int maas;

    void maasDegistir(int maas) {
        maas++;
        System.out.println("Metodun içinde maaş değeri =" + maas);
    }

    void personelMaasDegistir(Personel p) {
        p.maas++;
        System.out.println("Nesne alan metodun içinde maaş değeri =" + p.maas);
    }
    String isim="Kemal";
    void isimDegistir(String isim){
        // String isim="Kemal"; Hatalı kod.
        isim="Mehmet";
    }
}
