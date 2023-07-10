package GestionDePresupuesto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class PlanillaDeEmpleados {
    private List<Empleado> empleados;

    //Creo un objeto de planilla de objetos vacío para evitar NullPointerExceptions
    public PlanillaDeEmpleados() {
        empleados = new ArrayList<>();
    }

    public void cargarListaEmpleados(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datosDeEmpleado = linea.split(",");

                String nombreEmpleado = datosDeEmpleado[0];
                String dptoEmpleado = datosDeEmpleado[1];
                String posicionEmpleado = datosDeEmpleado[2];
                int sueldoEmpleado = Integer.parseInt(datosDeEmpleado[3]);

                Empleado empleado = new Empleado(nombreEmpleado,dptoEmpleado,posicionEmpleado,sueldoEmpleado);
                empleados.add(empleado);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "PlanillaDeEmpleados{" +
                "empleados=" + empleados +
                '}';
    }
}
