/*
Elaborar un programa que convierta un número decimal
a binario, octal y hexadecimal. Utilizando métodos y variables
locales.
*/
import java.util.Scanner;
public class Programa_8{
      public static void main(String args[]){
            Scanner leer = new Scanner(System.in);
            int num;
            System.out.println("Ingrese el numero que quiere convertir: ");
            num = leer.nextInt();
            System.out.println("En binario es: "+binario(num));
            System.out.println("En octal es: "+octal(num));
            System.out.println("En hexadecimal es: "+hexa(num));         
      }
      static String binario(int num){
            String bin = "";
            String bina = "";
            do{
                  if (num % 2 == 0){
                        bin = bin + "0";
                  }else if (num % 2 != 0){
                        bin = bin + "1";
                  }
                  num = num / 2;
            }while(num != 0);
            for (int x=bin.length()-1;x>=0;x--)
		            bina = bina + bin.charAt(x);
            return bina;
      }       
      static String hexa(int num){
            String hex = "", he = "", h = "";
            int divi, resul;
             
            do{   
                  divi=num/16;
                  resul = num - (divi*16);
                  if (resul <= 9){                  
                        if(resul == 0 ){
                              hex = hex + "0";
                        }else if (resul == 1){
                              hex = hex + "1";
                        }else if (resul == 2){
                              hex = hex + "2";
                        }else if (resul == 3){
                              hex = hex + "3";
                        }else if (resul == 4){
                              hex = hex + "4";
                        }else if (resul == 5){
                              hex = hex + "5";
                        }else if (resul == 6){
                              hex = hex + "6";
                        }else if (resul == 7){
                              hex = hex + "7";
                        }else if (resul == 8){
                              hex = hex + "8";
                        }else if (resul == 9){
                              hex = hex + "9";
                        }
                  }else if(resul > 9){
                        if(resul == 10){
                              hex = hex + "A";
                        }else if(resul == 11){
                              hex = hex + "B";
                        }else if(resul == 12){
                              hex = hex + "C";
                        }else if(resul == 13){
                              hex = hex + "D";
                        }else if(resul == 14){
                              hex = hex + "E";
                        }else if(resul == 15){
                              hex = hex + "F";
                        }
                  }
                  num = divi;
                  if (num < 16){
                        if (num == 1){
                              h = "1";
                        }else if (num == 2){
                              h = "2";
                        }else if (num == 3){
                              h = "3";
                        }else if (num == 4){
                              h = "4";
                        }else if (num == 5){
                              h = "5";
                        }else if (num == 6){
                              h = "6";
                        }else if (num == 7){
                              h = "7";
                        }else if (num == 8){
                              h = "8";
                        }else if (num == 9){
                              h = "9";
                        }else if(num == 10){
                              h = "A";
                        }else if(num == 11){
                              h = "B";
                        }else if(num == 12){
                              h = "C";
                        }else if(num == 13){
                              h = "D";
                        }else if(num == 14){
                              h = "E";
                        }else if(num == 15){
                              h = "F";
                        }
                  }
            }while(num > 16);
            for (int x=hex.length()-1;x>=0;x--){
		            he = he + hex.charAt(x);
            }
            
            h = h + he;
            return h;
      }
      static String octal(int num){
            String oc = "",reS="", r="";
            int res;
            
            do{
                  res = num % 8;
                  if(res == 0){
                        reS = reS + "0";
                  }else if(res == 1){
                        reS = reS + "1";
                  }else if(res == 2){
                        reS = reS + "2";
                  }else if(res == 3){
                        reS = reS + "3";
                  }else if(res == 4){
                        reS = reS + "4";
                  }else if(res == 5){
                        reS = reS + "5";
                  }else if(res == 6){
                        reS = reS + "6";
                  }else if(res == 7){
                        reS = reS + "7";
                  }else if(res == 8){
                        reS = reS + "10";
                  }else if(res == 9){
                        reS = reS + "11";
                  }else if(res == 10){
                        reS = reS + "12";
                  }else if(res == 11){
                        reS = reS + "13";
                  }else if(res == 12){
                        reS = reS + "14";
                  }else if(res == 13){
                        reS = reS + "15";
                  }else if(res == 14){
                        reS = reS + "16";
                  }else if(res == 15){
                        reS = reS + "17";
                  }
                  
                        num = num/8;
                        
                  if (num <= 8){
                        if(num == 1){
                              r = "1";
                        }else if (num == 2){
                              r = "2";
                        }else if (num == 3){
                              r = "3";
                        }else if(num == 4){
                              r = "4";
                        }else if (num == 5){
                              r = "5";
                        }else if (num == 6){
                              r = "6";
                        }else if (num == 7){
                              r = "7";
                        }else if (num == 8){
                              r = "10";
                        }else if (num == 9){
                              r = "11";
                        }else if (num == 10){
                              r = "12";
                        }else if (num == 11){
                              r = "13";
                        }else if (num == 12){
                              r = "14";
                        }else if (num == 13){
                              r = "15";
                        }else if (num == 14){
                              r = "16";
                        }else if (num == 15){
                              r = "17";
                        }
                  }
            }while(num > 8);
            
              for (int x=reS.length()-1;x>=0;x--){
		            oc = oc + reS.charAt(x);
            }
            r = r + oc;
            return r;
            
      }
}