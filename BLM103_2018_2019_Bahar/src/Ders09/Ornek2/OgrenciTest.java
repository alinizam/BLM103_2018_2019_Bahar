/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek2;

/**
 *
 * @author alinizam
 */
public class OgrenciTest {
    public static void main(String[] args) {
        /*int ogrenci1Not=50;
        int ogrenci2Not=60;
        int ogrenci3Not=100;
        System.out.println((ogrenci1Not+ogrenci2Not+ogrenci3Not)/3);*/
        int notlar[];
        notlar=new int[50];
        System.out.println(notlar[0]);
        notlar[0]=95;
        System.out.println(notlar[0]);
        int [] notDizi1=new int[50];
        int  notDizi2[]=new int[50];
        
        int notDizi3[]={1,3,5};
        //notDizi2={1,5,9}; Hatalı kod. Tanım satırı dışından kullanılamaz.
        System.out.println(notDizi3.length);
    }
 
}
