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
public class Ucgen implements ISekil{

    int a,h;
    @Override
    public int getAlan() {
        return (a*h)/2;
    }
    
    
}
