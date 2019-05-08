/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek5;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Araba araba=new Araba();
        System.out.println(araba.getFiyat());
        araba=new Mercedes();
        System.out.println(araba.getFiyat());
        
        IyiGaleri ig=new IyiGaleri();
        ig.genelArabalar[0]=new Mercedes();
        ig.genelArabalar[1]=new Araba();
        ig.genelArabalar[2]=new Mercedes();
        ig.genelArabalar[3]=new Mercedes();
        ig.genelArabalar[4]=new Bmw();
        System.out.println(ig.getToplamArabaTutar());
        
    }
}
