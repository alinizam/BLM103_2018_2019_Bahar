/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ekran implements IHareket{
    ArrayList <IHareket> elemanlar = new ArrayList();
    int toplamAlan=0;

    @Override
    public void HareketEt(int l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setXY(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAlan() {
        return getX()*getY();
    }
    
    void elemanEkle(IHareket h){
        elemanlar.add(h);
    }
    
    int getToplamAlan(){
        for (int i = 0; i < elemanlar.size(); i++) {
            toplamAlan+=elemanlar.get(i).getAlan();
        }
        return toplamAlan;
    }

    
}
