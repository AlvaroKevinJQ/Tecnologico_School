import java.util.Scanner;
public class VariMediDesvi {
      static int n=1;
      static double datos[]=new double [pregunta(n)];
      static double mediaR=0, desviR=0;
      public static void main(String args[]){
            almacenamiento();
            System.out.printf ("Media: %.2f\n",media(n));
            System.out.printf ("Desviacion Estandar: %.2f\n",desviacionEstandar());
            System.out.printf ("Varianza: %.2f",varianza());
         
      }
      public static int pregunta (int n){
            Scanner leer= new Scanner (System.in);
            System.out.println ("Ingrese los datos que va a regrresar: ");
            n=leer.nextInt();
            return n;
      }
         
      public static void almacenamiento (){
            Scanner leer=new Scanner(System.in);
            System.out.println ("Ingrese los datos: ");
            for (int i=0; i<=datos.length-1; i++){
                  System.out.printf ("dato %d= ",i+1);
                  datos[i]=leer.nextDouble();
            }
      } 
      
      public static double media(int n){
            double cont=0;
            for(int x=0; x<datos.length; x++){
                  cont=cont+datos[x];
            }
            mediaR=cont/(datos.length);
            return mediaR;
      }
      
      public static double desviacionEstandar(){
            double cont2=0;
            for (int x=0; x<datos.length; x++){
               double resta=0;
               resta=(mediaR-datos[x]);
               cont2=cont2+(resta*resta);
            }
            desviR=Math.sqrt(cont2/(datos.length));
            return desviR;
         
      }
      
      public static double varianza(){
            double varianzaR=0;
            varianzaR=(desviR*desviR);
            return varianzaR;
      } 
   
}