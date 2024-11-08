package pckg_calculator_task01;

import java.util.Scanner;

public class MathOperation_Decider {

    private MathOperation adition;
    private MathOperation substraction;
    private MathOperation division;
    private MathOperation multiplication;

    public MathOperation_Decider(String choice){
        adition = new Addition();
        substraction = new Subtraction();
        division = new Division();
        multiplication = new Multiplication();

        Calculator calculator = new Calculator();
        Scanner scn = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int num1 = scn.nextInt();
        System.out.println("Unesi drugi broj: ");
        int num2 = scn.nextInt();

        switch (choice){
            case "add":
                calculator.setOperation(adition);
                calculator.calculate(num1, num2);
                break;
            case "sub":
                calculator.setOperation(substraction);
                calculator.calculate(num1, num2);
                break;
            case "div":
                calculator.setOperation(division);
                calculator.calculate(num1, num2);
                break;
            case "mult":
                calculator.setOperation(multiplication);
                calculator.calculate(num1, num2);
                break;
            default:
                System.out.println("Operacija nije podržana!");
        }
    }



}
