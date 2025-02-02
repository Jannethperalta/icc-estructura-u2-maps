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
        Ejercicios ejercicios = new Ejercicios();
        //anagram
         System.out.println("\nPrueba de anagramas:");
         System.out.println(Ejercicios.areAnagrams("List", "Silent"));  
         System.out.println(Ejercicios.areAnagrams("Liste", "silet"));
         System.out.println(Ejercicios.areAnagrams("hello", "bello"));
         System.out.println(Ejercicios.areAnagrams("triangle", "integral"));

       // sumatorioDedos
       System.out.println("\nPrueba de sumatoriosDedos:");
       int[] nums = { 9,2,3,6 };
       int[] resultado = ejercicios.sumatoriaDeDos(nums, 5);
       System.out.println("Índices para objetivo 5: " + Arrays.toString(resultado)); 
       resultado = ejercicios.sumatoriaDeDos(nums, 10);
       System.out.println("Índices para objetivo 10: " + Arrays.toString(resultado)); 
    }
}

  
          
        
        
    
     


