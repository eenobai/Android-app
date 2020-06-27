import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class EndGame extends Main{

	public static void finalScore() {

		if(playerAnswers.equals(correctAnswer)) {
			System.out.println("gg you won");
			System.out.println("final score " + correctAnswer.size());
		}else{
			int x = 0;
			ArrayList<Integer> endScore = new ArrayList();

			System.out.println("pepehands");
			while(x < correctAnswer.size()){
				if(playerAnswers.get(x).equals(correctAnswer.get(x))){
					endScore.add(1);
				}
				x++;
			}
			System.out.println("Final score is " + endScore.size());
		}

	}

}