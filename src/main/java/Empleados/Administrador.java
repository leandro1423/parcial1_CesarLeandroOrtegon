package Empleados;

import models.Empleado;

public class Administrador extends Empleado {

    public Administrador(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo) {
        super(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo);
    }
}
