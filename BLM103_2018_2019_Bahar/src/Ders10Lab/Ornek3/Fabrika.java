/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Ornek3;

/**
 *
 * @author alinizam
 */
public class Fabrika {

    Personel calisanlar[] = new Personel[3];

    void personelEkle(Personel p) {
        for (int i = 0; i < calisanlar.length; i++) {
            if (calisanlar[i] == null) {
                calisanlar[i] = p;
                break;
            }
        }
    }
    int unvanMaasToplamBul(String unvan){
        int unvanToplam=0;
        for (int i = 0; i < calisanlar.length; i++) {
            if (calisanlar[i] != null && calisanlar[i].unvan.equals(unvan) ) {
                unvanToplam+=calisanlar[i].maas;
            }
        }
        return unvanToplam;
    }
    void zamYap(String adi,int zam){
        for (int i = 0; i < calisanlar.length; i++) {
            if (calisanlar[i] != null && calisanlar[i].adi.equals(adi) ) {
               calisanlar[i].maas+=zam;
            }
        }
        
    }
    
    void topluZamYap(int sinirDeger,int zam){
        int unvanToplam=0;
        for (int i = 0; i < calisanlar.length; i++) {
            if (calisanlar[i] != null && calisanlar[i].maas<sinirDeger ) {
                calisanlar[i].maas+=zam;
            }
        }
    }
    
}
