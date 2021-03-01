import java.text.*;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decFor = new DecimalFormat("#.##");


        System.out.println("");
        System.out.println("Calculadora");
        System.out.print("Introduza a conta: ");
       

        String oper = scanner.next();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if ( oper.equals("som") ) {
            System.out.println("Soma: " + decFor.format(num1) + " + " + decFor.format(num2) + " = " + decFor.format(num1+num2));
            System.out.println("");
        }
        if ( oper.equals("sub") ) {
            System.out.println("Subtração: " + decFor.format(num1) + " - " + decFor.format(num2) + " = " + decFor.format(num1-num2));
            System.out.println("");            
        }
        if ( oper.equals("mul") ) {
            System.out.println("Multiplicação: " + decFor.format(num1) + " * " + decFor.format(num2) + " = " + decFor.format(num1*num2));
            System.out.println("");
        }
        if ( oper.equals("div") ) {
            System.out.println("Divisão: " + decFor.format(num1) + " / " + decFor.format(num2) + " = " + decFor.format(num1/num2));
            System.out.println("");
        }
        scanner.close();
    }
}
