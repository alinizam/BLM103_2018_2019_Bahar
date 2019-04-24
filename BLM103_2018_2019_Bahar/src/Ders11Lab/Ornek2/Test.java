/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab.Ornek2;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Ogrenci o=new Ogrenci();
        o.notlar.add(new OgrenciNot("Matematik",new int[]{90,80,70}));
        o.notlar.add(new OgrenciNot("fizik",new int[]{100,90,80}));
        System.out.println(o.getNotOrtalama());
        o.dersEkle("Programlama");
        System.out.println(o.getNotOrtalama());
        
    }
}
