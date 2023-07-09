package LogicaNegocio;

import Entidades.TipoTransaccion;
import Entidades.Transaccion;
import Utilitarios.UtilitariosConsola;
import Utilitarios.UtilitariosEnum;

import java.util.ArrayList;
import java.util.List;

public class ManejadorTransacciones {
    List<Transaccion> transacciones;

    public ManejadorTransacciones() {
        transacciones = new ArrayList<>();
    }

    public void registrarTransaccion(){
        UtilitariosConsola.ImprimirTitulo("Registar transacción", 40);
        System.out.println("Ingrese Tipo");
        TipoTransaccion tipo = UtilitariosEnum.MostrarSeleccionParaEnum(TipoTransaccion.values());
        String descripcion = UtilitariosConsola.LeerCadenaConMensaje("Ingrese descripción");
        String fecha = UtilitariosConsola.LeerCadenaConMensaje("Ingrese fecha");
        double monto = UtilitariosConsola.LeerDecimalConMensaje("Ingrese monto");
        transacciones.add(new Transaccion(tipo, descripcion, monto, fecha));
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
