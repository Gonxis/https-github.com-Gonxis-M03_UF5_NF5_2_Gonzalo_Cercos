
import javax.script.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gonxi's
 */
public class ModelCalculator {

//    private int num;
    private String resultado;
//    private char signo;

    public ModelCalculator() {
//        this.num = 0;
        this.resultado = "0";
    }

    public String evaluarExpresion(String texto, String tecla){ 
 
        switch(tecla){
 
            case "C": resultado = texto.substring(0,texto.length()-1);break;
            case "CE": resultado = "0";break;
            case ".": if(!texto.contains(".")){resultado =texto+".";}break;
            case "/": resultado = texto + "/"; break;
            case "X": resultado = texto + "X"; break;
            case "-": resultado = texto + "-"; break;
            case "+": resultado = texto + "+"; break;
            case "=":
            case " "://Los botones de arriba a la izquierda, que son dos sin nada, un espacio en blanco, son los que hacen de
                        // "=" a causa de que no detecta mi tecla "="
                try {   
                  // crear la fabrica de maquinas manejadoras de scripts
                  ScriptEngineManager factory = new ScriptEngineManager();
                  // crear la maquina especifica para javascript
                  ScriptEngine engine = factory.getEngineByName("JavaScript");
                  // evaluar la expresion matematica con javascript
                  Object result = engine.eval(texto);   
                  resultado = result.toString();                                   
                 } catch (ScriptException ex) { // capturamos la excepcion si "algo" salio mal
                    resultado = "Ocurrio la siguiente excepcion"+ex.getMessage();
                }                                            
                  break;
            default:// Capturamos todos los eventos de las teclas numericas ( botones 1-9 )
                if(Character.isDigit(tecla.charAt(0))){ resultado = texto + tecla.charAt(0);}
                break;
 
            }   
         
        return resultado;
    }
}
