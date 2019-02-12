package lib;
//@author fsancheztemprano

import java.util.Scanner;

public class LibreriaPROG {
    
    public static String pedirDato(String msg){
        System.out.print(msg);
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
