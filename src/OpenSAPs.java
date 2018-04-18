import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenSAPs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader myDataFile = new BufferedReader(new FileReader("myData.txt"));
		BufferedReader myDataFile2 = new BufferedReader(new FileReader("myData2.txt"));
		String line = myDataFile.readLine();
		String line2 = myDataFile2.readLine();
		while(line != null){
			System.out.println(line);
			line = myDataFile.readLine();
		}
		while (line2 != null){
			System.out.println(line2);
			line2 = myDataFile2.readLine();
		}
		myDataFile.close();
	}
}
