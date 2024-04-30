package net.farmatodo.clientela;

import net.farmatodo.inventario.GeneradorAleatorio;

public class Cliente {
    
    private String nombre;
    private String dni;
    private String cuentaBancaria;

    public Cliente (String nombre, String dni, String cuentaBancaria) {
        this.nombre = GeneradorAleatorio.obtenerNombreAleatorio();
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }

    

}
