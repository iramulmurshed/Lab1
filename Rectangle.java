/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;


public class Rectangle{

	public static void main(String args[]) {
		int length, width, area, perimeter;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of Rectangle");
		length = in.nextInt();
		System.out.println("Enter width of Rectangle");
		width = in.nextInt();
		// Area of rectangle = length X width
		area = length * width;
		// Perimeter of rectangle = 2 X (length X width)
		perimeter = 2 * (length + width);
		System.out.println("Area of Rectangle : " + area);
		System.out.println("Rectangle of Rectangle : " + perimeter);
	}

}