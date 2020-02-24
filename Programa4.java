import java.util.Scanner;
public class Programa4{
       public static void main(String [] args){
           Scanner leer = new Scanner(System.in);
          
          System.out.println("El numero mayor es:"+determinar(pedir(leer)));
       }
       public static int[] pedir(Scanner leer){
           int a, b, c;
           System.out.println("Ingrese el primer numero");
           a = leer.nextInt();
           System.out.println("Ingrese el segundo numero");
           b = leer.nextInt();
           System.out.println("Ingrese el tercer numero");
           c = leer.nextInt();
           int ar [] = {a,b,c};
           return ar;
       }
       public static int determinar(int[] a){
           if((a[0] > a[1]) && (a[0] > a[2])){
               return a[0];
           }else if(a[1] > a[2] && (a[1] > a[0])){
               return a[1];
           }else if(a[2] > a[1] && (a[2] > a[0])){
               return a[2];
           }else{
           return 0;
           }
       }
}