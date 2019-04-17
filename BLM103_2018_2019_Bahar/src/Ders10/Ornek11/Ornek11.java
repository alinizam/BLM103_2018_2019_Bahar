/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek11;

/**
 *
 * @author alinizam
 */
public class Ornek11 {
    public static void main(String[] args) {
        System.out.println(topla()); 
        System.out.println(topla(10));
        System.out.println(topla(15,5)); 
        System.out.println(topla(new int[]{1,3,5}));
    }
    static int topla(int... sayilar){
       int toplam = 0;
        for (int i : sayilar) {
            toplam+=i;
        }
       
       return toplam; 
    }
     static int topla1(int... sayilar){
       int toplam = 0;
        for (int i : sayilar) {
            toplam+=i;
        }
       
       return toplam; 
    }
}
