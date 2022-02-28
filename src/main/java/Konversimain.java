/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Konversimain {

   
    public static void main(String[] args) {
        
        Scanner suhu = new Scanner (System.in);
        double c;
        int menu = 1;
        
        System.out.println("+----------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR ");
        System.out.println("+----------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu dalam Celcius : ");
        c = suhu.nextDouble();
        
        while(menu!=3){
            Konversi setTo = new Konversi(c);
            
            System.out.println("\nOpsi");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            menu = suhu.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("\nSuhu Dalam Celcius      : " + c + "°C");
                    System.out.println("Dalam Fahrenheit           : " + setTo.setToFahrenheit() + "°F");
                    System.out.println("Dalam Reamur               : " + setTo.setToReamur() + "°R");
                    System.out.println("Dalam Kelvin               : " + setTo.setToKelvin() + "K");
                    System.out.println("Kondisi Air " + setTo.suhuair() + ".");
                    break;
                
                case 2:
                    System.out.println("\nInput Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius : ");
                    c = suhu.nextFloat();
                    break;
                
                case 3:
                    break;
                
                default:
                    System.out.println("\nOpsi Tidak Ada. Mohon Masukkan Opsi Dengan Benar!!");
                    break;
            }
        }
        
    
        // TODO code application logic here
    }
    
}
