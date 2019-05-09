/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

/**
 *
 * @author alinizam
 */
class Birim {
    String birimAdi;
    int butce,calisanSayi;
    int getPersonelSayi(Fabrika f){
        int toplam=0;
        for (Personel p:f.personeller){
            if (p.birim==this){
                toplam++;
            }
        }
        return toplam;
    }
}
