package dominio;

public class Vendedor extends Directo {

    public static final int VALOR_LIMITE = 1500000;

    protected long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public long calcularSalario() {
        long salario = super.calcularSalario();
        long comision = calcularComision();
        return salario + comision;
    }

    private long calcularComision() {
        try {
            double porcentajeComision;
            if (super.calcularSalario() <= VALOR_LIMITE) {
                porcentajeComision = 0.045;
            } else {
                porcentajeComision = 0.035;
            }
            if (ventasDelMes < 0) {
                throw new IllegalArgumentException("Las ventas del mes no pueden ser un valor negativo.");
            }
            long comision = (long) (ventasDelMes * porcentajeComision);
            System.out.println("| Comision total: $" + splitNumeroConPuntos(comision));
            return comision;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular la comision: " + e.getMessage());
            return 0;
        }
    }

}

