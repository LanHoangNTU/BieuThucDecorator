/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Lân
 */
public class DemoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BieuThuc btdg = new BieuThucDonGian(10);
        btdg = new Nhan(20, btdg);
        btdg = new Chia(3, btdg);
        btdg = new Cong(27, btdg);
        btdg = new Tru(30, btdg);
        System.out.println(btdg.bieuThuc() + " = " + btdg.giaTri());
        
        btdg = new Chia(0, btdg);
        System.out.println(btdg.bieuThuc() + " = " + btdg.giaTri());
        
        btdg = new Cong(990, btdg);
        System.out.println(btdg.bieuThuc() + " = " + btdg.giaTri());
        
        btdg = new Chia(0, btdg);
        System.out.println(btdg.bieuThuc() + " = " + btdg.giaTri());
    }
    
}
