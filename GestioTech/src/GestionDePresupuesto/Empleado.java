package GestionDePresupuesto;

import java.util.*;
public class Empleado {
    private String nombreEmpleado;
    private String dptoEmpleado;
    private String posicionEmpleado;
    private double sueldoEmpleado;

    public Empleado(String nombreEmpleado, String dptoEmpleado, String posicionEmpleado, double sueldoEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.dptoEmpleado = dptoEmpleado;
        this.posicionEmpleado = posicionEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getDptoEmpleado() {
        return dptoEmpleado;
    }

    public String getPosicionEmpleado() {
        return posicionEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

}
