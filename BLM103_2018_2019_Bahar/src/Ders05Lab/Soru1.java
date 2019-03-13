/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author alinizam
 */
public class Soru1 {
    public static void main(String[] args) {
        int sayı=0b11110000000000000001;//1000 0001
        int counter=0;
        int a;
        while(sayı>0){
            a=sayı&1;
            if(a==0){
                counter++;
            }
            sayı=sayı>>1;
            
        }
        System.out.println("sayıda "+counter+" adet sıfır vardır");
    }
}
