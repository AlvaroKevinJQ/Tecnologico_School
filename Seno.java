public class Seno{
    public static void main(String args[]){
        System.out.println("Ingrese el angulo en radianes");
        int n = 0; double seno = 0, x = 1, sumatoria; 

        do{
                sumatoria = ((potencia(-1,n)) / (factorial(2*n + 1))) * (potencia(x,(2*n)+1));
                seno = seno + sumatoria;
                n++;
        }while(n < 50);     

        System.out.println("El seno de "+x+" es "+seno+" en radianes");
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

    public static double factorial(double numero) {
		if (numero < 0)
			numero = numero * -1;
		if (numero <= 0)
			return 1;
		double  factorial = 1;
		while (numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}
}