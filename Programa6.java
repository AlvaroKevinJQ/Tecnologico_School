/*Elaborar un programa que calcule la media, varianza y
desviación estándar, usando variables locales en los
métodos. Además utilice un método para leer números y
métodos que regresen valor para calcular el valor de cada
medida.*/
import java.util.Scanner;
public class Programa6{
      public static void main(String args[]){
            Scanner leer = new Scanner(System.in);
            int opc;
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("[1] Para ingresar datos");
            System.out.println("[2] Para sacar la media");
            System.out.println("[3] Para sacar la varianza");
            System.out.println("[4] Para sacar la desviacion estandar");
            System.out.println("[5] Para salir");
            opc = leer.nextInt();

            if(opc == 1){
                  media(leer,pedir(e));
            }if(opc == 2){
            
            }if(opc == 3){
            
            }if(opc == 4){
               
            }
      }
      static float[] pedir(Scanner leer){
            int i;
            System.out.println("Ingrese cuantos numeros va a ingresar: ");
            i = leer.nextInt();
            float[] arreglo = new float[i];
            for(int x = 0; x <  i; x++){
                  System.out.println("Ingrese el numero: ");
                  arreglo[x] = leer.nextFloat();
            }
            return arreglo;
      }
      static float media(Scanner e, Array pedir()){
            System.out.print("Sacar la media: ");
           
      }
   }