/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
       // f.malzemeAta(new Malzeme("Kalem", 10));
       // f.malzemeAta(new Malzeme("Silgi", 5));
       // f.malzemeAta(new Malzeme("Defter", 15));
       // f.malzemeSil(0);
        Malzeme m=new Malzeme("Pergel", 50);
        Malzeme m1=new Malzeme("Cetvel", 100);
        System.out.println(f.getMalzemeAdet());
        System.out.println(f.getMalzemeTutar());
    }
}
