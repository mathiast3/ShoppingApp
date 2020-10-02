package com.cognixia.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cognixia.controller.ShoppingController;

public class ShoppingApplication {

	static Scanner input = new Scanner(System.in);
	static ShoppingController controller = new ShoppingController();
	private static boolean loggedIn = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		while (!exit) {
			System.out.println("Standalone E-commerce App");
			System.out.println("+==========================+");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Buy An Item");
			System.out.println("4. Replace An Item");
			System.out.println("5. Exit");
			int selection = 0;

			selection = input.nextInt();
			input.nextLine();

			switch (selection) {
			// createAccount();

			case 1:
				register();
				break;
			case 2:
				login();
				break;
			case 3:
				buyItem();
				break;
			case 4:

				break;
			default:

				break;
			}
		}
		input.close();
	}

	private static void buyItem() {
		// TODO Auto-generated method stub
		if (loggedIn) {
			controller.displayItems();
			int choice = input.nextInt();
		} else {
			System.out.println("Please Login before buying an item");
		}

	}

	private static void register() {
		// TODO Auto-generated method stub
		System.out.println("Enter your email:");
		String email = input.nextLine();
		String password = "";
		while (!isValidPassword(password)) {
			System.out.println("Enter a password (Must be 8-20 characters, contain a number, and a special character)");
			password = input.nextLine();
		}
		controller.createAccount(email, password);

	}

	public static boolean isValidPassword(String password) {
		// Regex to check valid password.
		String regex = "^(?=.*[0-9])" + "(?=.*[!@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern pattern = Pattern.compile(regex);

		// If the password is empty return false
		if (password == null) {
			return false;
		}

		Matcher match = pattern.matcher(password);

		return match.matches();
	}

	private static void login() {
		int index = -1;
		do {
			System.out.println("Enter Login Credentials:\n");
			System.out.println("Email:");
			String email = input.nextLine();
			System.out.println("Password:");
			String password = input.nextLine();
			index = controller.isRegistered(email, password);
		} while (index == -1);

	}

}
