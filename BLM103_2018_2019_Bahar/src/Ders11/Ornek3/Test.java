/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek3;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a=new Araba();
        Araba a1=new Araba();
        new Araba();
        System.out.println(Araba.uretilenArabaAdet);
        arabaUret();
        System.out.println(Araba.uretilenArabaAdet);
        Fabrika f=new Fabrika();
        f.arabaUret();
        System.out.println(Araba.uretilenArabaAdet);
        
        Araba araba1=new Araba();
        araba1.fabrika="Bursa";
        
        Araba araba2=new Araba();
        araba2.fabrika="İzmit";
        
        System.out.println(araba1.fabrika);
  
    }
    static void arabaUret(){
        new Araba();
    }
}
