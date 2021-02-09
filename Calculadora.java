//Alvaro Kevin Jiménez Quintero - Pablo Vega
import java.util.Scanner;
public class Calculadora{
        static public Scanner leer = new Scanner(System.in);
        public static void main(String args[]){
                boolean permiso = true; //Variable boolean para que el programa no finalice

                        do{
                                        int opc = 0; double x; 
                                        System.out.println("Bienvenido a la Calculadora"); //Menu de opciones
                                        System.out.println("Porfavor seleccione una opción: ");
                                        System.out.println(" [1] Sacar Raiz Cuadrada");
                                        System.out.println(" [2] Sacar el Seno en radianes");
                                        System.out.println(" [3] Sacar el Coseno en radianes");
                                        System.out.println(" [4] Sacar el logaritmo natural");
                                        System.out.println(" [5] Sacar euler");
                                        System.out.println(" [6] Salir ");
                                        opc = leer.nextInt();
                                        switch(opc){
                                                case 1:
                                                        double n;
                                                        System.out.println("Ha elegido sacar Raíz Cuadrada");
                                                        System.out.println("Ingrese el numero del cual desea sacar la raiz cuadrada: ");
                                                        n = leer.nextDouble();
                                                        raiz(n);
                                                break;
                                                case 2:
                                                        System.out.println("Ha elegido sacar el Seno");
                                                        System.out.println("Ingrese el numero del cual desea sacar el Seno: ");
                                                        x = leer.nextDouble();
                                                        seno(x);

                                                break;
                                                case 3:
                                                        System.out.println("Ha elegido sacar el Coseno");
                                                        System.out.println("Ingrese el numero del cual desea sacar el Coseno: ");
                                                        x = leer.nextDouble();
                                                        coseno(x);
                                                break;
                                                case 4:
                                                                double o;
                                                                System.out.println("Ha elegido sacar el logaritmo");
                                                                System.out.println("Ingrese el argumento del logaritmo natural");
                                                                o = leer.nextDouble();
                                                                if(o < 1){
                                                                        logaritmo(o);
                                                                }else{
                                                                        logaritmo1(o);
                                                                }
                                                break;
                                                case 5:
                                                                double e;
                                                                System.out.println("Ingrese la potencia a la cual quiere elevar Euler:");
                                                                e = leer.nextInt();
                                                                euler(e);
                                                break;
                                                case 6:
                                                                System.out.println("Saliendo...");
                                                                permiso = false;
                                                break;
                                        }
                        }while(permiso);
        }

        public static void raiz(double n){ //Método que debería sacar la raíz cuadrada pero no funciona
                double sumatoria, raiz1 = 0;
                for(int x = 1; x < n; x++){
                                sumatoria = (1/2) * (x + n/x);
                                raiz1  = raiz1 + sumatoria;
                }
                System.out.println("La raiz cuadrada de "+n+" es "+raiz1);
        }

        public static void euler(double e){ //Función que eleva euler a una potencia
                        int i = 100; double sumatoria, eu = 0;
                        for(int n = 0; n <= i; n++){
                                        sumatoria = potencia(e,n)/factorial(n);
                                        eu = eu + sumatoria;
                        }
                        System.out.println("e a la x = "+eu);
        }

        public static void logaritmo(double x){ //Función que saca el logaritmo cuando el argumento de logaritmo es menor a 1
                        int n = 100; double sumatoria = 0, logaritmoR = 0;
                        for(int i = 1; i <= n; i++){
                                sumatoria = (potencia(-1, i+1)/i)* potencia(x,i);
                                logaritmoR = logaritmoR + sumatoria;
                        }
                        System.out.println("El logaritmo natural de "+x+" es "+logaritmoR);
        }

        public static void logaritmo1(double x){ //Método que debería saar el logaritmo cuando es igual op mayor a 1, se acerca pero no está correcto
                int i = 100; double sumatoria = 0, logaritmoR = 0;
                for(int n = 0; n <= i; n++){
                         sumatoria = (1/((2*n)+1)) * potencia( (x-1)/(x+1) , (2*n) + 1);
                         logaritmoR = logaritmoR + sumatoria;
                }
                logaritmoR = logaritmoR * 2;
                System.out.println("El logaritmo natural de "+x+" multiplicado por dos es "+logaritmoR);
        }


        public static void coseno(double x){ //Función que imprime el coseno en radianes
                int n = 0; double seno = 0, sumatoria;

                do{
                                sumatoria = (potencia(-1, n)/ factorial(2*n)) * potencia(x,2*n);
                                seno = seno + sumatoria;
                                n++;                            
                }while(n <= 10);

                System.out.println("El coseno de "+x+" es "+seno);
        }



        public static void seno(double x){ //Función del seno en radianes
                System.out.println("Ingrese el angulo en radianes");
                int n = 0; double seno = 0, sumatoria; 

                do{
                        sumatoria = ((potencia(-1,n)) / (factorial(2*n + 1))) * (potencia(x,(2*n)+1));
                        seno = seno + sumatoria;
                        n++;
                }while(n < 50);     

                System.out.println("El seno de "+x+" es "+seno);           
        }



        public static double potencia(double n, int poten){ //Eleva numeros a una potencia y lo retorna
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
        
        public static double factorial(double numero) { //Calcula y devuelve el facotiral de un número
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