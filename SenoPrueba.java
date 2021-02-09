import java.util.Scanner;
public class SenoPrueba{
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        int n = 10; double x,  sumatoria = 0, dividendo = 0, divisor = 0, signo = 0;  
        System.out.println("Ingrese el numero del que desea sacar el seno");
        x = leer.nextDouble();

        for(int i = 0; i <= n; i++){
            System.out.println("Cuanto vale i: "+ i);
            //Primero sacamos el dividendo:
            dividendo = 0;
            dividendo = potencia(x,(2*i)+1);
            System.out.println("Dividendo = "+dividendo);
            
            //Sacamos el divisor:
            divisor = 0;
            divisor =  factorial1((2*i)+1); 
            System.out.println("divisor = "+divisor);

            //Sacamos el signo
            signo = potencia(-1, i);
            System.out.println("Signo = "+signo);


            sumatoria = sumatoria + (( dividendo / divisor) * signo);
        }

        System.out.println("El seno de "+x+ " es: "+sumatoria);
    }


    public static double factorial(int iNumero){
        double iFactorial = 1;
        for (int t = iNumero; t >= 2; t--)
                iFactorial = iFactorial * t;
        System.out.println("El factorial: "+iFactorial);
        return iFactorial;
    }


    public static double factorial1(double numero) {
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
}