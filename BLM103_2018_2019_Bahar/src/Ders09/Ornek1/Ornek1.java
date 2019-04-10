/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek1;

import Ders09.Ornek1.Personel;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
       Personel p=new Personel();
       int maas=0;
       p.maasDegistir(maas);
       System.out.println("Metodun çağrıldığı yerde maaş değeri ="+maas);
       
       Personel memur=new Personel();
       p.personelMaasDegistir(memur);
       System.out.println("Nesne alan metodun çağrıldığı yerde maaş değeri ="+memur.maas);
       
       String s="Ahmet";
       p.isimDegistir(s);
       System.out.println(s);
       
       Araba a=new Araba();
       System.out.println(a.toString());
       
       Araba a1=new Araba();
       System.out.println(a1.toString());
       a1=a;
       System.out.println(a.equals(a1));
       System.out.println(a==a1);
       
       
       
       
    }
    
}
