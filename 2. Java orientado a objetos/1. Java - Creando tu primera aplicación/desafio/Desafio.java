package desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Datos de los clientes
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        // Estructura para el Scanner
        Scanner teclado = new Scanner(System.in);

        // Menu para el usuario
        System.out.println("-------------------------------------");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponble es: $" + saldo + " MXN");
        System.out.println("\n-------------------------------------\n");

        while(opcion != 9){
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1.- Consultar saldo");
            System.out.println("2.- Retirar");
            System.out.println("3.- Depositar");
            System.out.println("9.- Salir");
            System.out.print("\nIngresa: ");
            opcion = teclado.nextInt();
            System.out.println("\n-------------------------------------\n");

            // Revisando los casos
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es de: $" + saldo + "\n");
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad a retirar de $" + saldo + " : ");
                    double cantidadDeRetiro = teclado.nextDouble();
                    if(cantidadDeRetiro > saldo){
                        System.out.println("La cantidad a retirar es superior al saldo disponible. Vuelve a intentarlo.\n");
                        break;
                    } else {
                        saldo -= cantidadDeRetiro;
                        System.out.println("Retiro exitoso. Tu saldo actual es de: $" + saldo + "\n");
                        break;
                    }
                case 3:
                    System.out.print("Ingresa la cantidad a depositar: ");
                    double cantidadDeDeposito = teclado.nextDouble();
                    saldo += cantidadDeDeposito;
                    System.out.println("Deposito exitoso. Tu saldo actual es de: $" + saldo + "\n");
                    break;
                case 9:
                    System.out.println("\n¡Hasta luego!\n");
                    teclado.close();
                    break;
                default:
                    System.out.println("Selecciona una opción valida.\n");
                    break;
            }
        }
    }
}