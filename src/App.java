import controllers.Mapa;
import controllers.EmpleadoContoller;
import controllers.Ejercicios;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runMapExample() {
        System.out.println("\n----- Ejecutando ejemplo de Mapa -----");
        Mapa mapa = new Mapa();
        mapa.hashMap(); 
        mapa.linkedhashMapa();
        mapa.treeMapa();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();
        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);
        result = empleadoContoller.addEmpleado(new Empleado(2, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);

        // Agregar empleados
        empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Andres", "Senior"));
        
        // Mostrar solo los nombres
        empleadoContoller.displayEmpleadosSoloNombres();
            
    }

    private static void runEjercicios() {
        
    }
}
