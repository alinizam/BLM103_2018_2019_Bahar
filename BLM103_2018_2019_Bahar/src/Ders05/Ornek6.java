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
public class Ornek6 {

    public static void main(String[] args) {
        //Bir ile 10 arasındaki sayıları yazdırınız. 5'e bölünenler hariç
        /* for (int i = 0; i < 10; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
                System.out.println("İşlemler");
                System.out.println("Çalışmalar");
            }
        }*/
        for (int i = 0; i < 10; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
            System.out.println("İşlemler");
            System.out.println("Çalışmalar");
        }
    }
}
