/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek3;

/**
 *
 * @author alinizam
 */
public class Ust {
    int ilkDeger;

    public Ust() {
        this.ilkDeger=20;
    }
    
    public Ust(int ilkDeger) {
        System.out.println("Ust sınıf yapicisi çalıştı");
        this.ilkDeger=ilkDeger;
    }
    final void genelIsler(){
        System.out.println("Çalışma yapılıyor.");
    }
    
}
