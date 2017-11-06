import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello ASE2017 - How are you now? :)");
		try {
			String userName = askForName();
			HelloUser user = new HelloUser(userName);
			user.greetUser();
		} catch (IOException e) {
			System.err.println("Failed reading the name");
		}
	}

	private static String askForName() throws IOException {
		System.out.print("Please enter your name: ");
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}

}
