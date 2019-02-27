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
public class Ornek4 {

    public static void main(String[] args) {
        int i = 12;        // 1100
        int j = 5;         // 0101
        int sonuc = i | j; // 1101
        System.out.println("Sonuç = " + sonuc);

        sonuc = ~sonuc;

        //~00001101 = 11110010        
        System.out.println(0b1110010);
        System.out.println("Sonuç = " + sonuc);

        //1100
        //0101
        //1100 ^ 0101 = 1001
        System.out.println(i ^ j);
        System.out.println((( i ^ j)==0)?"Eşit":"Eşit Değil");
        System.out.println((( i == j))?"Eşit":"Eşit Değil");
    }
}
