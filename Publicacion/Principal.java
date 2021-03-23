//Alvaro Kevin Jiménez Quintero
//Arreglo: 10
package Publicacion;

import java.util.Scanner;
public class Principal{

    public static void main(String[] args){
    	
        int ctrlpub = 0;
        Scanner leer = new Scanner(System.in);
      
        Object publicaciones [] = new Object[10]; //reservamos espacio
        int opc = 0;
        do{
	        System.out.println("Menu");
	        System.out.println("[1] Dar de alta una publicacion");
	        System.out.println("[2] Consultar publicaciones");
	        System.out.println("[3] Salir");
	        System.out.print("Ingresa la accion a realizar: ");
	        opc = leer.nextInt();
	        
	        switch (opc){
	        case 1:
	        	int sel = 0;
	        	System.out.println();
	        	System.out.println("|||Dar de alta|||");
	        	System.out.println("[1] Revista");
	        	System.out.println("[2] Periodico");
	        	System.out.println("[3] Libro");
	        	System.out.print("selecciona el tipo de publicacion: ");
	        	sel = leer.nextInt();
	        	if(sel == 1) {
	        		System.out.println("||Revista||");
	        		Revista revista = new Revista();
	        		leer.nextLine();
	        		System.out.println("Ingresa el ISSN: ");
	        		revista.setISSN(leer.nextLine());
	        		System.out.println("Ingresa el titulo de la revista: ");
	        		revista.setTitulo(leer.nextLine());
	        		System.out.println("Ingresa el precio de la revista: ");
	        		revista.setPrecio(leer.nextDouble());
	        		System.out.println("Ingresa el número de la revista: ");
	        		revista.setNumero(leer.nextInt());
	        		System.out.println("Ingresa el anio de la revista: ");
	        		revista.setAnio(leer.nextInt());
	        		System.out.println("Ingresa el número de paginas de la revista: ");
	        		revista.setNumpag(leer.nextInt());
	        		publicaciones[ctrlpub] = revista;
	                ctrlpub++;
	        	}
	        	else if(sel == 2) {
	        		System.out.println();
	        		System.out.println("||Periodico||");
	        		leer.nextLine();
	        		Periodico periodico = new Periodico();
	        		System.out.println("Ingresa el titulo del periodico: ");
	        		periodico.setTitulo(leer.nextLine());
	        		System.out.println("Ingresa el precio del periodico: ");
	        		periodico.setPrecio(leer.nextDouble());
	        		System.out.println("Ingresa el número de paginas del periodico: ");
	        		periodico.setNumpag(leer.nextInt());
	        		leer.nextLine();
	        		System.out.println("Ingresa las secciones del periodico: ");
	        		periodico.setSecciones(leer.nextLine());
	        		System.out.println("Ingresa el editor del periodico: ");
	        		periodico.setEditor(leer.nextLine());
	        		publicaciones[ctrlpub] = periodico;
	        		ctrlpub++;
	        	}
	        	else if (sel == 3) {
	        		System.out.println();
	        		System.out.println("||Libro||");
	        		Libro libro = new Libro();
	        		leer.nextLine();
	        		System.out.println("Ingresa el titulo del libro: ");
	        		libro.setTitulo(leer.nextLine());
	        		System.out.println("Ingresa el precio del libro: ");
	        		libro.setPrecio(leer.nextDouble());
	        		System.out.println("Ingresa el número de paginas del libro: ");
	        		libro.setNumpag(leer.nextInt());
	        		System.out.println("Ingresa el ISBN del libro: ");
	        		leer.nextLine();
	        		libro.setISBN(leer.nextLine());
	        		System.out.println("Ingresa la edicion del libro: ");
	        		libro.setEdicion(leer.nextLine());
	        		System.out.println("Ingresa el autor del libro: ");
	        		libro.setAutor(leer.nextLine());
	        		publicaciones[ctrlpub] = libro;
	        		ctrlpub++;
	        		
	        	}
	        	
	    	break;//case 1
	    	
	        case 2:
	        	for(int i = 0; i < ctrlpub; i ++ ){
	                //System.out.println("  " + publicaciones [i].getClass());
	                if(publicaciones[i] instanceof Revista){
		                Revista rev = new Revista();
		                rev = (Revista)publicaciones[i];
		                System.out.println();
		                System.out.println("----REVISTA----");
		                System.out.println("Titulo: " + rev.getTitulo());
		                System.out.println("ISSN: " + rev.getISSN());
	                  
	                }
	                else if (publicaciones [i] instanceof Libro ){
		                Libro lib = new Libro();
		                lib = (Libro)publicaciones[i];
		                System.out.println();
		                System.out.println("---LIBRO---");
		                System.out.println("Titulo: " + lib.getTitulo());
		                System.out.println("ISBN: " + lib.getISBN());
	                }
	                else if(publicaciones[i] instanceof Periodico) {
	                	Periodico per = new Periodico();
	                	per = (Periodico)publicaciones[i];
	                	System.out.println();
	                	System.out.println("----PERIODICO----");
	                	System.out.println("Titulo: " + per.getTitulo());
		                System.out.println("Secciones: " + per.getSecciones());
	                }
	          }
        	break;//case 2
        	
	        case 3:
	        	System.out.println("Saliendo...");
        	break;
        	
        	default:
        		System.out.println("valor fuera de rango...");
    		break;
	        }
        }while(opc != 3);
     }
   }