/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Konversi {
    
    double c;

    public Konversi(double c) {
        this.c = c;
    }
    
    double setToReamur(){
        return (4 * c)/5;
    }
    
    double setToFahrenheit(){
        return (9 * c)/5 + 32;
    }
    
    double setToKelvin(){
        return c + 273.15;
    }
    
    String suhuair(){
        String kondisi = "Normal";
        if(c<=0){
            kondisi = "Membeku";
        }else if(c>=100){
            kondisi = "Mendidih";
        }
        
        return kondisi;
    }
    
}
