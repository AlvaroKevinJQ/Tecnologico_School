public class SCoseno{
    public static void main(String args[]){
        int n = 0; double x = 1, seno = 0, sumatoria;

        do{
            sumatoria = (potencia(-1, n)/ factorial(2*n)) * potencia(x,2*n);
            seno = seno + sumatoria;
            n++;
        }while(n <= 10);

        System.out.println("El coseno de "+x+" es "+seno);

    }

    public static double potencia(double n, int poten){
        double a = n;
        if(poten == 0){
            return 1;
        }
        while(poten != 1){
            n = n * a;
            poten--;
        }
        return n;
    }


    public static double factorial(int iNumero){
        double iFactorial = 1;
        for (int t = iNumero; t >= 2; t--)
                iFactorial = iFactorial * t;
        return iFactorial;
    }
}