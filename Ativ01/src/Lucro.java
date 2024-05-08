import java.util.Scanner;

import Gastos.calcularMediaGeral;
import Gastos.calcularMediaPorCliente;

public class Lucro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calcularMediaPorCliente mediaPorCliente = new calcularMediaPorCliente(); 
        int nClientes;

            System.out.print("Informe o número de clientes: ");
            nClientes = scanner.nextInt();

            double totalGastos = 0;

            for (int i = 1; i <= nClientes; i++) {
                System.out.println("\nCliente " + i);
                System.out.print("Informe o gasto com bebidas do " + i + "° cliente: R$ ");
                double gastoBebidas = scanner.nextDouble();

                System.out.print("Informe o gasto com comidas do " + i + "° cliente: R$ ");
                double gastoComidas = scanner.nextDouble();

                double total = gastoBebidas + gastoComidas;
                totalGastos += total;
                mediaPorCliente.setMediaCliente(gastoBebidas, gastoComidas);

                System.out.println("Gasto total de bebidas e comidas do " + i + "° cliente: R$ " + total);
                System.out.println("Média dos itens por cliente: R$ " + mediaPorCliente.getMediaCliente());
            }

            calcularMediaGeral media = new calcularMediaGeral();
            media.setMediaGeral(totalGastos, nClientes);

            scanner.close();
        }
    }
