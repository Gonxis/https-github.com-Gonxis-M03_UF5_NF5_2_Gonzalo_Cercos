
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

        String tecla = e.getActionCommand();
        String texto = viewC.getLabel();

        try {    // Mantenemos en esta clase el "control" de errores            
            // Delegamos la logica de negocio a la clase modelo
            String resultado = modelC.evaluarExpresion(texto,tecla);
            // Actualizamos la vista con ese resultado
            viewC.setLabelText( resultado );
         } catch (Exception ex) { // capturamos la excepcion si "algo" salio mal
            viewC.setLabelText( "OCURRIO UN ERROR DE ENTRADA" );
            ex.printStackTrace();
        } 
    }
}
