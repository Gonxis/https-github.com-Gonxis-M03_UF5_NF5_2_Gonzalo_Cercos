
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
    public static void main(String[] args) {
        
        ModelCalculator modelo = new ModelCalculator();
        ViewCalculator vista = new ViewCalculator(modelo);
        ControllerCalculator controlador = new  ControllerCalculator(vista, modelo);
         
        //Esta linea es quiza la mas importante vincula la funcionalidad de las 3 clases MVC
//        vista.setControlador(controlador);
         
    }
}
