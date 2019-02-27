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
public class Ornek9 {

    public static void main(String[] args) {
        int sayi1 = 10, sayi2 = -20;
        int sayi1Mutlak = sayi1, sayi2Mutlak = sayi2;
        //sayı pozitif mi negatif mi?
        if (sayi1 < 0) {
            sayi1Mutlak = (-1) * sayi1;
        }
        if (sayi2 < 0) {
            sayi2Mutlak = (-1) * sayi2;
        }
        if (sayi1Mutlak >= sayi2Mutlak) {
            System.out.println("Sayı = " + sayi1);
        }
        if (sayi1Mutlak < sayi2Mutlak) {
            System.out.println("Sayı = " + sayi2);
        }
    }
}
