package Utilitarios;

import java.util.Scanner;

public class UtilitariosEnum {

    private static final Scanner _scanner = new Scanner(System.in);
    public static <E extends Enum<E>> E MostrarSeleccionParaEnum(Enum<E>[] valoresEnumeracion){
        int opcion;
        do{
            for (int i = 0; i < valoresEnumeracion.length; i++) {
                System.out.println((i+1) + "." + ' ' + valoresEnumeracion[i].name());
            }
            try{
                String entrada = _scanner.nextLine();
                opcion = Integer.parseInt(entrada);
            }catch(Exception ex){
                opcion = 0;
            }

            if(opcion < 1 || opcion > valoresEnumeracion.length)
            {
                System.out.println("Opción no válida, por favor elija un número del 1 al "+ valoresEnumeracion.length);
            }
        }while(opcion < 1 || opcion > valoresEnumeracion.length);

        opcion--;

        return valoresEnumeracion[opcion].getDeclaringClass().cast(valoresEnumeracion[opcion]);
    }
}
