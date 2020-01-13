import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsernamePassword {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String username = s.nextLine();
		String password = s.nextLine();
		System.out.println("please select yes or no to continue (y/n)");
		String choice = s.nextLine();
		
		if(choice.equalsIgnoreCase("y")) {
			//append to file
			File file = new File("C:\\Users\\admin\\Desktop\\append.txt");
			FileWriter fr;
			try {
				fr = new FileWriter(file, true);
				fr.write(username);
				fr.write(password);
				System.out.println("written to file");
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		else if(choice.equals("n")) 
			System.out.println("exit");
		else {
			System.out.println("please select a valid option");
		}
		return;
	}
}
