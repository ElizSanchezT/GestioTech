package Principal;

import Entidades.TipoTransaccion;
import Entidades.Transaccion;
import Utilitarios.UtilitariosConsola;
import Utilitarios.UtilitariosEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Transaccion> transacciones = new ArrayList<>();
        int opcion;
        int subOpcion;
        do {
            UtilitariosConsola.ImprimirTitulo("GestioTech Solutions S.A.");
            UtilitariosConsola.ImprimirMenu(Arrays.asList("Transacciones", "Informes financieros", "Gestión de Presupuesto", "Alertas y recordatorios"), "Salir");
            opcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción:");

            switch (opcion) {
                case 1:
                    do {
                        UtilitariosConsola.ImprimirTitulo("Transacciones", 40);
                        UtilitariosConsola.ImprimirMenu(Arrays.asList("Registrar Transacción", "Realizar seguimiento de Transacción"));
                        subOpcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción");
                        switch (subOpcion){
                            case 1:
                                //TODO Refactorizar esta parte para que esta lógica esté en alguna clase encargada de manejar las transacciones, y hacer lo mismo con las otras opciones
                                UtilitariosConsola.ImprimirTitulo("Registar transacción", 40);
                                System.out.println("Ingrese Tipo");
                                TipoTransaccion tipo = UtilitariosEnum.MostrarSeleccionParaEnum(TipoTransaccion.values());
                                String descripcion = UtilitariosConsola.LeerCadenaConMensaje("Ingrese descripción");
                                String fecha = UtilitariosConsola.LeerCadenaConMensaje("Ingrese fecha");
                                double monto = UtilitariosConsola.LeerDecimalConMensaje("Ingrese monto");
                                transacciones.add(new Transaccion(tipo, descripcion, monto, fecha));
                                System.out.println("Transacción agregada exitosamente");
                                break;
                            case 2:
                                UtilitariosConsola.ImprimirTitulo("Seguimiento de transacciones");
                                if(transacciones.size() == 0){
                                    System.out.println("Aún no se han registrado transacciones");
                                }
                                for(Transaccion transaccion : transacciones){
                                    System.out.println(transaccion);
                                }
                        }
                    }while(subOpcion != 3);
                    break;
                case 2:
                    do {
                        UtilitariosConsola.ImprimirTitulo("Informes Financieros");
                        UtilitariosConsola.ImprimirMenu(Arrays.asList("Balance General", "Estado de Ganancias y pérdidas"));
                        subOpcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción");
                    }while(subOpcion != 3);
                    break;
            }
        }while(opcion != 5);
    }
}
