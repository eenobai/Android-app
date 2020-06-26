import java.util.Scanner;
@SuppressWarnings("unchecked")
public class QuestionFetcher extends Main{

	static int i = 0;
	static int j = 0;
	//static int counter = 0;
	
	public static void fetchQuestion() {
		
		System.out.println(questionText.get(i).toString());
		System.out.println(correctAnswer.get(i).toString());
		fetchAnswers();
		j += 4;
	}
	
	public static void fetchAnswers() {
		
		System.out.println(answers.get(j).toString());
		System.out.println(answers.get(j+1).toString());
		System.out.println(answers.get(j+2).toString());
		System.out.println(answers.get(j+3).toString());
		i += 1;		
	}
	
	public static void nextQuestion() {
		try{if(playerAnswers.size() < questionText.size()) {
			for(int counter = 0; counter <= questionText.size(); counter++) {
				Scanner sc = new Scanner(System.in);
				playerAnswers.add(sc.nextInt());
				if(counter < questionText.size() && sc.hasNextInt()) {			
					fetchQuestion();
				}
			}
		}
		}
		catch (Exception e) {
			System.out.println("DId it crash?");
		}
	}
}
	
	/*public static void gameEnd() {
		if(playerAnswers == correctAnswer) {
			System.out.println("you won");
	}*/
		

