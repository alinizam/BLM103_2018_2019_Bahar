/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

/**
 *
 * @author alinizam
 */
public class ZamanTest {
    public static void main(String[] args) {
        Zaman z=new Zaman();
        z.saat=23;
        z.dakika=59;
        z.saniye=55;
        for (int i = 0; i < 1000; i++) {
            z.saniyeArtir();
            z.saatGoster();
        }
    }
}
