package Transacciones;

import Utilitarios.UtilitariosConsola;
import Utilitarios.UtilitariosEnum;

public class Salida extends Transaccion{
    private TipoSalida tipo;
    @Override
    public void ingresarDatos() {
        descripcion = UtilitariosConsola.LeerCadenaConMensaje("Ingrese descripción");
        monto = UtilitariosConsola.LeerDecimalConMensaje("Ingrese monto");
        fecha = UtilitariosConsola.LeerFechaConMensaje("Ingrese fecha");
        tipo = UtilitariosEnum.MostrarSeleccionParaEnum(TipoSalida.values());
    }

    @Override
    public String toString() {
        return "Salida{" + super.toString() +
                "tipo=" + tipo +
                '}';
    }
}
