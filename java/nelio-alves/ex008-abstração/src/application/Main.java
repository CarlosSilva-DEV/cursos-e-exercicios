package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nShape #%d data:\n", i + 1);
			System.out.print("Rectangle or Circle (r/c)? ");
			char shapeType = input.next().charAt(0);

			switch (shapeType) {
			case 'r':
				Rectangle r = new Rectangle();
				
				input.nextLine();
				System.out.print("Color (BLACK/BLUE/RED): ");
				r.setColor(Color.valueOf(input.nextLine()));
				System.out.print("Width: ");
				r.setWidth(input.nextDouble());
				System.out.print("Height: ");
				r.setHeight(input.nextDouble());

				list.add(r);
				break;
			case 'c':
				Circle c = new Circle();
				
				input.nextLine();
				System.out.print("Color (BLACK/BLUE/RED): ");
				c.setColor(Color.valueOf(input.nextLine()));
				System.out.print("Radius: ");
				c.setRadius(input.nextDouble());

				list.add(c);
				break;
			default:
				System.out.println("Caractere inválido! Por favor, tente novamente");
			}
		}
		
		System.out.println("\n\nSHAPE AREAS:");
		
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}		
		
		input.close();
	}
}