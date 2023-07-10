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
            UtilitariosConsola.ImprimirMenu(Arrays.asList("Transacciones", "Informes financieros", "Gestión de Presupuesto","Ver empleados"), "Salir");
            opcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción:");
            //Se lee el archivo txt de planilla el cual se usa para gestion de presupuesto (3) y ver empleados (4)
            PlanillaDeEmpleados planilla = new PlanillaDeEmpleados();
            planilla.cargarListaEmpleados("planilla.txt");

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
                        UtilitariosConsola.ImprimirTitulo("Gestión de Presupuestos");
                        UtilitariosConsola.ImprimirMenu(Arrays.asList("Presupuesto general", "Por departamento"));
                        subOpcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción");

                        switch (subOpcion) {
                            case 1:
                                //Calcula el presupuesto general de la empresa tomando en cuenta todos los fondos presupuestales
                                //y los sueldos de cada departamento

                                UtilitariosConsola.ImprimirTitulo("Gestión de Presupuesto General");
                                Departamento dptoA = new AtencionAlCliente(null);
                                dptoA.listaDeEmpleadosxDpto(planilla);
                                Departamento dptoB = new Finanzas(null);
                                dptoB.listaDeEmpleadosxDpto(planilla);
                                Departamento dptoC = new Direccion(null);
                                dptoC.listaDeEmpleadosxDpto(planilla);
                                Departamento dptoD = new Ventas(null);
                                dptoD.listaDeEmpleadosxDpto(planilla);
                                Departamento dptoE = new Marketing(null);
                                dptoE.listaDeEmpleadosxDpto(planilla);

                                double totalFondos = dptoA.fondoPresupuestal() + dptoB.fondoPresupuestal() + dptoC.fondoPresupuestal() + dptoD.fondoPresupuestal() + dptoE.fondoPresupuestal();
                                double sueldoTotal = dptoA.calcularTotalSueldos() + dptoB.calcularTotalSueldos() + dptoC.calcularTotalSueldos() + dptoD.calcularTotalSueldos() + dptoE.calcularTotalSueldos();
                                double presupuestoTotal = totalFondos-sueldoTotal;

                                UtilitariosConsola.ImprimirPresupuestoTotal(totalFondos,sueldoTotal,presupuestoTotal);

                                break;
                            case 2:
                                do {
                                    // Calcula el presupuesto por cada departamento
                                    UtilitariosConsola.ImprimirTitulo("Gestión de Presupuestos por Departamento");
                                    UtilitariosConsola.ImprimirMenu(Arrays.asList("Atención al cliente", "Finanzas", "Dirección", "Ventas"));
                                    subOpcion = UtilitariosConsola.LeerEnteroConMensaje("Ingrese opción");

                                    switch (subOpcion) {
                                        case 1:
                                            Departamento dpto1 = new AtencionAlCliente(null);
                                            dpto1.listaDeEmpleadosxDpto(planilla);
                                            //dpto1.imprimirPlanillaDpto();
                                            dpto1.calcularTotalSueldos();
                                            dpto1.imprimirPresupuesto();
                                            break;
                                        case 2:
                                            Departamento dpto2 = new Finanzas(null);
                                            dpto2.listaDeEmpleadosxDpto(planilla);
                                            //dpto2.imprimirPlanillaDpto();
                                            dpto2.calcularTotalSueldos();
                                            dpto2.imprimirPresupuesto();
                                            break;
                                        case 3:
                                            Departamento dpto3 = new Direccion(null);
                                            dpto3.listaDeEmpleadosxDpto(planilla);
                                            //dpto3.imprimirPlanillaDpto();
                                            dpto3.calcularTotalSueldos();
                                            dpto3.imprimirPresupuesto();
                                            break;
                                        case 4:
                                            Departamento dpto4 = new Ventas(null);
                                            dpto4.listaDeEmpleadosxDpto(planilla);
                                            //dpto4.imprimirPlanillaDpto();
                                            dpto4.calcularTotalSueldos();
                                            dpto4.imprimirPresupuesto();
                                            break;
                                        case 5:
                                            Departamento dpto5 = new Marketing(null);
                                            dpto5.listaDeEmpleadosxDpto(planilla);
                                            //dpto5.imprimirPlanillaDpto();
                                            dpto5.calcularTotalSueldos();
                                            dpto5.imprimirPresupuesto();
                                            break;
                                    }
                                } while (subOpcion != 6);
                        }
                    } while (subOpcion != 3);
                case 4:
                    planilla.imprimirPlanilla();
                    break;
            }
        }while(opcion != 5);
    }
}
