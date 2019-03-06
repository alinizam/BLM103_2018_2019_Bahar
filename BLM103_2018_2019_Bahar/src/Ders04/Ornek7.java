/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
     public static void main(String[] args) {
        //İki sayının bölenleri arasındaki kendileri hariç en büyük sayıyı bulunuz. 
        int sayi1 = 12, sayi2 = 14;
        int bolen = 1;
        int enBuyukBolen=1;
        while (bolen <= sayi1 / 2 || bolen <= sayi2 / 2) {
            if (sayi1%bolen==0 || sayi2%bolen==0){
               enBuyukBolen=bolen;
            }
            bolen++;
        }
        System.out.println(enBuyukBolen);
    }
}
