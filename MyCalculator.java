import java.util.Scanner;

public class MyCalculator{

  public double add(double num1, double num2){
    return num1 + num2;
  }

  public double sub(double num1, double num2){
    return num1-num2;
  }

  public double div(double num1, double num2){
    return num1/num2;
  }

  public double mult(double num1, double num2){
    return num1 * num2;
  }

  public double enterDouble(){
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


  public static void main(String[] args){
    MyCalculator calc = new MyCalculator();

    Scanner scan = new Scanner (System.in);

    while (true){
      String operator = "";
      do {
        System.out.println("Choose operator +, -, *, / or q to quit");
        operator = scan.next();
        if(operator.equals("q")){
          System.out.println("Good Bye");
          return ;
        }
      } while ((operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))==false);

      System.out.println("Enter first number");
      double num1 = calc.enterDouble();
      System.out.println("Enter second number");
      double num2 = calc.enterDouble();

      if(operator.equals("+")){
        System.out.println("The sum is: " + calc.add(num1,num2));
      }
      else if(operator.equals("-")){
        System.out.println("The difference is: " + calc.sub(num1,num2));
      }
      else if(operator.equals("*")){
        System.out.println("The product is: " + calc.mult(num1,num2));
      }
      else if(operator.equals("/")){
        if(num2 == 0){
          System.out.println("You can't divide by 0");
        } else {
          System.out.println("The quotient is: " + calc.div(num1,num2));
        }
      }
    } //while
  } //main
} //class
