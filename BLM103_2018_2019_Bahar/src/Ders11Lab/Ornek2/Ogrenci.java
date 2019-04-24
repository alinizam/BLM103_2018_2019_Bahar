/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab.Ornek2;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ogrenci {
    int OgrenciNo;
    String adi, soyadi;
    ArrayList < OgrenciNot > notlar=new ArrayList();
    int getNotOrtalama(){
       int toplam=0;
       for (OgrenciNot dersNot : notlar) {
           toplam+=dersNot.getNotOrtalama();
       }
       return toplam/notlar.size();
   }
    
    //Ogrenci sınıfına dersEkle metodu ekleyiniz. 
    //Metot içinde OgrenciNot yapıcısını kullanarak o anki öğrenciye ismi verilen 
    //dersi tüm notları 50 olarak ekleyiniz.
    void dersEkle(String dersAdi){
        this.notlar.add(new OgrenciNot(dersAdi, new int[]{70,70,70}));
    }
    
}
