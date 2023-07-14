package Transacciones;

import Utilitarios.UtilitariosConsola;
import Utilitarios.UtilitariosEnum;

public class Ingreso extends Transaccion{
    private TipoIngreso tipo;

    public Ingreso(){

    }

    @Override
    public void ingresarDatos() {
        descripcion = UtilitariosConsola.LeerCadenaConMensaje("Ingrese descripción");
        monto = UtilitariosConsola.LeerDecimalConMensaje("Ingrese monto");
        fecha = UtilitariosConsola.LeerFechaConMensaje("Ingrese fecha");
        tipo = UtilitariosEnum.MostrarSeleccionParaEnum(TipoIngreso.values());
    }

    @Override
    public String toString() {
        return "Ingreso{" + super.toString() +
                "tipo=" + tipo +
                '}';
    }
}
