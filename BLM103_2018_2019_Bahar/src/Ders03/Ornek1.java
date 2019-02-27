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
public class Ornek1 {

    public static void main(String[] args) {
        int sayi1 = 5, sayi2 = 11, sayi3 = 1;
        int enBuyukSayi;
        enBuyukSayi = (sayi1 > sayi2) ? sayi1 : sayi2;
        enBuyukSayi = (enBuyukSayi > sayi3) ? enBuyukSayi:sayi3;
        System.out.println("En büyük sayı = "+enBuyukSayi);
    }
}
