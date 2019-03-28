/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

/**
 *
 * @author JAVA
 */
public class ManFactory {
    String[] names = {John,};
           
    public int random(){
    return (int)((Math.random()*5)+1);
}
    
    public Man getMan() {
        switch(random()){
            
            default: return new Man(names[0], );
            case 1: return new Man(names[0]);                
            case 2;
            case 3
            }
    
}
