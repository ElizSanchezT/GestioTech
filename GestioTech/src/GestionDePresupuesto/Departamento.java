package GestionDePresupuesto;
import java.util.ArrayList;
import java.util.List;
public abstract class Departamento {
    protected List<Empleado> empleadosDpto;

    public Departamento(List<Empleado> empleadosDpto) {
        this.empleadosDpto = empleadosDpto;
    }

    public abstract String nombreDepartamento(); //En cada clase hija se específica el nombre del dpto para comparar
    public void listaDeEmpleadosxDpto(PlanillaDeEmpleados planilla) {
        //Método que compara los departamentos de cada empleado a partir de la planilla. Si son del dpto correspondiente
        //al que se solicita en menú, los agrega a la lista de trabajadores de un departamento en específico.

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

    public double calcularTotalSueldos() {
        // Método que calcula el total de sueldos
        double totalSueldosenDpto = 0;
        for (Empleado e : empleadosDpto) {
            totalSueldosenDpto = totalSueldosenDpto + e.getSueldoEmpleado();
        }
        //System.out.println(totalSueldosenDpto);
        return totalSueldosenDpto;
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

    public abstract double fondoPresupuestal(); //En cada clase hija se específica el fondo presupuestal por c/dpto
    public double calcularPresupuesto() {
        double presupuestoTotal = 0;
        double gastosFijos = calcularTotalSueldos();
        presupuestoTotal = fondoPresupuestal() - gastosFijos;
        return presupuestoTotal;
    }

    public void imprimirPresupuesto() {
        System.out.println("Fondo presupuestal (S/.):\t" + fondoPresupuestal());
        System.out.println("Gastos fijos (S/.):\t\t" + calcularTotalSueldos() + "\t-");
        System.out.println("-------------------------------------------------");
        System.out.println("Presupuesto total (S/.)\t\t" + calcularPresupuesto());
    }
}
