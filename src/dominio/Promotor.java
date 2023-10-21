package dominio;

public class Promotor extends Empleado {

    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolantes;
    private static final long VALOR_POR_COMPRA = 12900;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolantes) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolantes = comprasVolantes;
    }

    @Override
    public long calcularSalario() {
        return (volantesRepartidos * valorVolante) + (comprasVolantes * VALOR_POR_COMPRA);
    }
}
