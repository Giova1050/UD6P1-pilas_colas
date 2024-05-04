package net.farmatodo.inventario;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneradorAleatorio {

    private static final String[] LISTA_PRODUCTOS = {
            "Tomate", "Huevo", "Leche", "Agua", "Sal", "Carne", "Pollo", "Azucar", "Arroz", "Bacon", "Manzana",
            "Peras"};

    private static final ArrayList<String> LISTA_NOMBRES = new ArrayList<>(Arrays.asList(
            "Sofía", "Santiago", "Valentina", "Martín", "Isabella", "Juan", "Camila", "Alejandro", "Lucía", "Diego",
            "Valeria", "Mateo", "Natalia", "Andrés", "Emma", "Nicolás", "Victoria", "Daniel", "Gabriela"));

    public static String obtenerProductoAleatorio() {

        int productoAleatorio = (int) (Math.random() * (12 - 0) + 0);

        return LISTA_PRODUCTOS[productoAleatorio];
    }

    public static String obtenerNombreAleatorio() {

        int nombreAleatorio = (int) (Math.random() * (20 - 0) + 0);

        return LISTA_NOMBRES.get(nombreAleatorio);
    }

}
