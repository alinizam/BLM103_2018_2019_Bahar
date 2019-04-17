/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek4;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
     public static void main(String[] args) {
        int A[][]=new int [2][3];
        A[0][0]=5;  A[0][1]=3;  A[0][2]=1;
        A[1][0]=2;  A[1][1]=3;  A[1][2]=6;
        
       /* 5 2
          3 3
          1 6*/
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                //System.out.println(+j+" "+i);
                System.out.print(A[j][i]+" ");
            }
            System.out.println("");
        }
        
    }
}
