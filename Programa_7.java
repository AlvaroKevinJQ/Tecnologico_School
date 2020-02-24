/* Elaborar un programa que calcule el salario de un
empleado. Utilizando un método para darlo de alta, los datos
a solicitar son No. Empleado, Nombre, Dirección, salario por
hora y otro método para calcular su salario, recibiendo como
parámetro el número de horas trabajadas y retornando el
cálculo del salario.*/
import java.util.Scanner;
public class Programa_7{
      public static void main(String args[]){
            Scanner leer = new Scanner(System.in);
            int [] arreglo = new int[1];
            alta(leer, arreglo);
            System.out.print("Su salario total por sus horas trabajadas es: "+salario(arreglo, leer)+" pesitos");      
      }
      static void alta(Scanner leer, int [] arreglo){
            int numEmpleado, salarioH;
            String nombre, direccion;            
            System.out.println("Ingrese su numero de empleado: ");
            numEmpleado = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese su nombre: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese su Direccion: ");
            direccion = leer.nextLine();
            System.out.println("Ingrese su salario por hora: ");
            arreglo[0] = leer.nextInt();
      }
     static int salario(int[] arreglo, Scanner leer){
            int pichula;
            System.out.println("Ingrese las horas que trabajo: ");
            pichula = leer.nextInt();
            return arreglo[0]*pichula;
      }
      
}