import java.util.Scanner;
public class Ejem_MCD{
    static int n1 = 0, n2 = 0;
    public static void capturar(){ //Método capturar
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Dame el primer numero: ");
            n1 = leer.nextInt();
        }while(n1 <= 0);
            
        do{
            System.out.println("Dame el segundo numero: ");
            n2 = leer.nextInt();
        }while(n2 <= 0);
    }

    public static int MCD(){
        int max = 0, min = 0;
        if (n1 < n2){
            min = 1;
        }else{
            min = n2;
        }
        for(int i = min; i >= 1; i++){
            if((n1 % i == 0) && (n2 % i == 0)){
                max = i;
            }
        }
        return max;
    }
    public static void main(String args[]){
        capturar();
        System.out.print("El Maximo comun divisor es: "+MCD());
    }

}