
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonxi's
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static String algo;
    public static void main(String[] args) {
        
        ViewCalculator vista = new ViewCalculator();
        ModelCalculator modelo = new ModelCalculator(algo);
        ControllerCalculator controlador = new  ControllerCalculator(vista,modelo);
         
        //Esta linea es quiza la mas importante vincula la funcionalidad de las 3 clases MVC
//        vista.setControlador(controlador);
 
        ViewCalculator.createAndShowGUI();
        
    }
}
