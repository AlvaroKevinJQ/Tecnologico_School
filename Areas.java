import java.util.Scanner;
public class Areas{
        public static void main(String args[]){
                int opc;
                Scanner leer = new Scanner(System.in); 
                
                do{
                                System.out.println("Programa para caluclar areas");
                                System.out.println("[1] Para calcular el area de un cuadrado");
                                System.out.println("[2] Para calcular el area de un rectangulo");
                                System.out.println("[3] Para calcular el area de un circulo");
                                System.out.println("[4] Para calcular el area de un triangulo");
                                System.out.println("[5] Para salir");
                                System.out.println("Ingrese la opción deseada: ");
                                opc = leer.nextInt();
                        
                                switch (opc){
                                        case 1:
                                                                
                                                cuadrado(leer);
                                        break;
                                                
                                        case 2:
                                                recta(leer);
                                        break;
                                                
                                        case 3:
                                                circulo(leer);       
                                        break;
                                                
                                        case 4:
                                                triangulo(leer);
                                        break;
                                                
                                        case 5:
                                                        System.out.println("SALISTE");       
                                                        opc = 1001005;
                                        break;

                                                default: System.out.print("Opcion invalida");
                                }
                }while(opc != 1001005);

     
        }
        public static void cuadrado(Scanner leer){
                float n1 = 0;
                System.out.println("CUADRADO");
                System.out.println("Ingrese la medida de un lado: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("El area del cuadrado es: "+ n1*n1);
                n1 = 0;
        }

        public static void recta(Scanner leer){
            float n1 = 0, n2 = 0;
                System.out.println("RECTANGULO");
                System.out.println("Ingrese la base del rectangulo: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("Ingrese la altura del rectangulo: ");
                do{
                
                        n2 = leer.nextInt();
                        if ( n2 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n2 < 0);
                System.out.println("El area del rectangulo es: "+ n1*n2);
                n1 = 0;
                n2 = 0;
        }

        public static void circulo(Scanner leer){
                float n1 = 0;
                System.out.println("CIRCULO");
                System.out.println("Ingrese el radio del circulo: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("El area del circulo es: "+ (3.1416)*(n1*n1));
                n1 = 0;

        }
        public static void triangulo(Scanner leer){
            float n1 = 0, n2 = 0;
                System.out.println("TRIANGULO");
                System.out.println("Ingrese la base del triangulo: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println("Ingrese la altura del triangulo: ");
                do{
                
                        n2 = leer.nextInt();
                        if ( n2 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                }while(n2 < 0);
        
                System.out.println("El area del triangulo: "+(n1*n2)/2);
                n1 = 0;
                n2 = 0;
        }
}
