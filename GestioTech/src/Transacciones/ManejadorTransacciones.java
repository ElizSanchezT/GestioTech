package Transacciones;

import Utilitarios.UtilitariosConsola;
import Utilitarios.UtilitariosEnum;

import java.util.ArrayList;
import java.util.List;

public class ManejadorTransacciones {
    private List<Transaccion> transacciones;
    public List<Transaccion> getTransacciones() {
        return transacciones;
    }
    public ManejadorTransacciones() {
        transacciones = new ArrayList<>();
    }

    public void registrarTransaccion(){
        UtilitariosConsola.ImprimirTitulo("Registar transacción", 40);
        System.out.println("Ingrese Tipo");
        TipoTransaccion tipo = UtilitariosEnum.MostrarSeleccionParaEnum(TipoTransaccion.values());
        Transaccion transaccion = TransaccionesFactory.obtenerTransaccion(tipo);
        transaccion.ingresarDatos();
        transacciones.add(transaccion);
        System.out.println("Transacción agregada exitosamente");
    }

    public void imprimirTransacciones(){
        UtilitariosConsola.ImprimirTitulo("Seguimiento de transacciones");
        if(transacciones.size() == 0){
            System.out.println("Aún no se han registrado transacciones");
        }
        for(Transaccion transaccion : transacciones){
            System.out.println(transaccion);
        }
    }
}
