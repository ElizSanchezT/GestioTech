package GestionDePresupuesto;

import java.util.List;

public class AtencionAlCliente extends Departamento {

    public AtencionAlCliente(List<Empleado> empleadosDpto) {
        super(empleadosDpto);
    }

    public double fondoPresupuestal() { return 9380; }

    public String nombreDepartamento() {
        return "Atencion Al Cliente";
    }
}
