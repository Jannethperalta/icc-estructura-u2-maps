import controllers.Mapa;
import controllers.EmpleadoContoller;

import java.util.Arrays;

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
        System.out.println("Test Ejercicios");
    
        Ejercicios ejercicios = new Ejercicios();
    
        // Tests para areAnagrams()
        System.out.println("\n[Test 1] Anagramas 'listen' y 'silent': " + 
        Ejercicios.areAnagrams("listen", "silent"));  // Debe ser true
        System.out.println("[Test 2] Anagramas 'hello' y 'bello': " + 
        Ejercicios.areAnagrams("hello", "bello"));    // Debe ser false
        System.out.println("[Test 3] Anagramas 'triangle' y 'integral': " + 
        Ejercicios.areAnagrams("triangle", "integral")); // Debe ser true

        // Tests para sumatoriaDeDos()
        int[] nums = {9, 2, 3, 6};
    
        System.out.println("\n[Test 4] Sumatoria objetivo 5: " + 
        Arrays.toString(ejercicios.sumatoriaDeDos(nums, 5)));  // [1, 2]
        System.out.println("[Test 5] Sumatoria objetivo 10: " + 
        ejercicios.sumatoriaDeDos(nums, 10));  // null
        int[] otrosNums = {1, 3, 5, 7};
         System.out.println("\n[Test 6] Sumatoria objetivo 8: " + 
        Arrays.toString(ejercicios.sumatoriaDeDos(otrosNums, 8))); // [0, 3]
}
}
