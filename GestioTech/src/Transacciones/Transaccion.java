package Transacciones;

import java.time.LocalDate;

public abstract class Transaccion {
    protected String descripcion;
    protected double monto;
    protected LocalDate fecha;

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public Transaccion(){

    }

    public abstract void ingresarDatos();

    @Override
    public String toString() {
        return  "Descripcion='" + descripcion + '\'' +
                ", Monto=" + monto +
                ", Fecha='" + fecha + "\', ";
    }
}
