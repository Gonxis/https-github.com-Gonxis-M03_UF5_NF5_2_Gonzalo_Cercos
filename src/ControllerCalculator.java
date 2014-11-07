
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonxi's
 */
public class ControllerCalculator implements ActionListener{
    
    private ViewCalculator vc;
    private ModelCalculator mc;
    
    public ControllerCalculator(ViewCalculator vc, ModelCalculator mc){
        this.vc = vc;
        this.mc = mc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String texto = vc.getLabel().getText();

    }
}
