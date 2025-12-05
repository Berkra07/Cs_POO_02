package RectangleCalculator.aplication;

import RectangleCalculator.entities.Rectangle;

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle= new Rectangle();

        System.out.println("Enter rectangle width and heitgh:");
        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.println(rectangle);
    }
}