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

    }
        
    public static int bekeres(String kerdes) {
        Scanner scn = new Scanner(System.in);
        System.out.println(kerdes);
        
        int valasztas =  scn.nextInt();
        return valasztas;
    }
    
    
}
