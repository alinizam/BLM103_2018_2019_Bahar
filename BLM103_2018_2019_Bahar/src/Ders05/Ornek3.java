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
public class Ornek3 {

    public static void main(String[] args) {
        /*
        A	1				
        1	B	2			
        1	2	C	3		
        1	2	3	D	4	
        1	2	3	4	E	5

         */
        int n = 5;
        char c = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                if (i == j) {
                    System.out.print((char)(c + j - 1) + " ");
                } else if (i < j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(j + " ");
                }
            }

            System.out.println("");
        }

    }
}
