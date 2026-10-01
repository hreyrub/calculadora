
import java.util.Scanner;

public class calculadora{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de San Viator, elige una opcion del 1 al 4");
        int numero = teclado.nextInt();
        if (numero==1){
            sumar();
        }
        else if (numero==2){
            restar();
        }
        else if (numero==3){
            multiplicar();
        }
        else if (numero==4){
            dividir();
        }
    }
    public static void sumar(){
        System.out.println("Opcion SUMAR");
    }
    public static void restar(){
        System.out.println("Opcion RESTAR");
    }
    public static void multiplicar(){
        System.out.println("Opcion MULTIPLICAR");
    }
    public static void dividir(){
        System.out.println("Opcion DIVIDIR");
    }
}