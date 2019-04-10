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
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        Personel p=new Personel();
        p.adi="Ahmet";
        p.unvan="İŞÇİ";
        p.maas=5000;
        f.personelEkle(p);
        Personel p1=new Personel();
        p1.adi="Mehmet";
        p1.unvan="MEMUR";
        p1.maas=6000;
        f.personelEkle(p1);
        System.out.println(f.unvanMaasToplamBul("İŞÇİ"));
        f.zamYap("Ahmet", 400);
        System.out.println(f.unvanMaasToplamBul("İŞÇİ"));
        f.topluZamYap(5500, 5000);
        System.out.println(f.unvanMaasToplamBul("İŞÇİ"));
    }
}
