import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 4){
            System.out.println("\n Seleccione una opcion:");
            System.out.println(" 1. Generar arreglos aleatorios con diferentes tamaños");
            System.out.println(" 2. Ordenar por los 4 metodos");
            System.out.println(" 3. Buscar Valores busqueda binaria normal bsuqueda binaria recursiva");
            System.out.println(" 4. Salir");
            opcion = sc.nextInt();
        }
    }
}
