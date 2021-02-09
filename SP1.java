public class SP1 {
    public static void main(String[] args) {

        double angulo = Math.toRadians(90);

        System.out.println("Serie: " + serieTaylor(angulo));
    }

    static double serieTaylor(double x) {
        double sumando, sumatoria = 0, precision = 0.0001d;

        // limite superior, iteracion de la sumatoria
        int n = 0; 

        do {
            sumando = Math.pow(-1, n) / factorial(2 * n) * Math.pow(x, 2 * n);
            sumatoria = sumatoria + sumando;
            n = n + 1;
        } while (Math.abs(sumando) > precision);

        return sumatoria;
    }

    static double factorial(int numero) {
        double factorial = 1.0d;

        while (numero != 0) {
            factorial *= numero--;
        }

        return factorial;
    }
}