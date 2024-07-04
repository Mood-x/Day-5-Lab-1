
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // =============== 1 ===============
        // 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input 

        System.out.print("Input first number: ");
        int numberOne = input.nextInt(); 

        System.out.print("Input second number: ");
        int numberTwo = input.nextInt(); 

        System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        System.out.println(numberOne + " x " + numberTwo + " = " + (numberOne * numberTwo));
        System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
        System.out.println(numberOne + " mod " + numberTwo + " = " + (numberOne % numberTwo));


        // =============== 2  ===============
        // 2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        
        System.out.print("Input a number: ");
        int number = input.nextInt(); 

        for(int i = 1; i <= 10; i++ ){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    

        // =============== 3  ===============
        // 3. Write a Java program to print the area and perimeter of a circle.

        System.out.print("Enter The radius: ");

        float radius = input.nextFloat(); 
        double pi = 3.141592653589793; 

        double area = pi * radius * radius; 

        double perimeter = 2 * pi * radius;


        System.out.printf("Perimeter is = %.14f\n", perimeter);

        System.out.printf("Area is = %.14f\n", area);

        

        // =============== 4  ===============
        // 4. Java program to find out the average of a set of integers
    
        System.out.print("Enter the count of numbers: ");
        int count = input.nextInt();
        int number; 
        int sum = 0;

        for(int i = 1; i <= count; i++){
            System.out.print("Enter integer: ");
            number = input.nextInt(); 
            
            sum += number; 
        } 
        
        float average = (float) sum / count; 
        System.out.println("The average is: " + average);




        // =============== 5  ===============
        // 5. Write a Java program that accepts three integers as input, adds the first two integers together, and then determines whether the sum is equal to the third integer.

        int firstNumber; 
        int secondNumber; 
        int thirdNumber;
        boolean isEqual; 

        System.out.print("Input the first number: ");
        firstNumber = input.nextInt(); 

        System.out.print("Input the second number: ");
        secondNumber = input.nextInt();

        System.out.print("Input the third number: ");
        thirdNumber = input.nextInt(); 
        if ((firstNumber + secondNumber) == thirdNumber){
            isEqual = true; 
            System.out.println("The result is: " + isEqual);
        }else {
            isEqual = false; 
            System.out.println("The result is: " + isEqual);
        }
            

        // =============== 6  ===============
        // 6. Write a Java program to reverse a word.
        
        System.out.print("Input a word: ");
        String str = input.nextLine();

        String reverseWord = ""; 
        
        for (int i = str.length() -1; i >= 0; i--){
                reverseWord += str.charAt(i);
        }

        System.out.println("Reverse word: " + reverseWord);


        // =============== 7  ===============
        // 7 - Java program to check whether the given number is even or odd
        
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 

        if(number % 2 == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }


        // =============== 8  ===============
        // 8 - Java program to convert the temperature in Centigrade to Fahrenheit

        System.out.print("Enter the Centigrade to Converted to Fehrenheit: ");
        float centigrade = input.nextInt(); 

        float fehrenheit = (centigrade * 9 / 5) + 32;

        System.out.printf("Temperature in Fehrenheitis: %.1f", fehrenheit);
        System.out.println();

        // =============== 9  ===============
        // 9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        System.out.print("Input a string: ");
        String str = input.nextLine(); 
        input.nextLine(); 
        System.out.print("Input a number: ");
        int index = input.nextInt(); 

        System.out.println(str.charAt(index));
        

        // =============== 10 ===============
        // 10. Write a Java program to print the area and perimeter of a rectangle.

        System.out.print("Enter the width: ");
        float width = input.nextFloat();

        System.out.print("Enter the height: ");
        float height = input.nextFloat(); 

        float area = height * width;		
    
        float perimeter = 2 * (height + width);

        System.out.printf("Area is %.1f * %.1f = %.2f\n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f\n",width ,height,  perimeter);

        // =============== 11 ===============
        // 11. Write a Java program to compare two numbers.

        System.out.print("Input first integer: ");
        int firstInt = input.nextInt(); 

        System.out.print("input second integer: ");
        int secondInt = input.nextInt(); 

        if (firstInt != secondInt){
            System.out.println(firstInt + " != " + secondInt);
        }
        
        if (firstInt < secondInt){
            System.out.println(firstInt + " < " + secondInt);
        }
        
        if (firstInt <= secondInt) {
            System.out.println(firstInt + " <= " + secondInt);
        }

        // =============== 12 ===============
        // 12. Write a Java program to convert seconds to hours, minutes and seconds.
    
    
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600; 
        int  remSecond = seconds % 3600; 
        int min = remSecond / 60; 
        int sec = remSecond % 60; 

        System.out.println(hours + ":" + min + ":" + sec);



        // =============== 13 ===============
        // 13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

        System.out.print("Input first number: ");
        int firstNumber = input.nextInt(); 

        System.out.print("Input second number: ");
        int secondNumber = input.nextInt(); 

        System.out.print("Input third number: ");
        int thirdNumber = input.nextInt(); 

        System.out.print("Input fourth number: ");
        int fourthNumber = input.nextInt(); 


        if (firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber == fourthNumber){
            System.out.println("Numbers are equal!");
        }else {
            System.out.println("Numbers are not equal!");
        }



        // =============== 14 ===============
        // 14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.


        System.out.print("Input a number: "  );
        int number = input.nextInt(); 

        if (number < 0 ){
            System.out.println("Number is negative");
        }else if (number > 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is zero");
        }



        // =============== 15 ===============
        // 15.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
        
        int positive = 0; 
        int negative = 0; 
        int zero = 0; 
        int number; 
        
        do{
            System.out.print("enter the number: ");
            number = input.nextInt(); 
            
            if(number < 0 ){
                if(number == -1){
                    continue;
                }
                negative++;
            }else if (number > 0){
                positive++; 
            }else {
                zero++;
            }

            

        }while (number != -1); 

        System.out.println(positive + " Positive");
        System.out.println(zero + " Zero");
        System.out.println(negative + " Negative");

        // =============== 16 ===============
        // 16 - Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.

        System.out.print("Enter an integer: ");
        int number = input.nextInt(); 

        int reverseNumber = 0; 
        
        while( number != 0){
            int digit = number % 10; 
            reverseNumber = reverseNumber * 10 + digit; 
            number /= 10; 
        }

        System.out.println("Reversed number: " + reverseNumber);


        // =============== 17 ===============
        // 17 - Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.

        int largest = 0;
        int smallest = 0;
        String choice;

        do {
            System.out.print("enter the number: ");
            int number = input.nextInt(); 

            if (number > largest){
                largest = number; 
            }else if (number < smallest){
                smallest = number; 
            }

            input.nextLine();
            
            System.out.print("Do you want continou?: Y/N: ");
            choice = input.nextLine(); 

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("the large number: " + largest);
        System.out.println("the small number: " + smallest);


        // =============== 18 ===============
        // 18 - Determine and print the number of times the character ‘a’ appears in the input entered by the user

        System.out.print("Enter String: ");
        String str = input.nextLine(); 

        int count = 0; 
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                count++; 
            }
        }

        System.out.println("Number of a's: " + count);
    }
}
