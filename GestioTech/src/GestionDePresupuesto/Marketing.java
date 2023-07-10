package GestionDePresupuesto;

import java.util.List;

public class Marketing extends Departamento {


    public Marketing(List<Empleado> empleadosDpto, double fondoPresupuestal, List<String> gastosFijos) {
        super(empleadosDpto, fondoPresupuestal, gastosFijos);
    }

    //this.fondoPresupuestal = 4000;
    public String nombreDepartamento() {
        return "Marketing";
    }
}
