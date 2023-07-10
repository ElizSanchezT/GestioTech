package GestionDePresupuesto;
import java.util.ArrayList;
import java.util.List;
public abstract class Departamento {
    protected List<Empleado> empleadosDpto;
    protected double fondoPresupuestal;
    protected List<String> gastosFijos;

    public Departamento(List<Empleado> empleadosDpto, double fondoPresupuestal, List<String> gastosFijos) {
        this.empleadosDpto = empleadosDpto;
        this.fondoPresupuestal = fondoPresupuestal;
        this.gastosFijos = gastosFijos;
    }

    public abstract String nombreDepartamento(); //En cada clase hija se específica el nombre del dpto para comparar
    public void listaDeEmpleadosxDpto(PlanillaDeEmpleados planilla) {
        //Método que compara los departamentos a partir de la planilla de trabajadores y si son del dpto correspondiente
        //los agrega a la lista de trabajadores de un departamento en específico

        //System.out.println(this.nombreDepartamento());
        empleadosDpto = new ArrayList<>();
        String nombreDepartamento = this.nombreDepartamento();
        //planilla.imprimirPlanilla();
        for (Empleado e : planilla.getPlanilla()) {
            //System.out.println(e.getDptoEmpleado());
            //System.out.println(nombreDepartamento);
            //System.out.println(e.getDptoEmpleado().equals(nombreDepartamento));
            if (e.getDptoEmpleado().equals(nombreDepartamento)) {
                empleadosDpto.add(e);
            }
        }
    }

    public void imprimirPlanillaDpto() {
        for (Empleado e : empleadosDpto) {
            System.out.println("Nombre: " + e.getNombreEmpleado());
            System.out.println("Departamento: " + e.getDptoEmpleado());
            System.out.println("Posición: " + e.getPosicionEmpleado());
            System.out.println("Sueldo: " + e.getSueldoEmpleado());
            System.out.println("----------------------");
        }
    }

}
