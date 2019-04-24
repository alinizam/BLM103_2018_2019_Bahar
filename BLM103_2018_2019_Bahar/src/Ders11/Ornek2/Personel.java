/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author alinizam
 */
public class Personel {
    int maas;
    String adi,soyadi;
    Personel(){
        System.out.println("Çağrıldı");
    }

    public Personel(int maas) {
        this.maas = maas;
    }

    public Personel(int maas, String adi, String soyadi) {
        this.maas = maas;
        this.adi = adi;
        this.soyadi = soyadi;
    }
    

   
    
}
