import java.util.Scanner;
public class Programa5{
   public static void main(String args[]){
         Scanner leer = new Scanner(System.in);
         if(primo(pedir(leer))){
               System.out.print("Si es primo");
         }else{
               System.out.print("No es primo");
         }
   }
   static int pedir(Scanner leer){
         int n;
         System.out.print("Ingrese el numero: ");
         do{
         n = leer.nextInt();
         }while(n<1);
         return n;
   }
   static boolean primo(int n){
         if(n == 1){
               return false;
         }else if(n==2){
               return true;
         }else if(n>2){
               for(int x = 2; x < n; x++){
                     if(n % x == 0){
                           return false;
                     }
               }
               return true;
         }
         return false;
   }
}