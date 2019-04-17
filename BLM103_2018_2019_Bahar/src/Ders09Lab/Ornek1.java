/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        int []dizi={4,8,78,98,8,5};
        
        int arananSayi=80;
        boolean varmi=false;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==arananSayi){
                varmi=true;
                break;
            }
         
        }
        if(varmi)
            System.out.println("sayı bulundu");
        else
            System.out.println("sayı bulunamadı");
    }
}
