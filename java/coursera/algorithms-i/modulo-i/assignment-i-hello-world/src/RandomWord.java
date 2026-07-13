import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

	public static void main(String[] args) {
		String champion = ""; // Reservoir
		int i = 1;
		
		while (!StdIn.isEmpty()) {
			String currentWord = StdIn.readString(); // reads from input stream
			boolean probability = StdRandom.bernoulli(1.0 / i);
			
			if (probability) {
				champion = currentWord; // if probability is true, the Reservoir stores the current word from input stream
			}
			
			i++;
		}
		System.out.println(champion);
	}
}