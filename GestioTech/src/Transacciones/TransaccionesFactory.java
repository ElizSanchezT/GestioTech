package Transacciones;

public class TransaccionesFactory {
    public static Transaccion obtenerTransaccion(TipoTransaccion tipo) {
        switch (tipo) {
            case Ingreso:
                return new Ingreso();
            case Salida:
                return new Salida();
            default:
                throw new IllegalArgumentException("Tipo no válido");
        }
    }
}
