/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek1;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel calisanlar[]=new Personel[3];
        Personel p=new Personel();
        p.adi="Ahmet";
        p.maas=3000;
        calisanlar[0]=p;
        calisanlar[1]=p;
        calisanlar[1].maas=4000;
        calisanlar[2]=p;
        calisanlar[2].maas=5000;
        int toplamMaas=0;
        for (Personel personel : calisanlar) {
            toplamMaas+=personel.maas;
        }
        System.out.println("Toplam maaş  ="+toplamMaas);    
    }
}
