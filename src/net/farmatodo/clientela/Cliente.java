package net.farmatodo.clientela;

import java.util.Stack;

import net.farmatodo.inventario.GeneradorAleatorio;

public class Cliente {

    private String nombreCLiente;
    private String dni;
    private String cuentaBancaria;
    private Stack<String> cesta = new Stack<>();

    public Cliente(String nombre, String dni, String cuentaBancaria) {
        this.nombreCLiente = GeneradorAleatorio.obtenerNombreAleatorio();
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
        this.añadirProducto();
    }

    public void añadirProducto() {

        int numeroTotalProductos = (int) (Math.random() * (15 - 1) + 1);

        for (int i = 0; i < numeroTotalProductos; i++) {
            cesta.push(GeneradorAleatorio.obtenerProductoAleatorio());
        }
    }

    public static String llamarMetodoAñadirProducto() {
        return"";
    }

}
