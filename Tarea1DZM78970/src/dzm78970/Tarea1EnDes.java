package dzm78970;

import java.time.LocalDateTime;
import java.util.*;

public class Tarea1EnDes {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Ingrese una opción");
            System.out.println("0 para salir y finalizar el programa");
            System.out.println("1 para introducir 2 números enteros y mostrar cuál es el mayor");
            System.out.println("2 para introducir una cadena de caracteres y comprobar si un caracter está dentro");
            System.out.println("3 para generar aleatoriamente el valor de una de las 5 vocales");
            System.out.println("4 para mostrar la fecha y hora actual");
            
            choice=sc.nextInt();
            
        switch (choice) {
            case 0:
                System.out.println("El programa ha terminado.");
                break;
            case 1:               
                System.out.println("Ingrese el primer número: ");
                int n1=sc.nextInt();
                System.out.println("Ingrese el segundo número: ");
                int n2=sc.nextInt();
                if (n1>n2) {
                    System.out.println(n1+" es mayor que "+n2);
                } else if (n2>n1) {
                    System.out.println(n2+" es mayor que "+n1);
                } else {
                    System.out.println("Los dos números son iguales.");
                }
               break;
            case 2:   
                String cadena;
                do {
                    System.out.println("Introduzca una cadena de caracteres: ");
                    cadena=new String(sc.next());
                } while (cadena.length()<=1);                
                System.out.println("Introduzca un caracter: ");
                char caracter=sc.next().charAt(0);
                boolean existe=false;
                for (int i=0; i<cadena.length(); i++) {
                    if (cadena.charAt(i)==caracter) {
                        existe=true;                        
                    }                    
                }
                if (existe) {
                        System.out.println("El caracter "+caracter+" está dentro de la cadena.");
                    } else {
                        System.out.println("El caracter "+caracter+" NO está dentro de la cadena.");
                    }
                break;
            case 3:           
                Random random = new Random();
                char letra;
                char[] vocales = {'a','e', 'i', 'o', 'u'};             
                do {
                    letra = (char) (random.nextInt(26) + 'a');
                } while (Arrays.binarySearch(vocales, letra) < 0);                
                System.out.println("Vocal generada: " + letra);
                break;
            case 4:            
                LocalDateTime myObj = LocalDateTime.now();
                System.out.println("Fecha y hora actual:");
                System.out.println(myObj);
                break;
            default:
                System.out.println("No ha introducido una opción válida.");                
        }
        
        } while (choice!=0);
        sc.close();

	}

}
