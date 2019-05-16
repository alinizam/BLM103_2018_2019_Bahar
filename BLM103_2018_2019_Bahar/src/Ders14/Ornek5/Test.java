/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek5;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a=new Araba(100);
        ISekil sekilliCisim=new Araba(100);
        sekilliCisim.getAlan();
         
        IHareketEdebilir cisim=new Araba(100);
        yazCisimHiz(cisim);
        cisim=new Bulut(50);
        yazCisimHiz(cisim);  
    }
    static void yazCisimHiz(IHareketEdebilir cisim){
        System.out.println(cisim.getHiz());
    }
}
