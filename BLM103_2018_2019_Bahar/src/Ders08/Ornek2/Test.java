/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08.Ornek2;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        Araba araba=f.arabaUret();
        System.out.println(araba.model);
        
        Araba araba1=f.modelliArabaUret("3 Serisi");
        System.out.println(araba1.model);
    }
}
