package Utilitarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class UtilitariosConsola {
    private static final Scanner _scanner = new Scanner(System.in);
    public static int LeerEnteroConMensaje(String mensaje){
        System.out.println(mensaje);
        return LeerEntero();
    }

    public static int LeerEntero(){
        while(true){
            try{
                String entrada = _scanner.nextLine();
                return Integer.parseInt(entrada);
            }catch(Exception ex){
                System.out.println("Solo puede ingresar números, por favor vuelva a intentar");
            }
        }
    }

    public static String LeerCadenaConMensaje(String mensaje){
        System.out.println(mensaje);
        return _scanner.nextLine();
    }

    public static double LeerDecimalConMensaje(String mensaje){
        System.out.println(mensaje);
        while(true){
            try{
                String entrada = _scanner.nextLine();
                return Double.parseDouble(entrada);
            }catch(Exception ex){
                System.out.println("Solo puede ingresar números, por favor vuelva a intentar");
            }
        }
    }
    public static LocalDate LeerFechaConMensaje(String mensaje) {
        System.out.println(mensaje);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            String entrada = _scanner.nextLine();
            try {
                LocalDate fecha = LocalDate.parse(entrada, formatter);
                return fecha;
            } catch (DateTimeParseException ex) {
                System.out.println("Ingrese una fecha con formato válido (dd/mm/aaaa)");
            }
        }
    }

    public static boolean LeerBoolConMensaje(String mensaje) {
        return LeerBoolConMensaje(mensaje, "S" , "N");
    }

    public static boolean LeerBoolConMensaje(String mensaje, String opcionVerdad, String opcionFalsedad) {
        System.out.println(mensaje + "(" + opcionVerdad + " o " + opcionFalsedad + ")");
        String opc = "";
        while (opc!= opcionFalsedad || opcionFalsedad != opcionVerdad) {
            opc = _scanner.nextLine();
            if(opc.equals(opcionVerdad)){
                return true;
            }
            if(opc.equals(opcionFalsedad)){
                return false;
            }
            else{
                System.out.println("Ingrese una opción válida");
            }
        }
        return false;
    }

    public static void ImprimirTitulo(String titulo) {
        ImprimirTitulo(titulo, 100);
    }

    public static void ImprimirTitulo(String titulo, int longitud){
        for (int i = 0; i < longitud; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < (longitud - titulo.length())/2; i++) {
            System.out.print(" ");
        }
        System.out.print(titulo);
        for (int i = 0; i < (longitud - titulo.length())/2 - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for (int i = 0; i < longitud; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void ImprimirMenu(List<String> opciones){
        ImprimirMenu(opciones, "Volver");
    }

    public static void ImprimirMenu(List<String> opciones, String ultimaOpcion){
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i+1) + "." + " " + opciones.get(i));
        }
        System.out.println((opciones.size()+1) + "." + " " + ultimaOpcion);
    }

    public static void ImprimirPresupuestoTotal(double fondos, double gastos, double presupuestoTotal) {
        System.out.println("Fondo presupuestal (S/.):\t" + fondos);
        System.out.println("Gastos fijos (S/.):\t\t" + gastos + "\t-");
        System.out.println("-------------------------------------------------");
        System.out.println("Presupuesto total (S/.)\t\t" + presupuestoTotal +"\n");
    }

}
