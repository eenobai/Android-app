import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//parses questions and answers from a txt file
public class Parser extends Main{

	public static void parser() throws FileNotFoundException {
		File file = new File("resources\\SampleQuestions.txt");
		Scanner txtIn = new Scanner(file);
		
		/*System.out.println(txtIn.nextInt()); //1
		System.out.println(txtIn.nextLine()); //2
		System.out.println(txtIn.nextLine()); //3
		System.out.println(txtIn.nextLine()); //4 
		System.out.println(txtIn.nextLine()); //5 
		System.out.println(txtIn.nextLine()); //6
		System.out.println(txtIn.nextLine()); //7
		System.out.println(txtIn.nextInt()); //8*/
		while(txtIn.hasNext()) {
		imageId.add(txtIn.nextInt());
		bug.add(txtIn.nextLine()); //random space appears when parsing file, idk how to fix
		questionText.add(txtIn.nextLine());
		answers.add(txtIn.nextLine());
		answers.add(txtIn.nextLine());
		answers.add(txtIn.nextLine());
		answers.add(txtIn.nextLine());
		correctAnswer.add(txtIn.nextInt());
		}
	}
	
	
}
