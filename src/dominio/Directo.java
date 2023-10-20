package dominio;

public class Directo extends Empleado {

    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        long salarioDespuesAportes = salario - calcularAportes();
        return salarioDespuesAportes;
    }

    private long calcularAportes() {
        return calcularSalud() + calcularPension();
    }

    public long calcularSalud() {
        double porcentajeSalud = 0.057;
        return (long) (salario * porcentajeSalud);
    }

    public long calcularPension() {
        double porcentajePension = 0.065;
        return (long) (salario * porcentajePension);
    }

}