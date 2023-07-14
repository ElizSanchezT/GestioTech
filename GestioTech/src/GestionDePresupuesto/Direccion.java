package GestionDePresupuesto;

import java.util.List;

public class Direccion extends Departamento {

    public Direccion(List<Empleado> empleadosDpto) {
        super(empleadosDpto);
    }

    public double fondoPresupuestal() {
        return 20000;
    }
    public String nombreDepartamento() {
        return "Direccion";
    }
}
