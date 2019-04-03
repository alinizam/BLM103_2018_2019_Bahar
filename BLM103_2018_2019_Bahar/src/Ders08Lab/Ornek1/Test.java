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
public class Test {
    public static void main(String[] args) {
        Personel p1=new Personel();
        p1.ad="ahmet";
        p1.soyad="ak";
        p1.ismi_goster();
        System.out.println( p1.ismi_bul());
        String adsoyad=p1.ismi_bul();
        System.out.println(adsoyad);
        //  int a=p1.ismi_bul(); hatalı
        
        
        p1.calismaSure=15;
        System.out.println(p1.netMaas);
        p1.setMaas();
        System.out.println(p1.netMaas);
       
    }
}
