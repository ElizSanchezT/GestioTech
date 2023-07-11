package InformesFinancieros;

import java.util.HashMap;
import java.util.Map;

public class BalanceGeneral {

    private Map<String, Double> activos;
    private Map<String, Double> pasivos;
    private Map<String, Double> patrimonio;

    public BalanceGeneral() {
        activos = new HashMap<>();
        pasivos = new HashMap<>();
        patrimonio = new HashMap<>();
    }

    public void agregarActivo(String nombre, double monto) {
        activos.put(nombre, monto);
    }

    public void agregarPasivo(String nombre, double monto) {
        pasivos.put(nombre, monto);
    }

    public void agregarPatrimonio(String nombre, double monto) {
        patrimonio.put(nombre, monto);
    }

    public void mostrarBalanceGeneral() {
        System.out.println("=== BALANCE GENERAL ===");
        System.out.println("Activos:");
        for (Map.Entry<String, Double> entry : activos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------");
        System.out.println("Total Activos: " + calcularTotal(activos));

        System.out.println();

        System.out.println("Pasivos:");
        for (Map.Entry<String, Double> entry : pasivos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------");
        System.out.println("Total Pasivos: " + calcularTotal(pasivos));

        System.out.println();

        System.out.println("Patrimonio:");
        for (Map.Entry<String, Double> entry : patrimonio.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------");
        System.out.println("Total Patrimonio: " + calcularTotal(patrimonio));

        System.out.println();

        double totalActivos = calcularTotal(activos);
        double totalPasivos = calcularTotal(pasivos);
        double totalPatrimonio = calcularTotal(patrimonio);
        System.out.println("Total Pasivos + Patrimonio: " + (totalPasivos + totalPatrimonio));
        System.out.println("=== FIN DEL BALANCE ===");
    }

    private double calcularTotal(Map<String, Double> map) {
        double total = 0.0;
        for (Double value : map.values()) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        BalanceGeneral balance = new BalanceGeneral();
        balance.agregarActivo("Caja", 10000.0);
        balance.agregarActivo("Bancos", 50000.0);
        balance.agregarActivo("Inventario", 25000.0);

        balance.agregarPasivo("Proveedores", 15000.0);
        balance.agregarPasivo("Préstamo bancario", 20000.0);

        balance.agregarPatrimonio("Capital", 50000.0);

        balance.mostrarBalanceGeneral();
    }
}

