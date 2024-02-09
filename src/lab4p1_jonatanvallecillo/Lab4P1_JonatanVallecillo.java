package lab4p1_jonatanvallecillo;

import java.util.Scanner;

public class Lab4P1_JonatanVallecillo {

    public static void main(String[] args) {
        Scanner zoro = new Scanner(System.in);
        Scanner zoro1 = new Scanner(System.in);
        
        int menu = 0;
        while (menu == 0){
            System.out.println("****** MENU LAB4 *******\n"
                    + "1.- Punto de rotacion\n"
                    + "2.- Numeritos bonitos\n"
                    + "3.- Sopa de letras\n"
                    + "4.- Salir\n");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = zoro.nextInt();
            
            switch(opcion){
                case 1:
                    String cadena1 = "";
                    String cadena2 = "";
                    
                    System.out.print("\nIngrese la primera cadena: ");
                    cadena1 = zoro1.nextLine();
                    
                    int tamaño = 1;
                    while(tamaño == 1){
                        System.out.print("Ingrese la segunda cadena: ");
                        cadena2 = zoro1.nextLine();
                        
                        if(cadena2.length() != cadena1.length()){
                            System.out.println("\nLa segunda cadena debe tener nada mas y nada menos que "+cadena1.length()+" caracteres.\n");
                        }else{
                            tamaño = 0;
                        }
                    }
                    
                    String nuevacad1 = "";
                    String nuevacad2 = "";
                    String cadenarotada = "";
                    char letrarot1 = ' ';
                    char letrarot2 = ' ';
                    char char_cad1 = ' ';
                    
                    for(int i = 0; i < cadena1.length(); i++){
                        if(i < cadena1.length()/2){
                            letrarot1 = cadena1.charAt(0);
                            char_cad1 = cadena1.charAt(0);
                            nuevacad1 += cadena1.charAt(i);
                        }else{
                            nuevacad2 += cadena1.charAt(i);
                        }
                    }
                    
                    cadenarotada = nuevacad2 + nuevacad1;
                    String cadenarotada2 = "";
                    String nuevacad3 = "";
                    String nuevacad4 = "";
                    char letrarotada2 = ' ';
                    
                    
                    for(int i = 0; i < cadena1.length(); i++){
                        if(i < cadena1.length()/2){
                            letrarot2 = cadena2.charAt(0);
                            char_cad1 = cadena2.charAt(0);
                            nuevacad3 += cadena2.charAt(i);
                        }else{
                            nuevacad4 += cadena2.charAt(i);
                        }
                    }
                    
                    if(letrarot2 == cadena1.charAt(cadena2.length()/2) && letrarot1 == cadena2.charAt(cadena1.length())){
                        System.out.println("El punto de rotacion en la cadena '"+cadena1+"' esta ubicado en la letra #");
                    }
                    
                    cadenarotada2 = nuevacad4 + nuevacad3;
                    
                    System.out.println(cadenarotada2);
                    System.out.println(cadenarotada);
                    
                    break;

                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    menu = 1;
                    break;
            }
        }
        
    }
}
