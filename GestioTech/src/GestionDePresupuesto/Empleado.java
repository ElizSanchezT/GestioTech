package GestionDePresupuesto;

public class Empleado {
    private String nombreEmpleado;
    private String dptoEmpleado;
    private String posicionEmpleado;
    private int sueldoEmpleado;

    public Empleado(String nombreEmpleado, String dptoEmpleado, String posicionEmpleado, int sueldoEmpleado) {
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

    public int getSueldoEmpleado() {
        return sueldoEmpleado;
    }


}
