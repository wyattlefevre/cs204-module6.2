import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        Calculator calculator = new Calculator();
        System.out.println("Welcome to the calculator!");
        System.out.println("Enter a command:");
        String input = reader.readLine();
        while (!input.equals("q")) {
            String[] inputList = input.split("\\s+");
            switch (inputList[0]){
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(inputList[1]), Integer.parseInt(inputList[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(inputList[1]), Integer.parseInt(inputList[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(inputList[1]), Integer.parseInt(inputList[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(inputList[1])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(inputList[1]), Integer.parseInt(inputList[2])));
                    break;
                default:
                    System.out.println("Unrecognized input (enter 'q' to quit)");
            }
            System.out.println("Enter a command:");
            input = reader.readLine();
        }
    }

}