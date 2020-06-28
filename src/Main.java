import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JFrame;

@SuppressWarnings("unchecked")
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
    
    static int i = 0;


    
    public static void menu(int j) throws FileNotFoundException {
    	i = j;

			if (i == 1) {
				System.out.println("Game has been started");
				QuestionFetcher.fetchQuestion();
				QuestionFetcher.nextQuestion();
			}
			if (i == 2) {
				System.out.println("Exiting the game");
				System.exit(69);
			} else {
				System.out.println("Invalid input /from menu");
			}

    	EndGame.finalScore();
    }
    
    public static void finishGame() {
    	EndGame.finalScore();
    }
	
	@SuppressWarnings("resource")
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