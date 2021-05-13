//Alvaro Kevin Jiménez Quintero
package hilos;
public class Hilos2 implements Runnable { //Hacemos una clase que sea del hilo
// Declaramos las propiedades del hilo
  String name; 
  Thread t;
  double met, suma = 0, cuad = 0, sum = 0;
  double media = 0;
  double vec[ ] = new double[10];
  Hilos2(String threadname, int m, double v[ ]) {
	  name = threadname;
	  met = m;
	  vec = v;
	  t = new Thread(this, name);
	  System.out.println("Nuevo hilo: " + t);
	  t.start(); 
  }
 //Punto de entrada
  public void run() {
    try {
    	if(met==1) {
    		for(int i = 0; i<vec.length; i++) {
    			suma+=vec[i];
    		}
    	}
    	
    	if(met==2) {
    		for(int i = 0; i<vec.length; i++) {
    			cuad+=vec[i]*vec[i];
    		}
    	}
    	
    	if(met==3) {
    		for(int i = 0; i<vec.length; i++) {
    			sum+=vec[i];
    		}
    		 media = sum/vec.length;
    	}
    	if(met==1)
        System.out.println("Suma del vector:" + suma);
    	if(met==2)
            System.out.println("Suma de los cuadrados del vector:" + cuad);
    	if(met==3)
            System.out.println("Media del vector:" + media);
        Thread.sleep(1000);
      
    }
    catch (InterruptedException e) {
      System.out.println(name + "Interrupcion del hilo hijo" +name);
    }
    System.out.println("Viene del hilo hijo " + name);
  }
}