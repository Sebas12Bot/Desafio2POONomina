package app;

import dominio.Empleado;
import dominio.Directo;
import dominio.Freelance;

import java.util.ArrayList;
import java.util.List;

public class Nomina {

    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void calcularNomina() {
        System.out.println("Nomina:");
        for (Empleado empleado : empleados) {
            long salario = empleado.calcularSalario();
            System.out.println(empleado.getNombre() + ": $" + salario);
        }
    }

    public void listarDirectos() {
        System.out.println("-------------------");
        System.out.println("| Empleados Directos");
        System.out.println("-------------------");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Directo) {
                System.out.println("| " + empleado.getNombre());
            }
        }
        System.out.println("-------------------\n");
    }

    public void listarFreelancer() {
        System.out.println("-------------------");
        System.out.println("| Freelancers");
        System.out.println("-------------------");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Freelance) {
                System.out.println("| " + empleado.getNombre());
            }
        }
        System.out.println("-------------------\n");

    }
}
