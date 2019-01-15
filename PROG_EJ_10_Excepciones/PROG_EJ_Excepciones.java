package PROG_EJ_10_Excepciones;

import javax.swing.*;

public class PROG_EJ_Excepciones {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();

        try{
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce numerador: "));
            int denom = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce denominador: "));
            op.divisMyEx(num,denom);
        }catch(DividirExeption e){
            System.out.println("Msg: " + e.getMessage());
        }catch(IntervaloExeption e){
            System.out.println("Msg: " + e.getMessage());
        }catch(NoNumExeption e){
            System.out.println("Msg: " + e.getMessage());
        }catch(NumberFormatException e){
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
