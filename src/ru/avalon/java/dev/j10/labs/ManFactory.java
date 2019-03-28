/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.Randomizer;
/**
 *
 * @author JAVA
 */
public class ManFactory {
    String[] names = {John, afg ,fga};
                        }
    
   Randomizer r = new Randomizer;
        
    public Man getMan() {
        switch(random()){
            
            
            case 1:  return new Man(names[1], );                
            case 2: return new Man(names[2] );
            case 3: return new Man(names[3]);
            default: return new Man(names[0], );
            }
    
}
