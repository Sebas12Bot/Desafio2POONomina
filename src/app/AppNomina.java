package app;

import dominio.*;

public class AppNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        Empleado juan = new Directo("Juan", 4840000);
        Empleado julian = new Vendedor("Julian", 2050000, 45510000);
        Empleado johanna = new Freelance("Johanna", 71000, 89);
        Empleado claudia = new Vendedor("Claudia", 1380000, 35989000);
        Empleado david = new Directo("David", 3975000);
        Empleado gustavo = new Freelance("Gustavo", 42500, 65);
        Empleado pedro = new Promotor("Pedro",2000,200,77);
        //Prueba de ArithmeticException
        Empleado a = new Vendedor("A",-1000, -15000);
        //Prueba excepcion freelance
        Empleado b = new Freelance("B",-1,-2);
        //Prueba de excepcion promotor
        Empleado c = new Promotor("C",-2,-7,-8);

        nomina.agregarEmpleado(juan);
        nomina.agregarEmpleado(julian);
        nomina.agregarEmpleado(johanna);
        nomina.agregarEmpleado(claudia);
        nomina.agregarEmpleado(david);
        nomina.agregarEmpleado(gustavo);
        nomina.agregarEmpleado(pedro);
        //Prueba de IllegalStateException
        nomina.agregarEmpleado(null);
        //Prueba de ArithmeticException
        nomina.agregarEmpleado(a);
        //Prueba excepcion freelance
        nomina.agregarEmpleado(b);
        //Prueba de excepcion promotor
        nomina.agregarEmpleado(c);



        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarFreelancer();
        nomina.listarPromotor();
    }
}
