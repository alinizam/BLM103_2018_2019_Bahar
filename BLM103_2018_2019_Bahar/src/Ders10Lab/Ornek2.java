/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
         int []dizi={4,8,78,98,80,5};
         int arananSayi=80;
        
         System.out.println(sayiBul(dizi, arananSayi));
         
         
         int [] yenidizi=dizideAra(dizi,arananSayi);
         
         for (int i = 0; i < yenidizi.length; i++) {
             System.out.print(yenidizi[i]+" ");
        }
    }
    public static boolean sayiBul(int [] dizi, int sayi){
        boolean varmi=false;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==sayi){
                varmi=true;
                break;
            }
         
        }
        return varmi;
    }
    public static int [] dizideAra(int []dizi, int sayi){
        int [] ydizi=new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==sayi){
                ydizi[i]=1;
            }   
        }
        return ydizi;
    }
}
