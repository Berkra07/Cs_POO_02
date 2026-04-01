package Projects.RectangleCalculator.aplication;

import Projects.RectangleCalculator.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
     static void main(String[] ignore) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle= new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.println(rectangle);
    }
}

