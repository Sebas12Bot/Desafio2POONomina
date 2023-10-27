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
        try {
            if (volantesRepartidos < 0 || valorVolante < 0 || comprasVolantes < 0) {
                throw new IllegalArgumentException("Los valores no pueden ser negativos.");
            }
            long salario = (volantesRepartidos * valorVolante) + (comprasVolantes * VALOR_POR_COMPRA);
            System.out.println("| Salario total: $" + splitNumeroConPuntos(salario));
            return salario;
        } catch (IllegalArgumentException e) {
            System.out.println("+Error al calcular el salario: \n" + "Detalles del error: " + e.getMessage());
            return 0;
        }
    }
}
