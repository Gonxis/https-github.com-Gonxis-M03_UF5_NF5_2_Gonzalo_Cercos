/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gonxi's
 */
public class ModelCalculator {

    private double num;
    private double resultado;
    private char signo;
//    private static String texto;

    public ModelCalculator() {
//        ModelCalculator.texto = ViewCalculator.getLabel().getText();
        this.num = 0;
        this.resultado = 0;
    }

    public void igual(String texto) {
        switch (signo) {
            case '+':
                sumaAux(texto);
                break;
            case '-':
                restaAux(texto);
                break;
            case '*':
                multiAux(texto);
                break;
            case '/':
                diviAux(texto);
                break;
            default://se introduce un nuemero no se detecta singun signo resultado sera el mismo numero
                primerValor(texto);
                break;
        }

        signo = '=';
    }

    public void suma(String texto) {

        if (signo == '+') {
            sumaAux(texto);
        } else if (signo == '-') {
            restaAux(texto);
        } else if (signo == '*') {
            multiAux(texto);
        } else if (signo == '/') {
            diviAux(texto);
        } else if (signo == '=') {
            igualAux(texto);
        } else {
            primerValor(texto);
        }
        signo = '+';
    }

    public void resta(String texto) {
        if (signo == '-') {
            restaAux(texto);
        } else if (signo == '+') {
            sumaAux(texto);
        } else if (signo == '*') {
            multiAux(texto);
        } else if (signo == '/') {
            diviAux(texto);
        } else if (signo == '=') {
            igualAux(texto);
        } else {
            primerValor(texto);
        }
        signo = '-';
    }

    public void multi(String texto) {

        if (signo == '*') {
            multiAux(texto);
        } else if (signo == '-') {
            restaAux(texto);
        } else if (signo == '+') {
            sumaAux(texto);
        } else if (signo == '/') {
            diviAux(texto);
        } else if (signo == '=') {
            igualAux(texto);
        } else {
            primerValor(texto);
        }
        signo = '*';
    }

    public void divi(String texto) {

        if (signo == '*') {
            multiAux(texto);
        } else if (signo == '-') {
            restaAux(texto);
        } else if (signo == '+') {
            sumaAux(texto);
        } else if (signo == '/') {
            diviAux(texto);
        } else if (signo == '=') {
            igualAux(texto);
        } else {
            primerValor(texto);
        }
        signo = '/';

    }

    private void sumaAux(String texto) {
        num = Double.parseDouble(texto);
        resultado += num;
    }

    private void restaAux(String texto) {
        num = Double.parseDouble(texto);
        resultado -= num;
    }

    private void multiAux(String texto) {
        num = Double.parseDouble(texto);
        resultado *= num;
    }

    private void diviAux(String texto) {
        num = Double.parseDouble(texto);
        resultado /= num;
    }

    private void igualAux(String texto) {
        resultado = Double.parseDouble(texto);
    }

    private void primerValor(String texto) {
        num = Double.parseDouble(texto);
        resultado = num;
    }

    public double getNum() {
        return resultado;
    }

    public void reset() {
        num = 0;
        resultado = 0;
        signo = 'n';
    }
}
