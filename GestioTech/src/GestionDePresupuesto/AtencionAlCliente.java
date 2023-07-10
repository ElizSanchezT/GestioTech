package GestionDePresupuesto;

import java.util.List;

public class AtencionAlCliente extends Departamento {

    public AtencionAlCliente(List<Empleado> empleadosDpto, double fondoPresupuestal, List<String> gastosFijos) {
        super(empleadosDpto, fondoPresupuestal, gastosFijos);
        fondoPresupuestal = 6500;
    }

    public String nombreDepartamento() {
        return "Atencion Al Cliente";
    }
}
