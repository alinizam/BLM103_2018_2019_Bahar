/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek12;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek11 {
    public static void main(String[] args) {
        ArrayList iller=new ArrayList();
        iller.add("Ankara");
        iller.add("İstanbul");
        iller.add("Van");
        System.out.println(iller.size());
        System.out.println(iller);
        iller.remove("Van");
        System.out.println(iller);
        for (Object il : iller) {
            System.out.println(il);
        }
        ArrayList sayilar=new ArrayList();
        sayilar.add(10);
        sayilar.add(15);
        sayilar.add("İstanbul");
        int toplam=0;
        for (Object sayi : sayilar) {
            toplam+=(int)sayi;
        }
        System.out.println("Toplam = "+toplam);
        
    }
}
