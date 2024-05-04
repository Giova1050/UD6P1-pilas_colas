package net.hiperdino.personal;

public class Cajero {
    
    private String nombreCajero;
    private int numeroCaja;
    private int horario;

    public Cajero(String nombre, int numeroCaja, int horario) {
        this.nombre = nombre;
        this.numeroCaja = numeroCaja;
        this.horario = horario;
    }

    public static void abrirCaja() {

    }

    public static void añadirClienteCola() {

    }

    public static void atenderCliente() {

    }

    public static void clientesPendientes() {

    }

    public static void cerrarSupermercado() {
        
    }

    @Override
    public String toString() {
        return "Cajero [nombreCajero=" + nombreCajero + ", numeroCaja=" + numeroCaja + "]";
    }
}
