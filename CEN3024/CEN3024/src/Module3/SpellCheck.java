package Module3;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class SpellCheck {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> dictionary = txtdictionary("C:\\Users\\Mitch\\Desktop\\College Stuff\\CEN3024\\dictionary.txt");
		
		ArrayList<String> testStates = new ArrayList<String>();
		Scanner tStates = new Scanner(new File("C:\\Users\\Mitch\\Desktop\\College Stuff\\CEN3024\\testStates.txt"));
			while(tStates.hasNext()) {
				String T = tStates.next();
				if(!dictionary.contains(T)) {
					System.out.println("This is an unknown word - " + T);
				}
			}
			
		
	}
	


	private static ArrayList<String> txtdictionary(String path) throws FileNotFoundException {
		ArrayList<String> dictionary = new ArrayList<String>();
		Scanner SpellCheck = new Scanner(new File("C:\\Users\\Mitch\\Desktop\\College Stuff\\CEN3024\\dictionary.txt"));
			while(SpellCheck.hasNext())
			dictionary.add(SpellCheck.next());
		
		
		return dictionary;
			}
	}


