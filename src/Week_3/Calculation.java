public interface Calculation {
   public int operate(int num1, int num2);
}

public class Add implements Calculation{
   @Override
   public int operate(int num1, int num2) {
      return num1 + num2;
   }
}

public class Substract implements Calculation{
   @Override
   public int operate(int num1, int num2) {
      return num1 - num2;
   }
}

public class Multiply implements Calculation{
   @Override
   public int operate(int num1, int num2) {
      return num1 * num2;
   }
}

public class Calculator {
   private Calculation calculation;

   public Calculator(Calculation calculation){
      this.calculation = calculation;
   }

   public int calculate(int num1, int num2){
      return calculation.operate(num1, num2);
   }
}
public class CalculationPatternDemo {
   public static void main(String[] args) {
      Calculator calculator = new Calculator(new Add());		
      System.out.println("14 + 23 = " + calculator.calculate(14, 23));

      Calculator = new Calculator(new Substract());		
      System.out.println("14 - 23 = " + calculator.calculate(14, 23));

      Calculator = new Calculator(new Multiply());		
      System.out.println("14 * 23 = " + calculator.calculate(14, 23));
   }
}