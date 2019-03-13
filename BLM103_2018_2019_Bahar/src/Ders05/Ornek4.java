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
public class Ornek4 {
    //Verilen aralıkta 13'e bölünen bir sayı var mı. Bulunuz.

    public static void main(String[] args) {
        int altSinir = 10, ustSinir = 45;
        boolean varMi=false;
        for (int i = altSinir; i < ustSinir; i++) {
            if (i % 13 == 0) {
                varMi=true;
                break;
            } 
        }
        System.out.println("Var mi = "+varMi);
    }

}
