/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek4;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        new Araba(100000,"İstanbul");
        new Araba(150000,"Bursa");
        new Araba(200000,"Bursa");
        
        
        for (Araba araba : Araba.arabalar) {
            System.out.println(araba.fiyat);
        }
        
        Sube s=new Sube();
        int fiyat=s.arabalar.get(0).fiyat;
        deneme();
    }
    
    static void deneme(){
    
    }
}
