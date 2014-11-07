
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gonxi's
 */
public class ViewCalculator extends JFrame {

    private static JLabel label = new JLabel();
    private static String[][] valores = {{"CE", " ", " ", " "}, {"7", "8", "9", "+"}, {"4", "5", "6", "-"}, {"3", "2", "1", "X"}, {"0", "·", "=", "/"}};
    private static JButton[][] buttonM;
    
    private ModelCalculator model;
    //Create and set up the window.
    public ViewCalculator (ModelCalculator model){
        ViewCalculator.createAndShowGUI();
    }
    public static void addComponentsToPane(Container pane) {


        //set Layout to pane
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));


        //1.- component
        JPanel panel1 = new JPanel();
        label = new JLabel("0");
        label.setOpaque(true);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setPreferredSize(new Dimension(250, 22));
        label.setBackground(Color.WHITE);
        panel1.add(label);
        pane.add(panel1, BorderLayout.PAGE_START);
        panel1.setBackground(Color.WHITE);

        //2.- component
        JPanel panel = new JPanel();
        buttonM = new JButton[5][4];
        panel.setLayout(new GridLayout(5, 4));

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                buttonM[i][j] = new JButton(valores[i][j]);

                panel.setPreferredSize(new Dimension(230, 300));
                panel.add(buttonM[i][j]);
                pane.add(panel);
            }
        }


    }

    public JLabel getLabel() {
        return label;

    }

    public static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        //Fix the size
        frame.setResizable(false);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
