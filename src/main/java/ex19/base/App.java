package ex19.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 19 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 19 - BMI Calculator
You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.

Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in
pounds. The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:

bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell
them if they are underweight or overweight and tell them to consult their doctor.

Example Output
Your BMI is 19.5.
You are within the ideal weight range.
or

Your BMI is 32.5.
You are overweight. You should see your doctor.
Constraint
Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.
Challenges
Make the user interface accept height and weight in Imperial or metric units. You’ll need a slightly different formula
for metric units.
For Imperial measurements, prompt for feet and inches and convert feet to inches so the user doesn’t have to.
Use a GUI interface with sliders for height and weight. Update the user interface on the fly. Use colors as well as text
to indicate health.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your weight?");
        double weight = in.nextDouble();

        System.out.println("What is your height?");
        double height = in.nextDouble();

        double bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is: %.2f", bmi);

        if (bmi > 25) {
            System.out.println("You are overweight, you should see your doctor.");
        }
        else if (bmi < 18.5) {
            System.out.println("You are underweight, you should see your doctor.");
        }
        else if(bmi >= 18.5 && bmi <= 25){
            System.out.println("You are within the ideal weight range.");
        }
    }
}
