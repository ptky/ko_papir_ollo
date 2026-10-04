package ko_papir_ollo;

import java.util.Scanner;


/**
 *
 * @author ptky
 */

public class Ko_papir_ollo {

    public static void main(String[] args) {
        int valasztott = bekeres("Ko [1], Papir [2], Ollo [3] Szamot adj meg: ");
        int robot_valasztas = (int) (Math.random()  * 3) + 1; // ez itt alapbol double at kell valtani intre
        
        if (valasztott == 1 && robot_valasztas == 3 || valasztott == 2 && robot_valasztas == 1 || valasztott == 3 && robot_valasztas == 2 ) {
            System.out.println("Nyertel! A te valasztasod: " + ertelemezo(valasztott)+"" + " A robot valasztasa: " + ertelemezo(robot_valasztas));
         
        }
        else if (valasztott == robot_valasztas) {
            System.out.println("Dontetlen! A te valasztasod: " + ertelemezo(valasztott) + ", A robot valasztasa: " + ertelemezo(robot_valasztas));
    }
        else {
            System.out.println("Vesztettel! A te valasztasod: " + ertelemezo(valasztott) + ", A robot valasztasa: " + ertelemezo(robot_valasztas));
        }
    }
        
    public static int bekeres(String kerdes) {
        Scanner scn = new Scanner(System.in);
        System.out.println(kerdes);
        
        int valasztas =  scn.nextInt();
        return valasztas;
    }
    
    public static String ertelemezo(int szam)
    {
        if (szam == 1) {
            return "Ko";
            
        }
        else if (szam == 2) {
            return "Papir";
        }
        else {
            return "Ollo";
        }
    }
    
    
    
}
