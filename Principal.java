
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos M = new Metodos();
        int n = 0; // es la dimension de la matriz
        System.out.println("Por favor Ingrese la dimension de la matriz");
        n = sc.nextInt();
        ObjVehiculo[][] m = new ObjVehiculo[n][n];
        m = M.LLenarCeldas(m);
        System.out.println("Ahora vamos a calcular la nueva administracion");
        m = M.CalcularNuevoPago(m);
        M.MostrarInformacionCeldas(m);
    }
}
