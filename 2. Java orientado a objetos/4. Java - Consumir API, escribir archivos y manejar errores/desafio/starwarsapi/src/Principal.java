import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el numero de la pelicula de Star Wars que quiere consultar: ");
        ConsultaPelicula consulta = new ConsultaPelicula();

        try{
            var numeroDePelicula = Integer.valueOf(scanner.nextLine());
            Pelicula pelicula = consulta.buscaPelicua(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivos generador = new GeneradorDeArchivos();
            generador.guardarJson(pelicula);
        } catch (NumberFormatException e){
            System.out.println("Número no encontrado. " + e.getMessage());
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }
    }
}
