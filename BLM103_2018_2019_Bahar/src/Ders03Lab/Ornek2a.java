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
public class Ornek2a {
    public static void main(String[] args) {
        int a=83,b=54,c=65;
        
        //efektif çözüm değil
        if(a>b && a>c)
            System.out.println("a="+a+" sayısı en büyük sayıdır");
        if(b>a && b>c)
            System.out.println("b="+b+" sayısı en büyük sayıdır");
        if(c>b && c>a)
            System.out.println("c="+c+" sayısı en büyük sayıdır");
    }
}
