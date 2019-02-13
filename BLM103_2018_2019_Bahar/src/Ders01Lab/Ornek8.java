/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01Lab;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        int number = 35;
        int onlarBasamagi,birlerBasamagi;
        
        onlarBasamagi = number/10;
        birlerBasamagi = number - onlarBasamagi*10;
        
        
        int hedefSayi = birlerBasamagi * 10 + onlarBasamagi;
        
        System.out.println("Hedef Sayi = " + hedefSayi);
    }
}
