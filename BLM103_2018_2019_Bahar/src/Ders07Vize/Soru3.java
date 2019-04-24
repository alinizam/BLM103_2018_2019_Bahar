/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Vize;

/**
 *
 * @author alinizam
 */
public class Soru3 {
    public static void main(String[] args) {
        int sayi=162456;
        int toplam=0;
        while(sayi>0){
            toplam+=sayi%10;
            sayi=sayi/10;
        }
        System.out.println("Toplam = "+toplam);
    }
}
