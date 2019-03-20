/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
       
        int sayı=1;
        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(i-j==3){
                    System.out.print("X   ");
                }else{
                 System.out.print(sayı+"   ");
                 sayı*=2;
                }
                
            }
            System.out.println();
        }
    }
}
