package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		String path = input.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<User> users = new HashSet<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(" ");
				
				users.add(new User(fields[0], Instant.parse(fields[1])));
				
				line = br.readLine();
			}
			
			System.out.println("Total users: " + users.size());
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			input.close();
		}
	}
}