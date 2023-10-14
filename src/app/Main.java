package app;

import dominio.*;

public class Main {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        Empleado juan = new Directo("Juan", 4840000);
        Empleado julian = new Vendedor("Julian", 2050000, 45510000);
        Empleado claudia = new Vendedor("Claudia", 1380000, 35989000);
        Empleado johanna = new Freelance("Johanna", 71000, 89);
        Empleado david = new Directo("David", 3975000);
        Empleado gustavo = new Freelance("Gustavo", 42500, 65);

        nomina.agregarEmpleado(juan);
        nomina.agregarEmpleado(julian);
        nomina.agregarEmpleado(claudia);
        nomina.agregarEmpleado(johanna);
        nomina.agregarEmpleado(david);
        nomina.agregarEmpleado(gustavo);

        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarFreelancer();
    }
}
