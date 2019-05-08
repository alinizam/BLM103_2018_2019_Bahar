/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek2;

/**
 *
 * @author alinizam
 */
public class Memur extends Personel{
    int derece,kademe;
    String kidem; 
    //String adi;  Kullanılmaması önerilir.

    @Override
    void maasYazdir() {
        int prim=5000;
        if(derece==1){
            System.out.println("Toplam Maaş ="+(netMaas+vergi+ek+prim));
        }else{
            super.maasYazdir();
        }
            
    }
    
}
