package GestionDePresupuesto;

import java.util.List;

public class Marketing extends Departamento {


    public Marketing(List<Empleado> empleadosDpto) {
        super(empleadosDpto);
    }

    public double fondoPresupuestal() {
        return 4000;
    }
    public String nombreDepartamento() {
        return "Marketing";
    }
}
