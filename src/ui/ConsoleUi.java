package ui;

import service.CalculatorService;

import java.util.Scanner;

public class ConsoleUi {
    Scanner scanner = new Scanner(System.in);

    public void greetings(){
        System.out.println("Привет! это приложение калькулятор \n" +
                "Ты можешь ввести свои цифры и оператор");
    }

    public double takeFirstNumber(){
        System.out.println("Введите 1 цифру: ");
        double number1 = scanner.nextDouble();
        return number1;
    }

    public double takeSecondNumber(){
        System.out.println("Введите 2 цифру: ");
        double number2 = scanner.nextDouble();
        return number2;
    }

    public String takeOperation(){
        System.out.println("Введите оператор: ");
        String operation = scanner.next();
        return operation;
    }
}
