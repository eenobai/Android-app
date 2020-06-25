import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main{
	
	static ArrayList<Integer> imageId = new ArrayList();
    static ArrayList<String> questionText = new ArrayList();
    static ArrayList<String> answers = new ArrayList();
    static ArrayList<Integer> correctAnswer = new ArrayList();
    int playerAnswer;
    static ArrayList<String> bug = new ArrayList();

    
    public Main() {
    	
    }
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Parser tester = new Parser();
		
		
		
		tester.parser();
		System.out.println(imageId);
		System.out.println(questionText);
		System.out.println(answers);
		System.out.println(correctAnswer);
	}
	
}