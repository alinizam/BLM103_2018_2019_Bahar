/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

/**
 *
 * @author alinizam
 */
class Araba {
    String plaka;
    Personel soforler[]=new Personel[3];
    
    void hizYaz(double hiz){
       System.out.println("Double"+hiz);
    }
    
    void hizYaz(int hiz){
       System.out.println("int"+hiz);
    }
    
    void hizYaz(byte hiz){
       System.out.println("byte "+hiz);
    }
    
    void hizYaz(byte hiz,int ivme){
       System.out.println("byte "+hiz);
    }
    
    void hizYaz(int ivme,byte hiz){
       System.out.println("byte "+hiz);
    }
    
   /* Hata: Farklı dönüş türü overload için yeterli değil.
    void hizYaz(byte hiz1){
       System.out.println("byte "+hiz1);
    }*/
      
}
