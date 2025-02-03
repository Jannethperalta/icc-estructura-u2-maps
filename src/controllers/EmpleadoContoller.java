package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoContoller {
    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    /**
     * Ingresar el empleado donde la clave sea el ID del empleado.
     * @param empleado a ingresar en el mapa.
     * @return False si no ingresó porque ya existe, True si ingresó correctamente.
     */
    public boolean addEmpleado(Empleado empleado) {
        if (!empleados.containsKey(empleado.getId())) {
            empleados.put(empleado.getId(), empleado);
            return true;
        }
        return false;
    }

    /**
     * Buscar un empleado por su ID.
     * @param id del empleado a buscar.
     * @return Empleado según el ID.
     */
    public Empleado getEmpleadoById(int id) {
        return empleados.get(id);
    }

    /**
     * Muestra todos los empleados con su ID y toda su información.
     */
    public void displayEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("\n=== Lista de Empleados ===");
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }

    /**
     * Muestra solo los nombres de los empleados registrados.
     */
    public void displayEmpleadosSoloNombres() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("\n=== Nombres de Empleados ===");
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado.getName());
        }
    }

    // Sin usar entrySet
    public void displayLlaves(){

    }

    // Si usar entrySet
    /*public void displayEmpleados(){

    }*/
}
