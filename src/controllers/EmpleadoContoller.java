
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
     * Ingresar el empleado donde la clave sea el id del empleado
     * @param empleado  a ingresar map
     * @return False si no ingreso porque ya existe, True si ingeeso correctamente
     */
    public boolean addEmpleado(Empleado empleado){
        if (!empleados.containsKey(empleado.getId()))
        {
        
        empleados.put(empleado.getId(), empleado);
        return true;
        }
        return false;
    }
    /**
     * Buscar un empeladopor si id
     * @param empleado  int id del empleado a buscar
     * @return empelado segun el id
     */
    public Empleado getEmpleadoById(int id){
        return empleados.get(id);

    }

    public void displayEmpleados(){
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey()+ " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombre(){
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getValue().getName());
        }
    }

    // Sin usar entrySet
    public void displayLlaves() {
        for (Integer llave : empleados.keySet()) {
            System.out.println(llave);
        }
    }
    
    // Sin usar entrySet
    public void displayEmpleado () {
        for (Integer empleado : empleados.keySet()) {
            System.out.println(empleado);
        }
    }
}