/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

import java.io.FileWriter;

/**
 *
 * @author alinizam
 */
public class Araba {

    int hiz;
    FileWriter f;

    public Araba(int hiz) {
        this.hiz = hiz;
    }

    public Araba() {
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Silindi.");
        if (f != null) {
            f.close();
        }
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

}
