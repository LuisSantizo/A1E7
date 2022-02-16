import java.util.Random;

public class A1E7 {

    public static void main(String[] args) {
        //definir variables
        int NumeroAzar;
        double Procentaje;
        double nuevoNumero;

        //definir el numero al azar
        Random NumeRandom = new Random();
        NumeroAzar = NumeRandom.nextInt(40) + 11;

        System.out.println("El algoritmo genero el numero " + NumeroAzar);

        //hacer las operaciones
        Procentaje = NumeroAzar * 0.15;
        nuevoNumero = NumeroAzar - Procentaje;

        System.out.println(NumeroAzar + " disminuido en un 15% es " + nuevoNumero);
    }

}
