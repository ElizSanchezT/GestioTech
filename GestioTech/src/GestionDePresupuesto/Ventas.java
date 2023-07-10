package GestionDePresupuesto;

import java.util.List;

public class Ventas extends Departamento {
    public Ventas(List<Empleado> empleadosDpto, double fondoPresupuestal, List<String> gastosFijos) {
        super(empleadosDpto, fondoPresupuestal, gastosFijos);
    }

    //this.fondoPresupuestal = 18000;
    public String nombreDepartamento() {
        return "Ventas";
    }
}
