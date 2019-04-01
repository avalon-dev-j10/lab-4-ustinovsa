/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.Randomizer;
import java.time.LocalDate;
/**
 *
 * @author JAVA
 */
public class ManFactory {
    

   String[] names = {"Nessa", "Tasuni", "Chris", "Zana", "Jun"};
    
   Randomizer r = new Randomizer();
           
    public Man getMan() {
        switch(r.random()){
            
            case 1:  return new Man(names[1], LocalDate.of(r.randomY(),r.randomM(),r.randomD()) );                
            case 2:  return new Man(names[2], LocalDate.of(r.randomY(),r.randomM(),r.randomD()) );
            case 3:  return new Man(names[3], LocalDate.of(r.randomY(),r.randomM(),r.randomD()) );
            default: return new Man(names[0], LocalDate.of(r.randomY(),r.randomM(),r.randomD()) );
            }
    
}}
