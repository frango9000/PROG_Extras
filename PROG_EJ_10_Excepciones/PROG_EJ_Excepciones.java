package PROG_EJ_10_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PROG_EJ_Excepciones {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        Scanner scan = new Scanner(System.in);

        try{
            op.divisEx(1,0);
        }catch(ArithmeticException e){
            System.out.println("asdhakjdadkljasdl" + e.getMessage());
        }
//
//
//        boolean valid = false;
//
//        do {
//            try {
//                System.out.println("Intro num: ");
//                op.allNoEx(8, scan.nextInt());
//                valid = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Error : string !" + e.getMessage());
//            } catch (ArithmeticException e) {
//                System.out.println("Error : 0 !" + e.getMessage());
//            }
//        }while(!valid);
//




    }
}
