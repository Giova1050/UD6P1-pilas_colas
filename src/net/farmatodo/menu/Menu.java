package net.farmatodo.menu;

public class Menu {
    public static void mostrarMenu() {
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
