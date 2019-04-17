/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Fabrika {
    ArrayList<Personel> calisanlar=new ArrayList();
    ArrayList<Birim> birimler=new ArrayList();
    
    void personelEkle(Personel p){
        calisanlar.add(p);
    }
    int getPersonelMaas(String unvan){
        int toplam=0;
        for (Personel personel : calisanlar) {
            if (personel.unvan.equals(unvan)){
                toplam+=personel.maas;
            }
        }
        return toplam;
    }
    void kisiyeZamYap(int id, int zam){
        for (Personel personel : calisanlar) {
            if (personel.id==id){
                personel.maas+=zam;
            }
        }
    }
     void topluZamYap(int asgariMaas, int zam){
        for (Personel personel : calisanlar) {
            if (personel.maas<asgariMaas){
                personel.maas+=zam;
            }
        }
    }
     
    void ekOdemeAlmayan(){
        for (Personel personel : calisanlar) {
            int ekOdemeToplam=0;
            for (int odeme : personel.ekOdeme) {
                ekOdemeToplam+=odeme;
            }
            if (ekOdemeToplam==0){
                System.out.println(personel.adi+" "+personel.soyadi);
            }
        }
    }
    void tumPersonelTransferEt(Birim kaynak,Birim hedef){
        /*for (int i = 0; i < kaynak.calisanlar.size(); i++) {
            hedef.calisanlar.add(kaynak.calisanlar.get(i));
        }*/
        hedef.calisanlar.addAll(kaynak.calisanlar);
        kaynak.calisanlar.removeAll(kaynak.calisanlar);
    }
    void personelTransferEt(Birim kaynak,Birim hedef,Personel p){
        hedef.calisanlar.add(p);
        kaynak.calisanlar.remove(p);
    }
    void ekOdemeToplamYazdir(){
        
        for (Birim birim : birimler) {
            int birimToplam=0;
            for (Personel personel : birim.calisanlar) {
                 for (int i : personel.ekOdeme) {
                    birimToplam+=i;
                 }
            }
            System.out.println(birim.birimAdi+" "+birimToplam);
        }
       
    
    }
}
