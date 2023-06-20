import conicas2.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        circunferencia_grupo2 figura1 = new circunferencia_grupo2(9, 18);
        Elipse figura2 = new Elipse(9.5, 4.2);
        hiperbole figura3 = new hiperbole(4, 8);
        Parabola_Equipo2 figura4 = new Parabola_Equipo2(13, 16, 23, 5, 15);

        boolean salir = true;
        //Menu Principal
    do {

        System.out.println("---------BIENVENIDO AL MENU PRINCIPAL---------");
        System.out.println("****** Menu de Figuras ******");

        System.out.println("\n 1.- Circunferencia ");
        System.out.println(" 2.- Elipse");
        System.out.println(" 3.- Hiperbole");
        System.out.println(" 4.- Parabola");
        System.out.println(" 5.- Salir del menu");
        System.out.println("Seleccione una opcion del Menu:");
        String op= entrada.next();

        switch (op){

            case ("1")->{
                System.out.println(" Metodo Circunfencia: ");
                figura1.imprimirDatos();
            }

            case ("2")->{
                System.out.println("Metodo Elipse:  ");
                figura2.imprimirElipse();
            }

            case ("3")->{
                System.out.println("Metodo Hiperbole ");
                figura3.variables();
            }

            case ("4")->{
                System.out.println("Metodo Parabola ");
                figura4.Parabola_Equipo2_ImpVer();
            }

            case ("5")->{
                System.out.println(" Gracias por usar el programa :)......");
                salir = false;
            }
            default -> {
                System.out.println("El valor ingresado es incorrecto......");
            }
        }
    }while (salir);
    }
    private static void volverMenu(Scanner scanner){
        System.out.println("Presione para continuar..");
        scanner.nextLine();
        scanner.nextLine();
    }

}


