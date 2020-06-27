import java.io.FileNotFoundException;
import java.util.Scanner;
public class QuestionFetcher extends Main{

	static int s = 0;
	static int j = 0;
	//static int counter = 0;
	
	public static void fetchQuestion() {
		
		System.out.println(questionText.get(s));
		System.out.println(correctAnswer.get(s).toString());
		fetchAnswers();
		j += 4;
	}
	
	public static void fetchAnswers() {
		
		System.out.println(answers.get(j));
		System.out.println(answers.get(j+1));
		System.out.println(answers.get(j+2));
		System.out.println(answers.get(j+3));
		s += 1;
	}
	
	public static void nextQuestion() throws FileNotFoundException {

			for(int counter = 1; counter <= questionText.size()+1; counter++) {
				Scanner sc = new Scanner(System.in);
				playerAnswers.add(sc.nextInt());
				if(counter < questionText.size()) {			
					fetchQuestion();
				}else {
					finishGame();
					System.out.println(playerAnswers);
					playerAnswers.clear();
					i = 0;
					j = 0;
					System.out.println(playerAnswers);
					sc.nextInt();
					menu(i);
				}
			}


	}
}
	
	/*public static void gameEnd() {
		if(playerAnswers == correctAnswer) {
			System.out.println("you won");
	}*/
		

