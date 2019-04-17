/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek9;

/**
 *
 * @author alinizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        /*
         Verilen dizi içindeki sağa yanaşık üçgen yapının bozulduğu (köşegenin solunda 0 hariç sayı olan) 
           satırları bulunuz.
        */
        int A[][]={{1,0,5},{1,1,6},{1,1,1}};
        for (int i = 0; i < A.length; i++) {
            boolean varMi=false;
            for (int j = 0; j < A[i].length; j++) {
                if (j>i && A[i][j]!=0){
                    varMi=true;
                    System.out.println(i+ ". satır");
                    break;
                }
            }
        }
        
    }
}
