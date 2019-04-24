/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab.Ornek2;

/**
 *
 * @author alinizam
 */
class OgrenciNot {
   String dersAdi;
   int notlar[]=new int[3];

    public OgrenciNot(String dersAdi, int[] notlar) {
        this.dersAdi = dersAdi;
        this.notlar=notlar;
    }
   
   int getNotOrtalama(){
       int toplam=0;
       for (int i : notlar) {
           toplam+=i;
       }
       return toplam/notlar.length;
   }
}
