/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;
/**
 *
 * @author Home
 */
public class ManComparator implements Comparator<Man> {
    
    @Override
    public int compare(Man m1, Man m2) {
        return m1.getName().compareTo(m2.getName());
    }
    
}
