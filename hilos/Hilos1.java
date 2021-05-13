//Alvaro Kevin Jiménez Quintero
package hilos;
public class Hilos1{
  public static void main(String args[]) 
  {
	double arr[] = new double[10];
	for(int i = 0; i < arr.length; i++) {
		arr[i] =  (int) (Math.random()*10 + 1) ;
	}
	
	
    new Hilos2("Uno", 1, arr); // comienzan los hilos
    new Hilos2("Dos", 2, arr);
    new Hilos2("Tres", 3, arr);
    try {
      // espera un tiempo para que terminen los otros hilos
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Interrupcion del hilo principal");
    }
    System.out.println("Sale del hilo principal.");
  }
}