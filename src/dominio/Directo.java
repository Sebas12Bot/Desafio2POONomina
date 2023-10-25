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
        try {
            if (salario < 0) {
                throw new IllegalArgumentException("El salario no puede ser un valor negativo.");
            }
            double porcentajeSalud = 0.057;
            return (long) (salario * porcentajeSalud);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular la salud: \n" + "Detalles del error: " + e.getMessage());
            return 0;
        }
    }

    public long calcularPension() {
        try{
            if (salario < 0){
                throw new IllegalArgumentException("El salario no puede ser un valor negativo.");
          }
            double porcentajePension = 0.065;
            return (long) (salario * porcentajePension);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular la pension: \n" + "Detalles del error: " + e.getMessage());
            return 0;
        }
    }

}