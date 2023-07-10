package GestionDePresupuesto;

import java.util.List;

public class Ventas extends Departamento {
    public Ventas(List<Empleado> empleadosDpto, double fondoPresupuestal, List<String> gastosFijos) {
        super(empleadosDpto, fondoPresupuestal, gastosFijos);
    }

    public String nombreDepartamento() {
        return "Ventas";
    }
}
