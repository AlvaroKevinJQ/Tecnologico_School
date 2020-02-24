import java.util.Scanner;
public class Monedas{
        public static void main(String args[]){
                int opc;
                Scanner leer = new Scanner(System.in); 
                
                do{
                                System.out.println("Programa para caluclar areas");
                                System.out.println("[1] Para cambiar pesos a Dolares");
                                System.out.println("[2] Para cambiar pesos a Euros");
                                System.out.println("[3] Para cambiar a Libras Esterlinas");
                                System.out.println("[4] Para cambiar pesos a Yenes");
                                System.out.println("[5] Para salir");
                                System.out.println("Ingrese la opción deseada: ");
                                opc = leer.nextInt();
                        
                                switch (opc){
                                        case 1:
                                                                
                                                dolar(leer);
                                        break;
                                                
                                        case 2:
                                                euros(leer);
                                        break;
                                                
                                        case 3:
                                                libras(leer);       
                                        break;
                                                
                                        case 4:
                                                yenes(leer);
                                        break;
                                                
                                        case 5:
                                                        System.out.println("SALISTE");       
                                                        opc = 1001005;
                                        break;

                                                default: System.out.print("Opcion invalida");
                                }
                }while(opc != 1001005);

     
        }
        public static void dolar(Scanner leer){
                float n1 = 0;
                System.out.println("DOLAR");
                System.out.println("Ingrese cuantos pesos MX quiere convertir a Dolares: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println(n1+" pesos en dolares son: "+ n1/21.00);
                n1 = 0;
        }

        public static void euros(Scanner leer){
            float n1 = 0;
                System.out.println("EUROS");
                System.out.println("Ingrese los pesos MX que quiere convertir a Euros: ");
                n1 = leer.nextInt();
                if ( n1 < 0 ){
                    System.out.println("Numero invalido, introduzca uno mayor a -1");
                }
        
                System.out.println(n1+" pesos MX en Euros son: "+ n1/20.54);
                n1 = 0;
        }

        public static void libras(Scanner leer){
                float n1 = 0;
                System.out.println("LIBRAS");
                System.out.println("Ingrese los pesos MX que quiere convertir a Libras: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
                System.out.println(n1+" pesos MX en Libras Esterlinas son: "+ n1/24.20);
                n1 = 0;

        }
        public static void yenes(Scanner leer){
            float n1 = 0;
                System.out.println("YENES");
                System.out.println("Ingrese los pesos MX que quiere convertir a Yenes: ");
                do{
                        n1 = leer.nextInt();
                        if ( n1 < 0 ){
                                System.out.println("Numero invalido, introduzca uno mayor a -1");
                        }
                
                }while(n1 < 0 );
               
                System.out.println(n1+" pesos MX en Yenes son: "+ n1/0.17);
                n1 = 0;
        }
}
