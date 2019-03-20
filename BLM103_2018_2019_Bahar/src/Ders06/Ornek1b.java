/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek1b {

    /*
        Bir kişi çalıştığı şirketten Ocak Şubat ve Mart aylarında her ay için  
        %10 zam almaktadır.Sonraki aylarda yeni zam almadan maaşı devam etmektedir. 
        Bu kişinin ilk ayın başında maaşı 10000 TL ise, 
        girilen bir ay numarasındaki maaşını hesap eden bir algoritma yazınız. 
     */
    public static void main(String[] args) {
        double maas = 10000;
        int ayNo = 5;
        if (ayNo == 1) {
            maas = 1.1 * maas;
        } else if (ayNo == 2) {
            maas = 1.1 * 1.1 * maas;
        } else if (ayNo >= 3) {
            maas = 1.1 * 1.1 * 1.1 * maas;
        } 
        System.out.println("Maas = "+maas);

    }

}
