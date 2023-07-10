package Principal;

import Entidades.TipoTransaccion;
import Entidades.Transaccion;
import LogicaNegocio.ManejadorTransacciones;
import Utilitarios.UtilitariosConsola;
import Utilitarios.UtilitariosEnum;
import GestionDePresupuesto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;

public class Principal {
    public static void main(String[] args) {

        int opcion;
        int subOpcion;
        ManejadorTransacciones manejadorTransacciones = new ManejadorTransacciones();
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
                        switch (subOpcion) {
                            case 1:
                                manejadorTransacciones.registrarTransaccion();
                                break;
                            case 2:
                                manejadorTransacciones.imprimirTransacciones();
                                break;
                        }
                    } while (subOpcion != 3);
                    break;
                case 2:
                    do {
                        UtilitariosConsola.ImprimirTitulo("Informes Financieros");
                        UtilitariosConsola.ImprimirMenu(Arrays.asList("Balance General", "Estado de Ganancias y pérdidas"));
                        subOpcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción");
                    } while (subOpcion != 3);
                    break;
                case 3:
                    do {
                        //Al momento de realizar la gestion de presupuestos se lee el archivo de planilla y se almacenan los Empleados en la PlanillaDeEmpleados
                        String fileName = "planilla.txt";  // Replace with the actual file name and path

                        PlanillaDeEmpleados planilla = new PlanillaDeEmpleados();
                        planilla.cargarListaEmpleados("planilla.txt");

                        planilla.imprimirPlanilla();
                        UtilitariosConsola.ImprimirTitulo("Gestión de Presupuestos");
                        UtilitariosConsola.ImprimirMenu(Arrays.asList("Presupuesto general", "Por departamento"));
                        subOpcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción");

                        switch (subOpcion) {
                            case 1:
                                /*System.out.println(new File(" ").getAbsolutePath());
                                File file = new File("planilla.txt");
                                System.out.println(file.exists());
                                String fileName = "planilla.txt";  // Replace with the actual file name and path

                                PlanillaDeEmpleados planilla = new PlanillaDeEmpleados();
                                planilla.cargarListaEmpleados("planilla.txt");

                                planilla.imprimirPlanilla();*/
                                break;
                            case 2:
                                do {
                                    UtilitariosConsola.ImprimirTitulo("Gestión de Presupuestos por Departamento");
                                    UtilitariosConsola.ImprimirMenu(Arrays.asList("Atención al cliente", "Finanzas", "Dirección", "Ventas"));
                                    subOpcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción");

                                    switch (subOpcion) {
                                        case 1:
                                            Departamento dpto1 = new AtencionAlCliente(null,0,null);
                                            dpto1.listaDeEmpleadosxDpto(planilla);
                                            //planilla.imprimirPlanilla();
                                            dpto1.imprimirPlanillaDpto();
                                            dpto1.calcularTotalSueldos();
                                            dpto1.imprimirPresupuesto();
                                            break;
                                        case 2:
                                            Departamento dpto2 = new Finanzas(null,0,null);
                                            dpto2.listaDeEmpleadosxDpto(planilla);
                                            dpto2.imprimirPlanillaDpto();
                                            dpto2.calcularTotalSueldos();
                                            dpto2.imprimirPresupuesto();
                                            break;
                                        case 3:
                                            Departamento dpto3 = new Direccion(null,0,null);
                                            dpto3.listaDeEmpleadosxDpto(planilla);
                                            dpto3.imprimirPlanillaDpto();
                                            dpto3.calcularTotalSueldos();
                                            dpto3.imprimirPresupuesto();
                                            break;
                                        case 4:
                                            Departamento dpto4 = new Ventas(null,0,null);
                                            dpto4.listaDeEmpleadosxDpto(planilla);
                                            dpto4.imprimirPlanillaDpto();
                                            dpto4.calcularTotalSueldos();
                                            dpto4.imprimirPresupuesto();
                                            break;
                                        case 5:
                                            Departamento dpto5 = new Marketing(null,200,null);
                                            dpto5.listaDeEmpleadosxDpto(planilla);
                                            dpto5.imprimirPlanillaDpto();
                                            dpto5.calcularTotalSueldos();
                                            dpto5.imprimirPresupuesto();
                                            break;
                                    } //while (subOpcion != 6);
                                } while (subOpcion != 5);
                        }
                    } while (subOpcion != 3);
            }
        }while(opcion != 5);
    }
}
