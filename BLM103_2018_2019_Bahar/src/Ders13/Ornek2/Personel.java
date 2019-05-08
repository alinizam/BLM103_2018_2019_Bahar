/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek2;

/**
 *
 * @author alinizam
 */
public class Personel {
    String adi="Ahmet",soyadi;
    private String personelTuru;
    int netMaas,vergi,ek;
    void maasYazdir(){
        int toplamMaas=netMaas+vergi+ek;
        System.out.println("Toplam maaş: "+toplamMaas);
    }
}
