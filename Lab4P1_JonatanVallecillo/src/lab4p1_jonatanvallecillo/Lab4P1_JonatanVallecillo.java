
package lab4p1_jonatanvallecillo;

import java.util.Scanner;

public class Lab4P1_JonatanVallecillo {
        
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner Scanner = new Scanner(System.in);
        System.out.println("1.- Inversion especial");
        System.out.println("2.- Balanza de cadenas");
        System.out.println("3.- Cifado de mensajes");
        System.out.print("Ingrese la opcion que desea: ");
        int opcion = leer.nextInt(); 
        System.out.println();
        
        while (opcion > 0 && opcion < 4){
            switch (opcion){
                case 1:
                    System.out.println("Ingrese una palabra o frase de al menos de 5 caracteres");
                    String cad = Scanner.nextLine();
                    char caracter = 0;
                    String cad2 = "";  
                    String cad3 = "";
                    String cad4 = "";
                    String cad5 = "";
                    if (cad.length() >= 5){
                        for(int i = cad.length()-1;i >= 0 ;i--){                            
                            caracter = (char)cad.charAt(i);
                            if (caracter == ' '){
                                cad3 = cad2;
                                cad2 = "";
                            }else{
                                cad2 += caracter;
                                cad5 = cad2;
                            }
                            cad4 = cad5 +" "+ cad3;
                        }
                    }
                    System.out.println("Cadena invertida: "+cad4);
                    System.out.println();
                    break;

                    
                case 2: 
                    System.out.println("Ingrese la cadena 1: ");
                    String caden1 = Scanner.nextLine();
                    System.out.println("Ingrese la cadena 2: ");
                    String caden2 = Scanner.nextLine();
                    System.out.println("Ingrese la cadena 3: ");
                    String caden3 = Scanner.nextLine();
                    int contador = 0;
                    int contador2 = 0;
                    
                    for (int m = 0; m < caden1.length(); m++){
                        contador = caden1.charAt(m);
                        contador2 += contador;                    
                    }
                    System.out.println("Peso cadena 1: "+contador2);
                    int a = contador2;
                    
                    contador = 0;
                    contador2 = 0;
                    for (int m = 0; m < caden2.length(); m++){
                        contador = caden2.charAt(m);
                        contador2 += contador;                    
                    }
                    System.out.println("Peso cadena 2: "+contador2);
                    int b = contador2;
                    
                    contador = 0;
                    contador2 = 0;                    
                    for (int m = 0; m < caden3.length(); m++){
                        contador = caden3.charAt(m);
                        contador2 += contador;                    
                    }
                    System.out.println("Peso cadena 3: "+contador2);  
                    int c = contador2;
                    
                    if (a > b && a > c){
                        System.out.print("La cadena 1 es mas pesada");
                    }else if (b > a && b> c){
                        System.out.println("La cadena 2 es mas pesada");
                    }else{
                        System.out.println("La cadena 3 es mas pesada");
                    }
                    System.out.println();
                    break;
                    
                case 3: 
                    System.out.println("Ingrese el mensaje que desea cifrar: ");
                    String mensaje = Scanner.nextLine();
                    contador = 0;
                    char cont2;
                    String cifrado = "";
                    for(int n = 0; n<mensaje.length(); n++){
                        contador = mensaje.charAt(n) + 2;
                        cont2 = (char)(contador);
                        cifrado += cont2;                        
                    }    
                    System.out.println("Mensaje cifrado: "+cifrado);
                    System.out.println();
                    break;
            }
            System.out.println("1.- Inversion especial");
            System.out.println("2.- Balanza de cadenas");
            System.out.println("3.- Cifado de mensajes");
            System.out.print("Elija otra opcion: ");
            opcion = leer.nextInt();
            System.out.println();
        }
    }
    
}
