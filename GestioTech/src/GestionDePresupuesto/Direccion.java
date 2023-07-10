package GestionDePresupuesto;

import java.util.List;

public class Direccion extends Departamento {

    public Direccion(List<Empleado> empleadosDpto, double fondoPresupuestal, List<String> gastosFijos) {
        super(empleadosDpto, fondoPresupuestal, gastosFijos);
        fondoPresupuestal = 20000;
    }

    //fondoPresupuestal = 20000;
    public String nombreDepartamento() {
        return "Direccion";
    }
}
