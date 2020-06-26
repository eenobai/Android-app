import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
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
    
    static int i = 0;
    
    public void menu(int j) {
    	i = j;
    	if(i == 1) {
    		System.out.println("Game has been started");
    		
    		QuestionFetcher.fetchQuestion();
    		QuestionFetcher.nextQuestion();	
    		}if(i == 2) {
    		System.out.println("Exiting the game");
    		System.exit(0); 
    	}else {System.out.println("Invalid input /from menu");
    	}	
    }
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("1-start game, 2 -exit game;");
		Scanner sc = new Scanner(System.in);		
		i = sc.nextInt();
		
		
		Parser tester = new Parser();
		tester.parser();
		tester.menu(i);	

	}

}	