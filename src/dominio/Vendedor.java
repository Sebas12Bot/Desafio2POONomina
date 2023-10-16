package dominio;

public class Vendedor extends Directo {
    protected long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public long calcularSalario() {
        long salarioBase = super.calcularSalario();
        long comision = calcularComision();
        return salarioBase + comision;
    }

    private long calcularComision() {
        double porcentajeComision;

        if (super.calcularSalario() <= 1500000) {
            porcentajeComision = 0.045;
        } else {
            porcentajeComision = 0.035;
        }

        long comision = (long) (ventasDelMes * porcentajeComision);
        System.out.println("| Comision actualizada: " + splitNumeroConPuntos(comision));

        return comision;
    }
}

