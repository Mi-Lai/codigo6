import java.util.Scanner;
public class codigo6 {

public static void main (String[] args) {
	    int[] n = new int[20];

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(Opción 1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(scanner.nextLine());
	    
	    int multiplo ;
	    
	    
	    if(opcion == 1) {
            multiplo = 5;
        } else if (opcion == 2) {
            multiplo = 7;
        } else {
            System.out.println("Opción no válida.");
            return;  // Terminar el programa si la opción no es válida
        }
	    
	    
	    
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }
	       else {
	        System.out.print(e + " ");
	      }
	    }
	  
	}
}
