import java.text.*;

public class Calculadora {

    public static void main(String[] args) {

        DecimalFormat decFor = new DecimalFormat("#.##");


        double num1 = Double.parseDouble(args[1]); 
        double num2 = Double.parseDouble(args[2]); 

        if ( args[0].equals("som") ) {
            System.out.println('\n' + "Soma: " + decFor.format(num1) + " + " + decFor.format(num2) + " = " + decFor.format(num1+num2) + '\n');
        }
        if ( args[0].equals("sub") ) {
            System.out.println('\n' + "Subtração: " + decFor.format(num1) + " - " + decFor.format(num2) + " = " + decFor.format(num1-num2) + '\n');          
        }
        if ( args[0].equals("mul") ) {
            System.out.println('\n' + "Multiplicação: " + decFor.format(num1) + " * " + decFor.format(num2) + " = " + decFor.format(num1*num2) + '\n');
        }
        if ( args[0].equals("div") ) {
            System.out.println('\n' + "Divisão: " + decFor.format(num1) + " / " + decFor.format(num2) + " = " + decFor.format(num1/num2) + '\n');
        }
    }
}
