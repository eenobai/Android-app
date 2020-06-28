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

		tempAnswers.add(answers.get(j));
		tempAnswers.add(answers.get(j+1));
		tempAnswers.add(answers.get(j+2));
		tempAnswers.add(answers.get(j+3));


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
					/*questionText.clear();
					answers.clear();
					imageId.clear();
					correctAnswer.clear();
					bug.clear();*/
					s = 0;
					j = 0;
					System.out.println(playerAnswers);
					System.out.println("1 if you want to continue");
					menu(sc.nextInt());
				}
			}


	}
}
	
	/*public static void gameEnd() {
		if(playerAnswers == correctAnswer) {
			System.out.println("you won");
	}*/
		

