/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek7;

/**
 *
 * @author alinizam
 */
public class GaleriTest {
    public static void main(String[] args) {
        Galeri galeriler[]=new Galeri[2];
        galeriler[0]=new Galeri();
        galeriler[0].arabalar[0]=new Araba();
        galeriler[0].arabalar[0].fiyat=300000;
        galeriler[0].arabalar[1]=new Araba();
        galeriler[0].arabalar[1].fiyat=300000;
        galeriler[0].arabalar[2]=new Araba();
        galeriler[0].arabalar[2].fiyat=400000;
    
        galeriler[1]=new Galeri();
        galeriler[1].arabalar[0]=new Araba();
        galeriler[1].arabalar[0].fiyat=800000;
        galeriler[1].arabalar[1]=new Araba();
        galeriler[1].arabalar[1].fiyat=300000;
        galeriler[1].arabalar[2]=new Araba();
        galeriler[1].arabalar[2].fiyat=400000;
        
        int toplam=0;
        for (int i = 0; i < galeriler.length; i++) {
            int galeriToplam=0;
            for (int j = 0; j < galeriler[i].arabalar.length; j++) {
                toplam+=galeriler[i].arabalar[j].fiyat;
                galeriToplam+=galeriler[i].arabalar[j].fiyat;
            }
            System.out.println(i+". Galeri Toplam ="+galeriToplam);
        }
        System.out.println("Toplam="+toplam);
    
    
    
    }
}
