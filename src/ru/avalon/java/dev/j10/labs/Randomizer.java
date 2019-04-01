/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

/**
 *
 * @author Home
 */
public class Randomizer {
  
    /**
     * Генерирует случайное значение 
     * типа @int 
     * в диапазоне [1;5]
    */
    
    public int random(){
        int min = 1;
        int max = 5;
    return min + (int)(Math.random() * ((max - min) + 1));
    }
    
    
    /**
     * Генерирует случайное значение 
     * типа @int 
     * в диапазоне [1920;2019]
    */
    
    public int randomY(){
        int min = 1920;
        int max = 2019;
    return min + (int)(Math.random() * ((max - min) + 1));
}
    
    /**
     * Генерирует случайное значение 
     * типа @int 
     * в диапазоне [1;12]
    */
    public int randomM(){
        int min = 1;
        int max = 12;
    return min + (int)((Math.random()*(12-1))+1);
}
    
    /**
     * Генерирует случайное значение 
     * типа @int 
     * в диапазоне [1;31(30,29,28)]
    */
    
    public int randomD(){
        int min = 1;
        int max=0;
        switch (max){            
            case 1: 
            case 3:    
            case 5: 
            case 7:
            case 8:
            case 10:
            case 12: max = 31;
            break;
            case 2: 
                if(((randomY()%4==0) && !(randomY()%100==0)) || (randomY()%400==0))
                    max = 29;
                else 
                    max = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                max = 30;
                        }           
                
    return min + (int)(Math.random() * ((max - min) + 1));
}
    
}
