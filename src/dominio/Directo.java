package dominio;

public class Directo extends Empleado {

    public static final int VALOR_LIMITE = 1500000;

    private long salarioBase;

    public Directo(String nombre, long salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public long calcularSalario() {
        long salarioDespuesAportes = salarioBase - calcularAportes();
        double porcentajeComision;

        if (salarioDespuesAportes <= VALOR_LIMITE) {
            porcentajeComision = 0.045;
        } else {
            porcentajeComision = 0.035;
        }

        long comision = (long) (salarioDespuesAportes * porcentajeComision);
        long salarioTotal = salarioDespuesAportes + comision;

        return salarioTotal;
    }

    private long calcularAportes() {
        return calcularSalud() + calcularPension();
    }

    public long calcularSalud() {
        double porcentajeSalud = 0.057;
        return (long) (salarioBase * porcentajeSalud);
    }

    public long calcularPension() {
        double porcentajePension = 0.065;
        return (long) (salarioBase * porcentajePension);
    }

}
