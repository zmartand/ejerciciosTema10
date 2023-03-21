package Ejercicio2;


public class Operacion {
    public int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultadoLargo = (long) a + (long) b;
        if (resultadoLargo < Integer.MIN_VALUE || resultadoLargo > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
        }
        return (int) resultadoLargo;
    }
    public int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultadoLargo = (long) a - (long) b;
        if (resultadoLargo < Integer.MIN_VALUE || resultadoLargo > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
        }
        return (int) resultadoLargo;
    }
    public int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultadoLargo = (long) a * (long) b;
        if (resultadoLargo < Integer.MIN_VALUE || resultadoLargo > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
        }
        return (int) resultadoLargo;
    }


}
