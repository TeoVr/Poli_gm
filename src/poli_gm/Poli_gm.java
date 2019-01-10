/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli_gm;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Poli_gm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Hero> soldiers = new ArrayList<Hero>();
        soldiers.add(new Zombie ("Jake"));
        soldiers.add(new Archer ("Capitao"));
        
        soldiers.get(0).move(1,"left");
        soldiers.get(0).hit();
        System.out.println("========================================");
        soldiers.get(1).move(2,"up");
        soldiers.get(1).hit();
    }
    
}
