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
        try {
            if (valorHoras < 0 || horasTrabajadas < 0) {
                throw new IllegalArgumentException ("El valor de las horas o las horas trabajadas no pueden ser un valor negativo.");
            }
            long salario = valorHoras * horasTrabajadas;
            System.out.println("|Salario total: $" + splitNumeroConPuntos(salario));
            return salario;
        } catch (IllegalArgumentException e){
            System.out.println("+Error al calcular el salario: \n" + "Detalles del error: " + e.getMessage());
            return 0;
        }
    }
}
