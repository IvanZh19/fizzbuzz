import java.util.Scanner;

Scanner s = new Scanner(System.in);
System.out.println("Bruh enter a number");
double number = s.nextDouble();



if (number%3 == 0 && number%5 == 0)
    System.out.println("FizzBuzz");

if (number%3 == 0)
    System.out.println("Fizz");

if (number%5 == 0)
    System.out.println("Buzz");