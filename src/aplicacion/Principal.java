package aplicacion;
import operaciones.*;

public class Principal{
    public static void main(String[] args) {
        System.out.println("Suma hasta 5: " + sumaHastaN(5));
        System.out.println("Factorial de 4: " + calcularFactorial(4));
        System.out.println("Potencia de 2^3: " + calcularPotencia(2, 3));

        int[] lista = {1, 2, 3, 4, 5};
        System.out.println("Suma de la lista: " + sumaLista(lista, 0));
        System.out.println("Media aritmética de la lista: " + mediaAritmetica(lista, 0));

        double media = mediaAritmetica(lista, 0);
        System.out.println("Desviación típica de la lista: " + desviacionTipica(lista, 0, media));

        System.out.println("Suma de los primeros números pares hasta 9: " + sumaPares(9));

        int[] listaPares = {1, 2, 3, 4};
        System.out.println("Suma de los elementos pares de la lista: " + sumaParesLista(listaPares, 0));
    }
}