package GestionDePresupuesto;

import java.util.List;

public class Direccion extends Departamento {

    public Direccion(List<Empleado> empleadosDpto) {
        super(empleadosDpto);
    }

    //fondoPresupuestal = 20000;

    public double fondoPresupuestal() {
        return 20000;
    }
    public String nombreDepartamento() {
        return "Direccion";
    }
}
