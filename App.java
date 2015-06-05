import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file = new File("test.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("This is line 1.");
			bw.newLine();
			bw.write("This is line 2.");
			bw.newLine();
			bw.write("Last line.");
		} catch (IOException e) {
			System.out.println("Can't read file: " + file.toString());
		}
	}

}
