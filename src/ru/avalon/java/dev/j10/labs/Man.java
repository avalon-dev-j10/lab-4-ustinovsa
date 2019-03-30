/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author JAVA
 */
public class Man implements Person{
private String name;
private LocalDate bDate;


    public Man(String name, LocalDate bDate) {
        this.name = name;
        this.bDate = bDate;
    }



    @Override
        public String getName() {
        return name;
    }

    @Override
    public String getBDate() {
        return bDate.toString();
    }

    @Override
    public int compareTo(Person p) {
        return Person.super.compareTo(p); 
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Man::getName)
                .thenComparing(Man::getBDate)
                .compare(this, (Man) o);
    }

    
    
    
    
    }
    

    

