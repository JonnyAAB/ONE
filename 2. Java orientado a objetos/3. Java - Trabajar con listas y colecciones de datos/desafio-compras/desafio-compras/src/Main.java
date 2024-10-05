import com.jonnypro.desafiocompras.modelos.Compra;
import com.jonnypro.desafiocompras.modelos.TarjetaDeCredito;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        System.out.print("Ingresa el limite de la tarjeta: $");
        double limite = miEscaner.nextDouble();
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(limite);

        int salir = 1;
        miEscaner.nextLine();  // Esto limpia el buffer después de ingresar el límite.
        while(salir != 0){
            System.out.print("Descripción del articulo: ");
            String descripcion = miEscaner.nextLine();

            System.out.print("Precio: $");
            double precio = Double.valueOf(miEscaner.nextLine());

            Compra compra = new Compra(descripcion, precio);

            if(tarjetaDeCredito.hacerCompra(compra)){
                System.out.println("Compra realizada con exito.");
                System.out.println("Presiona 1 para continuar o 0 para salir.");
                salir = miEscaner.nextInt();
                miEscaner.nextLine();  // Esto limpia el buffer después de ingresar el número.
            } else{
                System.out.println("Saldo insuficiente. Terminando la sesión.");
                salir = 0;
            }
        }
        Collections.sort(tarjetaDeCredito.getListaDeCompras());
        System.out.println("*************************************");
        System.out.println("\t\tTICKET DE COMPRAS\n");
        for(Compra compra:tarjetaDeCredito.getListaDeCompras()){
            System.out.println(compra.getDescripcion() + " - $" + compra.getValorDeCompra() + " pesos.");
        }
        System.out.println("\n*************************************\n");
        miEscaner.close();
    }
}