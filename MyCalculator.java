import java.util.Scanner;

public class MyCalculator{

  private static double firstNumber;
  private static double secondNumber;
  private static double answer;
  private static String operator;

  private static double add(double num1, double num2){
    return num1 + num2;
  }

  private static double sub(double num1, double num2){
    return num1-num2;
  }

  private static double div(double num1, double num2){
    return num1/num2;
  }

  private static double mult(double num1, double num2){
    return num1 * num2;
  }

  private static double enterDouble(){
    Scanner scan = new Scanner (System.in);
    double num;
    while(true){
      try{
        num = scan.nextDouble();
        break;
      } catch (Exception e) {
        String str = scan.nextLine();
        System.out.println(str + " is not a number!");
      }
    }
    return num;
  }

  private static String enterOperator(){
    Scanner scan = new Scanner (System.in);
    String operator;
    do {
      System.out.println("Choose operator +, -, *, / or q to quit");
      operator = scan.next();
    } while ((operator.equals("q") || operator.equals("+") ||
              operator.equals("-") || operator.equals("*") ||
              operator.equals("/"))==false);
    return operator;
  }

  public double getFirstNumber(){
    return firstNumber;
  }


  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    while (true){
      operator = enterOperator();

      if(operator.equals("q")){
        System.out.println("Exiting program");
        break;
      }

      System.out.println("Enter first number");
      firstNumber = enterDouble();
      System.out.println("Enter second number");
      secondNumber = enterDouble();

      if(operator.equals("+")){
        answer = add(firstNumber,secondNumber);
        System.out.println("The sum is: " + answer);
      }
      else if(operator.equals("-")){
        answer = sub(firstNumber,secondNumber);
        System.out.println("The difference is: " + answer);
      }
      else if(operator.equals("*")){
        answer = mult(firstNumber,secondNumber);
        System.out.println("The product is: " + answer);
      }
      else if(operator.equals("/")){
        if(secondNumber == 0){
          System.out.println("You can't divide by 0");
        } else {
          answer = div(firstNumber,secondNumber);
          System.out.println("The quotient is: " + answer);
        }
      }
    } //while
  } //main
} //class
