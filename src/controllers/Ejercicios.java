package controllers;

import java.util.Arrays;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        // Primera verificación: si son de diferente tamaño, no son anagramas
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convertimos a arrays de caracteres y ordenamos
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        
        Arrays.sort(chars1);  // Ordenamos el primer array
        Arrays.sort(chars2);  // Ordenamos el segundo array
        
        // Comparamos los arrays ordenados
        return Arrays.equals(chars1, chars2);
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Comprobamos todas las combinaciones posibles
                if (nums[i] + nums[j] == objetivo) {
                    return new int[]{i, j};  
                }
            }
        }
        return null;  // Si no encontramos ninguna pareja
    }
}