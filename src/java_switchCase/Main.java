package java_switchCase;

import java.util.Scanner;

public class Main {

	/**
	 * Example Application: Switch Case
	 * 
	 * @author Felipe Fong
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter any numeric value: ");
		int option = in.nextInt();

		switch (option) {

		case 0:
			// TODO
		System.out.println("Case: 0");
			break;

		case 1:
			// TODO
			System.out.println("Case: 1");
			break;

		default:
			// TODO
			System.out.println(String.format("Case: Default (value: %d)", option));
			break;

		}
		
	}

}
