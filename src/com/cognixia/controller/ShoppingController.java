package com.cognixia.controller;

import java.util.ArrayList;
import java.util.List;

import com.cognixa.model.Account;
import com.cognixa.model.Product;

public class ShoppingController {
	List<Account> accounts = new ArrayList<>();
	List<Product> products = new ArrayList<>();

	public void createAccount(String email, String password) {
		Account newAccount = new Account(email, password);
		// add it to storage
		accounts.add(newAccount);
	}

	public int isRegistered(String email, String password) {
		int index = 0;
		for (Account account : accounts) {
			if (account.getEmail().equals(email)) {
				if (account.getPassword().equals(password)) {
					return index;
				}
				System.out.println("Wrong Password!");
				return -1;
			}
			index++;
		}
		System.out.println("Not registered");
		return -1;
	}
}
