/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek9 {

    public static void main(String[] args) {
        //2.	(15) Verilen bir aralıkta 7’ye bölümü en büyük kalanı veren sayıyı bulunuz. 
        //(Örnek: 16 ve 22 verildiğinde sonuç 20 olmalıdır.)
        int ilkDeger = 16, sonDeger = 22;
        // For (ilkdeger --> son değer) {
        int enBuyukKalan = 0;
        int kalan = 0;
        for (int i = ilkDeger; i < sonDeger; i++) {
            //sayıyı 7'ye böl sonucu sakla 
            kalan = i % 7;
            //sonucu onceki sonuçla karşılaştır.

            if (enBuyukKalan < kalan) //en büyüğe ata
            {
                enBuyukKalan = kalan;
            }
        }
        System.out.println("En büyük kalan = "+enBuyukKalan);

    }
}
