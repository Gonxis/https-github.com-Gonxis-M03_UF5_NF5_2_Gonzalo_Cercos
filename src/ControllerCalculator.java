
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gonxi's
 */
public class ControllerCalculator implements ActionListener {

    private ViewCalculator viewC;
    private ModelCalculator modelC;

    public ControllerCalculator(ViewCalculator v, ModelCalculator m) {
        this.viewC = v;
        this.modelC = m;

        viewC.addListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        String boton = e.getActionCommand();
//        String texto = vc.getLabel().getText();

        for (JButton[] button : ViewCalculator.getButtonM()) {

            for (JButton boton : button) {

                if (e.getSource() == boton) {

                    switch (boton.getText()) {
                        
                        case "+":
                            modelC.suma(viewC.getLabel());
                            viewC.setLabelText(modelC.getNum() + "");
                            break;
                        case "-":
                            modelC.resta(viewC.getLabel());
                            viewC.setLabelText(modelC.getNum() + "");
                            break;
                        case "X":
                            modelC.multi(viewC.getLabel());
                            viewC.setLabelText(modelC.getNum() + "");
                            break;
                        case "/":
                            modelC.divi(viewC.getLabel());
                            viewC.setLabelText(modelC.getNum() + "");
                            break;
                        case "CE":
                            modelC.reset();
                            viewC.setLabelText(modelC.getNum() + "");
                            break;
                        case "=":
                            modelC.igual(viewC.getLabel());
                            viewC.setLabelText(modelC.getNum() + "");
                            break;
                        default:
                            viewC.setLabelText(boton.getText());
                            break;
                    }
                }
            }
        }
    }
}
