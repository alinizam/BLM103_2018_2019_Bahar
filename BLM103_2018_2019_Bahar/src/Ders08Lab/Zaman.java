/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

/**
 *
 * @author alinizam
 */
public class Zaman {
    int saat,dakika,saniye;
    void saniyeArtir(){
        saniye++;
        if(saniye>=60){
            saniye=0;
            dakikaArtir();
        }
    }
    void dakikaArtir(){
        dakika++;
        if(dakika>=60){
            dakika=0;
            saatArtir();
        }
    }
    void saatArtir(){
        saat++;
        if(saat>=24){
            saat=0;
        }
    }
    void saatGoster() {
        System.out.println(saat+":"+dakika+":"+saniye);
    }
    
}
