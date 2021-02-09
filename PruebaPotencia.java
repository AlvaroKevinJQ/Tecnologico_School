public class PruebaPotencia{
    public static void main(String args[]){
        /*
        int poten = 3;
        double n = 4, a = n;

        for(int y = 2; y <= poten; y++){
            n = n * a;
        }
        System.out.println("FOR: "+n);

        n = 4; 
        a = n;


        while(poten != 1){
            n = n * a;
            poten--;
        }
        System.out.println("while: "+n); */

        public static double factorial(int iNumero){
            int iFactorial = 1;
            for (int x=2; x <= iNumero; x++)
                    iFactorial = iFactorial * x;
                    System.out.println("El factorial: "+iFactorial);
                    System.out.println("Dentro del factorial: 1 + factorial ="+iFactorial+1);
            return iFactorial;
        }
    }
}