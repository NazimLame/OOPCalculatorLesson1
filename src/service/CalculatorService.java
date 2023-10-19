package service;

public class CalculatorService {

    public double sum(double number1, double number2){
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        return number1 - number2;
    }

    public double multiply(double number1, double number2){
        return number1 * number2;
    }

    public double division(double number1, double number2){
        if(checkForZero(number1, number2)){
            System.out.println("ERROR 0");
        } else {
            return number1 / number2;
        }
        return -1;
    }


    public boolean checkForZero(double number1, double number2){
        if(number1 == 0 || number2 == 0){
            return true;
        }
        return false;
    }

    public double percent(double number1, double number2){
        if(checkForZero(number1,number2)){
            System.out.println("ERROR 0");
        } else {
            return 100 * number1 / number2;
        }
        return -1;
    }
}
