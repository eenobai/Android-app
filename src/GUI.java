import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class GUI {
    static int j = 0;

    static JButton button1 = new JButton("New game");
    static JButton button2 = new JButton("Exit game");
    static JButton bAnswer0 = new JButton(Main.answers.get(j));
    static JButton bAnswer1 = new JButton(Main.answers.get(j+1));
    static JButton bAnswer2 = new JButton(Main.answers.get(j+2));
    static JButton bAnswer3 = new JButton(Main.answers.get(j+3));

    public static void menuPanel() {
        JFrame frame = new JFrame();
        JPanel menuPanel = new JPanel();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Game has been started");
                QuestionFetcher.fetchQuestion();
                try {
                    QuestionFetcher.nextQuestion();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting the game");
                System.exit(69);
            }
        });
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

    public void questionPanel(){


        JFrame frame = new JFrame();
        JPanel questionPanel = new JPanel();
        questionPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100,100));

        frame.add(questionPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Little gaym");
        frame.pack();
        frame.setVisible(true);

        GridBagConstraints grid = new GridBagConstraints();
        questionPanel.add(bAnswer0, grid);
        questionPanel.add(bAnswer1, grid);
        questionPanel.add(bAnswer2, grid);
        questionPanel.add(bAnswer3, grid);

        //this.setContentPane(questionPanel());
        //revalidate();
    }




}
