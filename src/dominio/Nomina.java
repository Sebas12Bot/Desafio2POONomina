package dominio;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Nomina {

    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void calcularNomina() {
        System.out.println("Nomina💵:");
        for (Empleado empleado : empleados) {
            System.out.println("----------------------------------------------------");
            String nombre = empleado.getNombre();
            String tipoEmpleado = empleado.getClass().getSimpleName();
            System.out.println("| " + tipoEmpleado + ": " + nombre);
            long salario = empleado.calcularSalario();
            String salarioFormateado = splitNumeroConPuntos(salario);
            System.out.println("| Salario actualizado: $" + salarioFormateado);
        }
        System.out.println("----------------------------------------------------\n");
    }

    public void listarDirectos() {
        System.out.println("----------------------");
        System.out.println("| Empleados Directos💼");
        System.out.println("----------------------");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Directo) {
                System.out.println("| " + empleado.getNombre());
            }
        }
        System.out.println("----------------------\n");
    }

    public void listarFreelancer() {
        System.out.println("----------------------");
        System.out.println("| Freelancers🌐");
        System.out.println("----------------------");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Freelance) {
                System.out.println("| " + empleado.getNombre());
            }
        }
        System.out.println("----------------------\n");
    }

    public void listarPromotor() {
        System.out.println("----------------------");
        System.out.println("| Promotores👾");
        System.out.println("----------------------");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Promotor) {
                System.out.println("| " + empleado.getNombre());
            }
        }
        System.out.println("----------------------\n");
    }

    private String splitNumeroConPuntos(long number) {
        DecimalFormat formato = new DecimalFormat("#,###");
        return formato.format(number);
    }
}

