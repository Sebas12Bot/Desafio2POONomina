package dominio;

public class Directo extends Empleado {

    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        try {
            long salarioDespuesAportes = salario - calcularAportes();
            return salarioDespuesAportes;
        } catch (IllegalArgumentException e) {
            System.out.println("+Error al calcular el salario: \n" + "Detalles del error: " + e.getMessage());
            return 0;
        }
    }

    private long calcularAportes() {
        return calcularSalud() + calcularPension();
    }

    public long calcularSalud() {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser un valor negativo.");
        }
        double porcentajeSalud = 0.057;
        return (long) (salario * porcentajeSalud);
    }

    public long calcularPension() {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser un valor negativo.");
        }
        double porcentajePension = 0.065;
        return (long) (salario * porcentajePension);
    }
}
