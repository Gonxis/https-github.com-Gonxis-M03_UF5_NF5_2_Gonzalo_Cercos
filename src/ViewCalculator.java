
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
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
public class ViewCalculator extends JFrame{
    
    private static JLabel label = new JLabel();
    private static void addComponentsToPane(Container pane) {
        
        
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
        JPanel panel = new JPanel ();
        panel.setLayout(new GridLayout (4,4));
        panel.setPreferredSize(new Dimension (230, 300));
        addButtonsToPanel(panel);
        panel.setBackground(Color.WHITE);
        pane.add(panel);      
        
    }
    
    private static void addButtonsToPanel (JPanel panel){
        
        panel.add(new JButton ("7"));
        panel.add(new JButton ("8"));
        panel.add(new JButton ("9"));
        panel.add(new JButton ("/"));        
        panel.add(new JButton ("4"));
        panel.add(new JButton ("5"));
        panel.add(new JButton ("6"));
        panel.add(new JButton ("X"));
        panel.add(new JButton ("3"));
        panel.add(new JButton ("2"));
        panel.add(new JButton ("1"));
        panel.add(new JButton ("-"));
        panel.add(new JButton ("0"));
        panel.add(new JButton ("·"));
        panel.add(new JButton ("="));
        panel.add(new JButton ("+"));

//        Dimension buttonSize = panel.getPreferredSize();
    }
    
    public JLabel getLabel (){
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
