/**
 * Execises to practice the basic syntax
 */
public class Basics {


    public static void main(String[] args) {


        // TODO: Write a Java program to print the sum of two numbers.
        Basics obj = new Basics();

        obj.sum(25, 5);


        // TODO: Write a Java program to divide two numbers and print on the screen. Use both integers and doubles.

obj.divide( 30,4);

        // TODO: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

        obj.omg( 30,4);


        // TODO: Write a Java program to swap two variables. Print the before and after switching.

        obj.swap(9,6);
    }

    private int sum(int numA, int numB) {
        int result;
        result = numA + numB;
        System.out.println("The sum is " + result);
        return result;

    }

    private void divide(double numA, double numB)  {
         double result;
        result = numA / numB;
        System.out.println("the division is " + result);
    }

    private void omg(int numA, int numB) {

        int sum;
        sum = numA + numB;
        System.out.println("The Sum is " + sum);

        int multi;
        multi = numA * numB;
        System.out.println("The Multiplication is " + multi);

        int subt;
        subt = numA - numB;
        System.out.println("The Subtraction is " + subt);

        int divide;
        divide = numA / numB;
        System.out.println("The Division is " + subt);

        int remain;
        remain = numA % numB;
        System.out.println("The Remainder is " + remain);
    }
    private void swap(int numA, int numB) {
        int numC;
        numC = numA;
        numA= numB;
        numB = numC;
        System.out.println("Number A is " + numA);
        System.out.println("Number B is " + numB);


    }

}
