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
            System.out.println("Nyertél!");
         
        }
        else if (valasztott == robot_valasztas) {
            System.out.println("Döntetlen!");
    }
        else {
            System.out.println("Vesztettél!");
        }
    }
        
    public static int bekeres(String kerdes) {
        Scanner scn = new Scanner(System.in);
        System.out.println(kerdes);
        
        int valasztas =  scn.nextInt();
        return valasztas;
    }
    
    // kene egy ertelmezo fuggveny ami visszadja, hogy a szam mit jelent
    
    
}
