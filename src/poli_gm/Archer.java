/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli_gm;

/**
 *
 * @author user
 */
public class Archer extends Hero{

    public Archer(String n) {
        super(n);
    }
    
    @Override
    public void hit(){
        System.out.println(super.name + " Archer landed a clear shot.");
    }
}
