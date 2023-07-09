package Entidades;

public class Transaccion {
    private TipoTransaccion Tipo;
    private String Descripcion;
    private double Monto;
    //TODO Usar una clase de fecha
    private String Fecha;

    public Transaccion(TipoTransaccion tipo, String descripcion, double monto, String fecha) {
        Tipo = tipo;
        Descripcion = descripcion;
        Monto = monto;
        Fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "Tipo=" + Tipo +
                ", Descripcion='" + Descripcion + '\'' +
                ", Monto=" + Monto +
                ", Fecha='" + Fecha + '\'' +
                '}';
    }
}
