/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author alinizam
 */
public class Ornek10 {

    public static void main(String[] args) {
        int sayi1 = 10, sayi2 = -20;
        int sayi1Mutlak = sayi1, sayi2Mutlak = sayi2;
        sayi1Mutlak = (sayi1 < 0) ? sayi1 : sayi1;
        sayi2Mutlak = (sayi2 < 0) ? -sayi2 : sayi2;
        int mutlakDegeriBuyukSayi = (sayi1Mutlak >= sayi2Mutlak) ? sayi1 : sayi2;
        System.out.println("Mutlak Değeri Büyük sayı = " + mutlakDegeriBuyukSayi);
    }
}
