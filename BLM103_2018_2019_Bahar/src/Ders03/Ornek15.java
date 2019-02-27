/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author alinizam
 */
public class Ornek15 {
    public static void main(String[] args) {
        int gunNo=10;
        switch(gunNo){
            case 0:
                System.out.println("Pazar");
                break;
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            default:
                System.out.println("Gün no yanlış");
        }
        System.out.println("Bitti");
    }
}
