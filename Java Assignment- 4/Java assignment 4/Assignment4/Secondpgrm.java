package Assignment4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Secondpgrm {
	public static void main(String[] args) throws IOException  {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = "";
		
			sentence = br.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter("tester2.txt"));
			bw.write(sentence);
			System.out.println("data was written to file successfully...");
			bw.close();
			br.close();
	}
}
