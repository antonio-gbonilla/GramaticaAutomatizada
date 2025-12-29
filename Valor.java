/**
 * Representa un valor genérico utilizado por el intérprete del lenguaje PLATA.
 *
 * <p>
 * Esta clase actúa como un contenedor dinámico que puede almacenar distintos
 * tipos de datos (como {@code Double}, {@code Boolean}, {@code String}, etc.).
 * El objetivo es permitir que todas las expresiones del visitor devuelvan el
 * mismo tipo de objeto, facilitando la evaluación homogénea del programa.
 * </p>
 *
 * <p>
 * La clase proporciona métodos de conversión como {@link #asDouble()},
 * {@link #asBoolean()} y {@link #asString()}, que permiten recuperar el valor
 * interno en el tipo esperado. Si se intenta convertir a un tipo incompatible,
 * se lanzará una {@link ClassCastException}.
 * </p>
 *
 * <p>
 * También incluye un valor especial {@link #VOID} utilizado para representar
 * expresiones o sentencias que no devuelven un valor significativo (similar al
 * tipo {@code void} en Java).
 * </p>
 */

public class Valor {

    // Creas un objeto de tipo valor que contenga un objeto Vacio
    public static Valor VACIO = new Valor(new Object());

    // El valor interno real (puede ser Double, Boolean, String, etc.)
    final Object valor;

    // Constructor: recibe el valor real que será envuelto.
    public Valor(Object valor) {
        this.valor = valor;
    }

    // Convierte el valor interno a boolean.
    public Boolean asBoolean() {
        if (!isBoolean()) {
            throw new PLATAException("No se puede usar " + valor + " como booleano");
        }
        return (Boolean) valor;
    }

    // Convierte el valor interno a double.
    public Double asDouble() {
        return (Double) valor;
    }

    // Convierte cualquier valor interno a String.
    public String asString() {
        return String.valueOf(valor);
    }

    // Comprueba si el valor interno es un número.
    public boolean isDouble() {
        return valor instanceof Double;
    }

    // Comprueba si el valor interno es un String.
    public boolean isString() {
        return valor instanceof String;
    }

    // Comprueba si el valor interno es un Boolean.
    public boolean isBoolean() {
        return valor instanceof Boolean;
    }

    @Override
    public int hashCode() {
        if (valor == null) {
            return 0;
        }
        return this.valor.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        // Si comparo la referencia del valor, true
        if (valor == o) {// comprueba la referencia
            return true;
        }

        // Si el valor interno o el objeto comparado es null, o el tipo no coincide, no
        // son iguales
        if (valor == null || o == null || o.getClass() != this.getClass()) {// comprueba el tipo de objeto
            return false;
        }

        // Comparo el valor interno
        Valor that = (Valor) o;

        return this.valor.equals(that.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
