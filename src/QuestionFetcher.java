import java.util.Scanner;
@SuppressWarnings("unchecked")
public class QuestionFetcher extends Main{

	static int i = 0;
	static int j = 0;
	static int counter = 0;
	
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
		while(counter < questionText.size()) {
		Scanner sc = new Scanner(System.in);
		playerAnswers.add(sc.nextInt());
		if(counter < questionText.size() && sc.hasNextInt()) {
			counter += 1;
			fetchQuestion();
		}
		System.out.println(playerAnswers);
	}
	}
}
