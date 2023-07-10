package GestionDePresupuesto;

import java.util.*;

public class Finanzas extends Departamento {

    public Finanzas(List<Empleado> empleadosDpto, double fondoPresupuestal, List<String> gastosFijos) {
        super(empleadosDpto, fondoPresupuestal, gastosFijos);
    }

    public String nombreDepartamento() {
        return "Finanzas";
    }

    /*@Override
    public void listadeEmpleadosxDpto() {

    }*/

}
