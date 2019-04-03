/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab.Ornek1;

/**
 *
 * @author alinizam
 */
public class Personel {

    String ad, soyad;
    int netMaas, calismaSure;

    void ismi_goster() {
        System.out.println(ad + " " + soyad);
    }
    String ismi_bul (){
        return ad+" "+soyad;
    }
    void setMaas(){
        if (calismaSure<10)
          netMaas=3000;
        else if (calismaSure>=10)
          netMaas=4000;
    
    }
    
    void maasAta(int m){
        netMaas=m;
    }
    
    int maasOku(){
        return netMaas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }
    
    
}
