/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab.Ornek3;

/**
 *
 * @author alinizam
 */
public class SiviTest {
    public static void main(String[] args) {
        Sivi s=new Sivi();
        s.kaynamaNoktasi=100;
        s.toplamLitre=30;
        s.sicaklik=80;
        for (int i = 0; i < 70; i++) {
            System.out.println(i+" "+s.sicaklikArttir()+":"+s.sicaklik);
        }
    }
}
