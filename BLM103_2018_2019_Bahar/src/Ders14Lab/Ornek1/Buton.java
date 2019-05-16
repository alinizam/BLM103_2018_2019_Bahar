/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1;

/**
 *
 * @author alinizam
 */
public class Buton implements IHareket{
  int x,y;
    @Override
    public void HareketEt(int l) {
       this.x=x+l+5;
       this.y=y+l+5;
    }

    @Override
    public void setXY(int x, int y) {
       this.x=x;
       this.y=y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getAlan() {
        return getX()*getY();
    }

    
    
}

