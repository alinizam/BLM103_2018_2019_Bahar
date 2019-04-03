/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author alinizam
 */
class Araba {

    String renk, model;
    int sonHiz;
    int anlikHiz;
    //Parametre almayan ve değer döndürmeyen metot
    void hizlan() {
        if (anlikHiz+1 <= sonHiz) {
            anlikHiz++;
        }
    }
    //Parametre alan ama değer döndürmeyen metot    
    void degereGoreHizlan(int hizArtis) {
        if (anlikHiz+hizArtis <= sonHiz) {
            anlikHiz=anlikHiz+hizArtis;
        }else{
            anlikHiz=sonHiz;
        }
    }
    
    //Parametre almayan ve değer döndüren metor
    int hizlanVeGetAnlikHiz() {
        if (anlikHiz+1 <= sonHiz) {
            anlikHiz++;
        }
        return anlikHiz;
    }
    
     //Parametre alan ama değer döndüren metot    
    int degereGoreHizlanveGetAnlikHiz(int hizArtis) {
        if (anlikHiz+hizArtis <= sonHiz) {
            anlikHiz=anlikHiz+hizArtis;
        }else{
            anlikHiz=sonHiz;
        }
        return anlikHiz;
    }
}
