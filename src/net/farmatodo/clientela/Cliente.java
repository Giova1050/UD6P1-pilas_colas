package net.farmatodo.clientela;

import java.util.Stack;

import net.farmatodo.inventario.GeneradorAleatorio;

public class Cliente {

    private String nombre;
    private String dni;
    private String cuentaBancaria;
    private static Stack<String> cesta = new Stack<>();

    public Cliente(String nombre, String dni, String cuentaBancaria) {
        this.nombre = GeneradorAleatorio.obtenerNombreAleatorio();
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }

    public static void añadirProducto() {

        int numeroTotalProductos = (int) (Math.random() * (15 - 1) + 1);

        for (int i = 0; i < numeroTotalProductos; i++) {
            cesta.push(GeneradorAleatorio.obtenerProductoAleatorio());
        }
    }

    public static String llamarMetodoAñadirProducto() {
        return"";
    }

}
