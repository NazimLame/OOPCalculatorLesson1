import service.CalculatorService;
import ui.ConsoleUi;

public class Main {
    public static void main(String[] args) {

        ConsoleUi consoleUi = new ConsoleUi();
        CalculatorService calculatorService = new CalculatorService();

        boolean isActive = true;

        while (isActive){

            consoleUi.greetings();
            double number1 = consoleUi.takeFirstNumber();
            double number2 = consoleUi.takeSecondNumber();
            String operation = consoleUi.takeOperation();

            switch (operation){
                case "+":{
                    System.out.println(calculatorService.sum(number1,number2));
                } break;

                case "-":{
                    System.out.println(calculatorService.minus(number1, number2));
                } break;

                case "*":{
                    System.out.println(calculatorService.multiply(number1,number2));
                } break;

                case "/":{
                    System.out.println(calculatorService.division(number1,number2));
                } break;

                case "%":{
                    System.out.println(calculatorService.percent(number1, number2));
                } break;

                default:{
                    System.out.println("ERROR");
                    isActive = false;
                }
            }
        }
    }
}