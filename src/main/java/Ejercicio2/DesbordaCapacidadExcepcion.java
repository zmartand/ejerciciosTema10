package Ejercicio2;

public class DesbordaCapacidadExcepcion extends Exception {
        public DesbordaCapacidadExcepcion(String mensaje) {
            super("El resultado desborda la capacidad de esta calculadora");
        }
    }

