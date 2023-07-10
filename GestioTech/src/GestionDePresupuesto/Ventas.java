package GestionDePresupuesto;

import java.util.List;

public class Ventas extends Departamento {
    public Ventas(List<Empleado> empleadosDpto) {
        super(empleadosDpto);
    }

    public double fondoPresupuestal() {
        return 18000;
    }
    public String nombreDepartamento() {
        return "Ventas";
    }
}
