package dominio;

public class Freelance extends Empleado {
    private long valorHoras;
    private int horasTrabajadas;

    public Freelance(String nombre, long valorHoras, int horasTrabajadas) {
        super(nombre);
        this.valorHoras = valorHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return valorHoras * horasTrabajadas;
    }
}
