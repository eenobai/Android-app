import java.io.FileNotFoundException;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class Main{
	
	static ArrayList<Integer> imageId = new ArrayList();
    static ArrayList<String> questionText = new ArrayList();
    static ArrayList<String> answers = new ArrayList();
    static ArrayList<Integer> correctAnswer = new ArrayList();
    static ArrayList<Integer> playerAnswers = new ArrayList();
    static ArrayList<String> bug = new ArrayList();

    
    public Main() {
    	
    }
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Parser tester = new Parser();
		//QuestionFetcher fetcher =  new QuestionFetcher();
		
		
		tester.parser();
		System.out.println(imageId);
		System.out.println(questionText);
		System.out.println(answers);
		System.out.println(correctAnswer);
		
		QuestionFetcher.fetchQuestion();
		//QuestionFetcher.fetchAnswers();
		QuestionFetcher.nextQuestion();
	}
	
}