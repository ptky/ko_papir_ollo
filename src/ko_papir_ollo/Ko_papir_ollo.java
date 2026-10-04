package ko_papir_ollo;

import java.util.Scanner;


/**
 *
 * @author ptky
 */

public class Ko_papir_ollo {

    public static void main() {
        int mode = bekeres("Robot ellen jatszom: [1], mas ellen jatszom: [2] Szamot adj meg:");
        
        if (mode == 1) {
            int valasztott = bekeres("Ko [1], Papir [2], Ollo [3] Szamot adj meg: ");
            int masodik_jatekos = (int) (Math.random()  * 3) + 1; // ez itt alapbol double at kell valtani intre
            ellenorzes(valasztott, masodik_jatekos);
        }
        else if (mode == 2) {
            int valasztott = bekeres("1. Jatekos: Ko [1], Papir [2], Ollo [3] Szamot adj meg: ");
            int masodik_jatekos = bekeres("2. Jatekos: Ko [1], Papir [2], Ollo [3] Szamot adj meg: ");
            ellenorzes(valasztott, masodik_jatekos);
        }
        else {
            System.out.println("Helytelen ertek");
            main();
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
    public static void ellenorzes(int valasztott, int masodik_jatekos) {
        if (valasztott == 1 && masodik_jatekos == 3 || valasztott == 2 && masodik_jatekos == 1 || valasztott == 3 && masodik_jatekos == 2 ) {
            System.out.println("1. jatekos nyert. Elso jatekos valasztasa: " + ertelemezo(valasztott) + ", Masodik jatekos valasztasa: " + ertelemezo(masodik_jatekos));
         
        }
        else if (valasztott == masodik_jatekos) {
            System.out.println("Dontetlen. Elso jatekos valasztasa: " + ertelemezo(valasztott) + ", Masodik jatekos valasztasa: " + ertelemezo(masodik_jatekos));
    }
        else {
            System.out.println("2. Jatekos nyert. Elso jatekos valasztasa: " + ertelemezo(valasztott) + ", Masodik jatekos valasztasa: " + ertelemezo(masodik_jatekos));
        }
    }
    
    
    
}
