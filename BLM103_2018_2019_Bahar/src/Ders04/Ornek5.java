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
public class Ornek5 {

    //Bir sayının kendisi hariç bölenlerini bulunuz.
    public static void main(String[] args) {
        int sayi = 18;
        //sayidan küçük sayıları dön
        int i = sayi / 2;
        while (i > 0) {
            //bölünüyor mu kontrol et
            if (sayi % i == 0) //evetse yazdır
            {
                System.out.println(i);
            }
            i--;
        }
    }
}
