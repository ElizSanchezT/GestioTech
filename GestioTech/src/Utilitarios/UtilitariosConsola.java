package Utilitarios;

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

    public static void LimpiarConsola(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {

        }
    }

}
