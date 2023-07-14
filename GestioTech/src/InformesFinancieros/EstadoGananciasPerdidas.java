package InformesFinancieros;

import Transacciones.Ingreso;
import Transacciones.Salida;
import Transacciones.Transaccion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstadoGananciasPerdidas {

    private Map<String, Double> ingresos;
    private Map<String, Double> gastos;

    public EstadoGananciasPerdidas() {
        ingresos = new HashMap<>();
        gastos = new HashMap<>();
    }

    public void agregarIngreso(String concepto, double monto) {
        ingresos.put(concepto, monto);
    }

    public void agregarGasto(String concepto, double monto) {
        gastos.put(concepto, monto);
    }

    public void agregarDesdeTransacciones(List<Transaccion> transacciones){
        for(Transaccion transaccion : transacciones) {
            if (transaccion instanceof Ingreso) {
                agregarIngreso(transaccion.getDescripcion(), transaccion.getMonto());
            } else if (transaccion instanceof Salida) {
                agregarGasto(transaccion.getDescripcion(), transaccion.getMonto());
            }
        }
    }

    public void mostrarEstadoGananciasPerdidas() {
        System.out.println("=== ESTADO DE GANANCIAS Y PÉRDIDAS ===");
        System.out.println("Ingresos:");
        for (Map.Entry<String, Double> entry : ingresos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------");
        double totalIngresos = calcularTotal(ingresos);
        System.out.println("Total Ingresos: " + totalIngresos);

        System.out.println();

        System.out.println("Gastos:");
        for (Map.Entry<String, Double> entry : gastos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------");
        double totalGastos = calcularTotal(gastos);
        System.out.println("Total Gastos: " + totalGastos);

        System.out.println();

        double resultado = totalIngresos - totalGastos;
        System.out.println("Resultado: " + resultado);
        System.out.println("=== FIN DEL ESTADO ===");
    }

    private double calcularTotal(Map<String, Double> map) {
        double total = 0.0;
        for (Double value : map.values()) {
            total += value;
        }
        return total;
    }

    public void inicializar(){
        agregarIngreso("Ventas", 50000.0);
        agregarIngreso("Intereses", 1000.0);

        agregarGasto("Sueldos", 20000.0);
        agregarGasto("Alquiler", 5000.0);
        agregarGasto("Publicidad", 3000.0);

        mostrarEstadoGananciasPerdidas();
    }
}
