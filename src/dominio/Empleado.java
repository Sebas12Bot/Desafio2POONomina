package dominio;

import java.text.DecimalFormat;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract long calcularSalario();

    public String getNombre() {
        return nombre;
    }

    protected String splitNumeroConPuntos(long numero) {
        DecimalFormat formato = new DecimalFormat("#,###");
        return formato.format(numero);
    }
}

