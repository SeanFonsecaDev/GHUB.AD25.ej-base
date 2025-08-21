package miPrincipal;
import java.util.Scanner;
public class Principal {
public static Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {   
    int opc=0;
    do{
        menu();
        opc = entrada.nextInt();
    } 
    while (opc !=0);
   
}
public static void menu(){
    System.out.println("Menu");
    System.out.println("1 agregar");
    System.out.println("2 buscar autor");
    System.out.println("3 mostrar");
    System.out.println("");
    System.out.println("0 salir");
    System.out.print("seleccione una opcion");
}
}