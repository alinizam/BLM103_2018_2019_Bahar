/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek13;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek12 {
    public static void main(String[] args) {
        ArrayList<Integer>  sayilar=new ArrayList();
        sayilar.add(100);
        sayilar.add(200);
        int toplam=0;
        for (Integer i : sayilar) {
            toplam+=i;
        }
        System.out.println("Toplam = "+toplam);
        
        ArrayList<Personel> personeller=new ArrayList();
        personeller.add(new Personel());
        personeller.get(0).adi="Ahmet";
        personeller.get(0).maas=100000;
        Personel p=new Personel();
        p.adi="Mehmet";
        p.maas=50000;
        personeller.add(p);
        toplam=0;
        for (Personel personel : personeller) {
            toplam+=personel.maas;
        }
        System.out.println("Toplam = "+toplam);
        
    }
    
}
