package operaciones;

public class Operaciones{
    // 1
    public static int sumaHastaN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaHastaN(n - 1);
        }
    }

    // 2
    public static double calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    // 3
    public static long calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    // 4
    public static int sumaLista(int[] lista, int indice) {
        if (indice < 0 || indice >= lista.length) {
            return 0;
        } else {
            return lista[indice] + sumaLista(lista, indice + 1);
        }
    }

    // 5
    public static double mediaAritmetica(int[] lista, int indice) {
        if (indice < 0 || indice >= lista.length) {
            return 0;
        } else {
            return (lista[indice] + mediaAritmetica(lista, indice + 1) * indice) / (indice + 1);
        }
    }

    // 6
    public static double desviacionTipica(int[] lista, int indice, double media) {
        if (indice < 0 || indice >= lista.length) {
            return 0;
        } else {
            double diferencia = lista[indice] - media;
            return Math.sqrt((diferencia * diferencia + desviacionTipica(lista, indice + 1, media) * indice) / (indice + 1));
        }
    }

    // 7 
    public static int sumaPares(int n) {
        if (n < 2) {
            return 0;
        } else if (n % 2 == 0) {
            return n + sumaPares(n - 2);
        } else {
            return sumaPares(n - 1);
        }
    }

    // 8
    public static int sumaParesLista(int[] lista, int indice) {
        if (indice < 0 || indice >= lista.length) {
            return 0;
        } else if (lista[indice] % 2 == 0) {
            return lista[indice] + sumaParesLista(lista, indice + 1);
        } else {
            return sumaParesLista(lista, indice + 1);
        }
    }
}
    