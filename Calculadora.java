import java.util.Scanner;
public class Calculadora{
        public static void main(String args[]){
                int opc;
                Scanner leer = new Scanner(System.in); 
                float n1 = 0, n2 = 0;
                do{
                                System.out.println("Esta es una calculadora");
                                System.out.println("[1] Para sumar");
                                System.out.println("[2] Para restar");
                                System.out.println("[3] Para multiplicar");
                                System.out.println("[4] Para dividir");
                                System.out.println("[5] Para salir");
                                System.out.println("Ingrese la opción deseada: ");
                                opc = leer.nextInt();
                        
                                switch (opc){
                                        case 1:
                                                                
                                                suma(n1,n2, leer);
                                        break;
                                                
                                        case 2:
                                                resta(n1, n2, leer);
                                        break;
                                                
                                        case 3:
                                                multi(n1, n2, leer);       
                                        break;
                                                
                                        case 4:
                                                divi(n1, n2, leer);
                                        break;
                                                
                                        case 5:
                                                        System.out.println("SALISTE");       
                                                        opc = 1001005;
                                        break;

                                                default: System.out.print("Opcion invalida");
                                }
                }while(opc != 1001005);

     
        }
        public static void suma(float n1, float n2, Scanner leer){
                System.out.println("SUMA");
                System.out.println("Ingrese el primero numero: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("Ingrese el segundo numero: ");
                do{
                
                        n2 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n2 < 0);
                
                n1 = n1 + n2;
                
                if(n1 < 0){
                        n1 = n1 * -1;
                }
                System.out.println("El resultado de la suma es: "+ n1);
                n1 = 0;
                n2 = 0;
        }

        public static void resta(float n1, float n2, Scanner leer){
                System.out.println("RESTA");
                System.out.println("Ingrese el primero numero: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("Ingrese el segundo numero: ");
                do{
                
                        n2 = leer.nextInt();
                        if ( n2 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n2 < 0);
                n1 = n1 - n2;
                if(n1 < 0){
                                n1 = n1 * -1;
                }
                System.out.println("El resultado de la resta es: "+ n1);
                n1 = 0;
                n2 = 0;
        }

        public static void multi(float n1, float n2, Scanner leer){
                System.out.println("MULTIPLICACION");
                System.out.println("Ingrese el primero numero: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("Ingrese el segundo numero: ");
                do{
                
                        n2 = leer.nextInt();
                        if ( n2 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n2 < 0);
                n1 = n1 * n2;
                if(n1 < 0){
                                n1 = n1 * -1;
                }
                System.out.println("El resultado de la multiplicacion es: "+ n1);
                n1 = 0;
                n2 = 0;
        }
        public static void divi(float n1, float n2, Scanner leer){
                System.out.println("DIVISIÓN");
                System.out.println("Ingrese el primero numero: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("Ingrese el segundo numero: ");
                do{
                
                        n2 = leer.nextInt();
                        if ( n2 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n2 < 0);
                n1 = n1 / n2;
                if(n1 < 0){
                                n1 = n1 * -1;
                }
                System.out.println("El resultado de la division es: "+n1);
                n1 = 0;
                n2 = 0;
        }
}
