/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek5;

/**
 *
 * @author alinizam
 */
public class Araba implements ISekil,IHareketEdebilir{
    int alan;
    int hiz;

    public Araba(int hiz) {
        this.hiz = hiz;
    }
    
    @Override
    public int getAlan() {
        return alan;
    }

    @Override
    public void hizlan(int hizArtis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void yavasla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHiz() {
        return hiz;
    }
    
}
