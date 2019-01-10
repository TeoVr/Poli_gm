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
public abstract class Hero {
    
    protected String name;
    
    public Hero (String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public void move(int len, String d){
        System.out.println(name + " has moved " + len + " fields " + d);
    }
    
    public abstract void hit();
    
    
}
