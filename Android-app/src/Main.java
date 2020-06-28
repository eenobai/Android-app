import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

@SuppressWarnings("unchecked")
public class Main implements ActionListener {
	
	static ArrayList<Integer> imageId = new ArrayList();
    static ArrayList<String> questionText = new ArrayList();
    static ArrayList<String> answers = new ArrayList();
    static ArrayList<Integer> correctAnswer = new ArrayList();
    static ArrayList<Integer> playerAnswers = new ArrayList();
    static ArrayList<String> bug = new ArrayList();
    static ArrayList<String> tempAnswers = new ArrayList();

	JButton button1 = new JButton("New game");
	JButton button2 = new JButton("Exit game");
	JFrame frame = new JFrame();

    public Main() {


    	JPanel menuPanel = new JPanel();

    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	GridBagConstraints grid = new GridBagConstraints();

    	menuPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
    	menuPanel.setLayout(new GridLayout());

		grid.gridx = 0;
		grid.gridy = 1;
    	menuPanel.add(button1, grid);
    	grid.gridx = 0;
    	grid.gridy = 2;
    	menuPanel.add(button2);

    	frame.add(menuPanel, BorderLayout.CENTER);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setTitle("Little gaym");
    	frame.pack();
    	frame.setVisible(true);


    }
    
    static int i = 0;

    private void questionPanel(){
    	int j = 0;
		JButton bAnswer0 = new JButton(answers.get(j));
		JButton bAnswer1 = new JButton(answers.get(j+1));
		JButton bAnswer2 = new JButton(answers.get(j+2));
		JButton bAnswer3 = new JButton(answers.get(j+3));

    	JPanel questionPanel = new JPanel();
    	questionPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100,100));

		frame.add(questionPanel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Little gaym");
		frame.pack();
		frame.setVisible(true);

	}
    
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

    	new Main();

		System.out.println("1-start game, 2 -exit game;");
		Parser.parser();
		/*Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		menu(i);

		 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {

    	if(e.getSource() == button1) {

			questionPanel();

			try {
				menu(1);
			} catch (FileNotFoundException fileNotFoundException) {
				fileNotFoundException.printStackTrace();
			}
		}
		else if(e.getSource() == button2){
			try {
				menu(2);
			} catch (FileNotFoundException fileNotFoundException) {
				fileNotFoundException.printStackTrace();
			}
		}
	}


}