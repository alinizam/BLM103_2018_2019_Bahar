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
public class Soru2 {
    public static void main(String[] args) {
        int k=3454;
        int a=k;
        while(a>0){
            System.out.println(a);
            System.out.print(a%10+"  ");
            a/=10;
            
        }
    }
}
