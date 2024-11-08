package pckg_calculator_task01;

import java.util.Objects;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("Odaberi radnju: ");
            MathOperation_Decider mtd = new MathOperation_Decider(scn.nextLine());
            System.out.println("Unesi y ili n");
            String choice = scn.nextLine();

            if(Objects.equals(choice, "y")){
            }

            else if (Objects.equals(choice, "n")){
                System.out.println("Izlazak iz kalkulatora");
                break;
            }
        }


        }


    }

