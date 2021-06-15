package treino_diario;

/**
 * metodosdesobrecarga
 * Objetivo deste exemplo é a chamada de dois metodos com o mesmo nome porem com parametros distintos
 */

public class metodosdesobrecarga {

    public void chamaOsMetodos() {

        System.out.printf(" raiz quadrada do int 7 eh %d\n", raiz(7));
        System.out.printf(" raiz quadrada do double 7.5 eh %f\n", raiz(7.5));
        
    }

    public int raiz(int intValue){

        System.out.printf("\n chamando a raiz quadrada com parametro int %d\n",intValue);
        return intValue * intValue;
    }

    public double raiz(double doubleValue){

        System.out.printf("\n chamando a raiz quadrada com parametro int %f\n",doubleValue);
        return doubleValue * doubleValue;

    }
    public static void main(String[] args) {
        metodosdesobrecarga chamaraiz = new metodosdesobrecarga();
        chamaraiz.chamaOsMetodos();

    }
}