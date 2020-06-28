import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main{
	
	static ArrayList<Integer> imageId = new ArrayList();
    static ArrayList<String> questionText = new ArrayList();
    static ArrayList<String> answers = new ArrayList();
    static ArrayList<Integer> correctAnswer = new ArrayList();
    static ArrayList<Integer> playerAnswers = new ArrayList();
    static ArrayList<String> bug = new ArrayList();
    static ArrayList<String> tempAnswers = new ArrayList();

    public Main() {
    }

    public static void finishGame() {
    	EndGame.finalScore();
    }
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("1-start game, 2 -exit game;");
		Parser.parser();
		GUI.menuPanel();
		/*Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		menu(i);
		 */
	}
}