package GestionDePresupuesto;

import java.util.*;

public class Finanzas extends Departamento {

    public Finanzas(List<Empleado> empleadosDpto) {
        super(empleadosDpto);
    }

    public String nombreDepartamento() {
        return "Finanzas";
    }

    public double fondoPresupuestal() {
        return 8000;
    }
}
