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
public class Soru1 {

    public static void main(String[] args) {
        /*
        Bir personelin brüt maaşı net, vergi ve prim toplamından oluşmaktadır. 
        Prim yoksa vergi bürüt maaşın %5’idir. 
        Prim miktarı 1000 TL altı olan personeller bürüt maaşının %10’u kadar vergi ödemektedir. 
        Prim miktarı 1000 TL ve üzeri ise vergi ödeme miktarı %20’dir.  
        Brüt maaşı, vergi ve prim verilen bir personelin net maaşını bulan algoritmanın kodunu yazınız.
         */
        //burut=net+vergi+prim;
        //net=burut-(vergi+prim);
        double net, burut = 5000, vergi = 0, prim = 500;
        if (prim == 0) {
            vergi = 0.05 * burut;
        } else if (prim < 1000) {
            vergi = 0.1 * burut;
        } else if (prim >= 1000) {
            vergi = 0.2 * burut;
        }
        net = burut - (vergi + prim);
        System.out.println(net); 
    }
}
