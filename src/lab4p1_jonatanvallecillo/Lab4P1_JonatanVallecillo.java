package lab4p1_jonatanvallecillo;

import java.util.Random;
import java.util.Scanner;

public class Lab4P1_JonatanVallecillo {

    public static void main(String[] args) {
        Scanner zoro = new Scanner(System.in);
        Scanner zoro1 = new Scanner(System.in);
        Random rand = new Random(0);
        
        int menu = 0;
        while (menu == 0){
            System.out.println("****** MENU LAB4 *******\n"
                    + "1.- Punto de rotacion\n"
                    + "2.- Numeritos bonitos\n"
                    + "3.- Sopa de letras\n"
                    + "4.- Salir");
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
                    int letra = ' ';
                    
                    for(int i = 0; i < cadena1.length(); i++){
                        if(i < cadena1.length()/2){
                            char_cad1 = cadena1.charAt(0);
                            nuevacad1 += cadena1.charAt(i);
                        }else{
                            if(i == cadena1.length()/2){
                                letrarot1 = cadena1.charAt(i);
                                letra = i+1;
                            }
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
                    
                    if(letrarot1 == cadena2.charAt(0)){
                        System.out.println("\nEl punto de rotacion en la cadena '"+cadena1+"' esta ubicado en la letra #"+letra+"\n");
                    }else{
                        System.out.println("\nNo se encontro punto de rotacion en las cadenas '"+cadena1+"' y '"+cadena2+"'\n");
                    }
                    
                    cadenarotada2 = nuevacad4 + nuevacad3;
                    break;

                    
                case 2:
                    int val = 1;
                    int iteraciones = 0;
                    while(val == 1){
                        System.out.print("\nIngrese la cantidad de iteraciones (entre 1 y 6): ");
                        iteraciones = zoro.nextInt();
                        
                        if(iteraciones < 1 || iteraciones > 6){
                            System.out.println("No ingreso un valor valido.");
                            System.out.println("Intente de nuevo");
                        }else{
                            val = 0;
                        }
                    }
                        
                        int numero = 0;
                        
                        for(int i = 0; i < iteraciones; i++){
                            for(int j = 0; j < iteraciones; j++){
                                if(j == 0){
                                    numero = 1;
                                }else if(j == i){
                                    numero = 1;
                                }else if(j == 1){
                                    numero = i - j + 1;
                                }else if(i == j + 1){
                                    numero = j + 1;
                                }//else if( ){
                                    
                                //}
                                else{
                                    numero = 0;
                                }
                                System.out.print(numero);
                            }
                            System.out.println();
                        }
                        System.out.println();
                    break;
                    
                case 3:
                    System.out.println();
                    int numascii = 0;
                    char chara = ' ';
                    String sopdletras = "";
                    String sopdletrasL = "";
                    for(int i = 0; i < 4; i++){
                        for(int j = 0; j < 4; j++){
                            val = 1;
                            while(val == 1){
                                numascii = rand.nextInt(122-65)+65;
                                
                                if(numascii < 91 || numascii > 96){
                                    val = 0;
                                }
                            }
                            chara = (char) numascii;
                            sopdletras += chara+" ";
                        }
                        sopdletras += "\n";
                    }
                    
                    System.out.println(sopdletras);
                    sopdletrasL = sopdletras.toLowerCase();
                    int intentos = 5;
                    
                    while(intentos <= 5 && intentos > 0){
                        System.out.print("Busquedas restantes: "+intentos+", ingrese las letras que desea busar: ");
                        String intento = zoro1.nextLine();
                        intento = intento.toLowerCase();
                        int cont = 0;
                        int fila = 0;
                        
                        for(int i = 0; i < 4; i++){
                            cont = 0;
                            for(int j = 0; j < 4; j++){
                                if(intento.charAt(cont) == sopdletras.charAt(j) && cont < intento.length()){
                                    cont++;
                                    System.out.println(cont);
                                    fila = i;
                                }
                                j += 1;
                            }
                        }
                        if(cont == intento.length()-1){
                            System.out.println("Las letras se encontradan en la fila #"+fila);
                        }
                        intentos --;
                    }
                            
                    break;
                    
                case 4:
                    menu = 1;
                    break;
            }
        }
        
    }
}
