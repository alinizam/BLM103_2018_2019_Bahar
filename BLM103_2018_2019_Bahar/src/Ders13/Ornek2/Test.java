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
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        Memur m=new Memur();
        p.adi="Mehmet";
        System.out.println(m.adi);
        m.maasYazdir();
        
        Isci i=new Isci();
        i.netMaas=3000;
        i.vergi=2000;
        i.maasYazdir();
        
        Personel p1=new Personel();
        p1.netMaas=3000;
        p1.vergi=2000;
        p1.maasYazdir();
        System.out.println("---Memur----");
        Memur m1=new Memur();
        m1.netMaas=3000;
        m1.vergi=2000;
        m1.derece=2;
        m1.maasYazdir();
        
        System.out.println(m1.adi);
    
    }
}
