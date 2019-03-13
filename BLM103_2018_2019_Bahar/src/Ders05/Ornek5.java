/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        //Verilen bir aralıkta asal olmayan sayı var mı ?
        int altSinir = 10, ustSinir = 45;
        boolean asalMi = true;
        int sayac=0;
        dis:
        for (int i = altSinir; i < ustSinir; i++) {
            for (int j = 2; j <= i / 2; j++) {
                 sayac++;
                if (i % j == 0) {
                    asalMi = false;
                    break dis;
                }
                System.out.println(i+":"+j);
               
            }
        }
        System.out.println("Döngü sayısı = "+sayac);
        System.out.println("Asal olmayan sayı var mi ="+!asalMi);
    }
}
