/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek7;

/**
 *
 * @author alinizam
 */
  class Kisi
    {
        public void BenKimim()
        {
            System.out.println("Ben herhangi bir kisiyim.");
        }
    }
  class Personel extends Kisi
    {
        @Override
        public void BenKimim()
        {
            System.out.println("Ben bir personelim.");
        }
    }
    class Muhendis  extends Personel
    {
        @Override
        public void BenKimim()
        {
            System.out.println("Ben bir mühendisim.");
        }
    }


