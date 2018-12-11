package PROG_EJ_10_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PROG_EJ_Excepciones {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Introduce numerador: ");
            int num = scan.nextInt();
            System.out.println("Introduce denominador: ");
            int denom = scan.nextInt();
            op.divisMyEx(num,denom);
        }catch(DividirExeption e){
            System.out.println("Msg: " + e.getMessage());
        }catch(IntervaloExeption e){
            System.out.println("Msg: " + e.getMessage());
        }catch(NoNumExeption e){
            System.out.println("Msg: " + e.getMessage());
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
