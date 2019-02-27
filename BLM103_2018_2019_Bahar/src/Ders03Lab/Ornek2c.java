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
public class Ornek2c {
    public static void main(String[] args) {
         int a=83,b=54,c=65;
         //en efektif çözüm
        int max;
        if(a>b && a>c)
           max=a;
        else if(b>a && b>c)
            max=b;
        else
            max=c;
        System.out.println("En büyük sayı = "+max+" sayısıdır");
    }
}
