
public class Calculator{
     int add(int a, int b){
        return a + b;

    }
}

    public class Day4{
        public static void main(String[] args){
            Calculator calc = new Calculator();
            int sum = calc.add(5, 10);
            System.out.println("The sum is: " + sum);
        }
    }