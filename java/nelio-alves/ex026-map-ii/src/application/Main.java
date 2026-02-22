package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// apenas teste com Garbage Collector, não faz parte do programa original
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory: " + rt.totalMemory());
		System.out.println("Free Memory (start): " + rt.freeMemory());

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Map<String, Integer> candidates = new HashMap<>();

		System.out.print("Enter the file path: ");
		String path = input.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);

				if (candidates.containsKey(name)) {
					Integer votesSoFar = candidates.get(name);
					candidates.put(name, votes + votesSoFar);
				} else {
					candidates.put(name, votes);
				}

				line = br.readLine();
			}

			for (String key : candidates.keySet()) {
				System.out.println(key + ": " + candidates.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			input.close();

		}
		// garbage collector
		rt.gc();
		System.out.println("Total Memory (ending): " + rt.totalMemory());
		System.out.println("Free Memory (ending): " + rt.freeMemory());
	}
}