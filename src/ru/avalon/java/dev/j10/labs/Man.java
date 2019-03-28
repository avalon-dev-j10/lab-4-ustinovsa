/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;

/**
 *
 * @author JAVA
 */
public class Man implements Person {
private String name;
private LocalDate bDate;

    public Man(String name, LocalDate bDate) {
        this.name = name;
        this.bDate = bDate;
    }



    @Override
    public String getName() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBirthDate() {
        return bDate.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Man m1, Man m2) {
        if(m1.getName()>m2.getName()){
            return 1;
        } else if (m1.getName()<m2.getName()){
            return -1
        } else if (m1.bDate.isBefore(m2.bDate)){
            return 0}
    }
    
}
