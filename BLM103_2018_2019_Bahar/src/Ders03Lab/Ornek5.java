/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    /*
    Dönem sonunda 70 ve üzeri not ortalamasına sahip öğrencilerin geçebildiği 
    bir derste; vize notu 47, proje notu 54 olan 
    bir öğrencinin final sınavından en az kaç alırsa geçebileceğini hesaplayan 
    ve ekrana yazdıran bir program tasarlayınız.

    */
    public static void main(String[] args) {
        double vizeNot=47,projeNot=54,finalNot;
        double donemIciPuan=vizeNot*0.3+projeNot*0.2; 
        double gecmeNotu=70;
        double kazanmamGerekenNot=gecmeNotu- donemIciPuan;
        finalNot=kazanmamGerekenNot/(0.5);
        System.out.println(finalNot);
    }
}
