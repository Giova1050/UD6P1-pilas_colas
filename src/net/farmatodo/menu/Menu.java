package net.farmatodo.menu;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {

        final Scanner scanner = new Scanner(System.in);
        Boolean caja;
        String abrir;
        String cerrar;

        System.out.println("""
                1. Abrir Caja
                2. Añadir nuevo cliente a la cola
                3. Atender a un cliente
                4. Ver clientes pendientes
                Q. Cerrar supermercado
                """);
        String menu;
        Boolean bucle = true;
        while (bucle) {

            switch (menu) {
                case "1":

                    if (caja = false) {
                        System.out.println("La caja se encuentra cerrada, quieres abrirla?");
                        abrir = scanner.nextLine();
                        if (abrir.equalsIgnoreCase("si")) {
                            caja = true;
                            System.out.println("La caja ha sido abierta");
                        }
                    } else {
                        System.out.println("La caja ya se encuentra abierta");
                    }
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "Q":
                    bucle = false;
                default:
                    break;
            }
        }
    }

}
