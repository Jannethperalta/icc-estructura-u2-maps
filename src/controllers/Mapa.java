package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        linkedhashMapa();
        treeMapa();
    }

    public void hashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();
        
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("HashMap (Sin orden específico): " + mapa);

        // Contiene clave
        System.out.println("¿Hay Pera? " + mapa.containsKey("Pera"));
        System.out.println("¿Hay Kiwi? " + mapa.containsKey("Kiwi"));

        // Obtener valores
        System.out.println("Valor de Pera: " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");
        System.out.println("Después de eliminar Pera: " + mapa);
    }

    public void linkedhashMapa() {
        LinkedHashMap<String, Integer> linkedMapa = new LinkedHashMap<>();
        
        linkedMapa.put("Manzana", 10);
        linkedMapa.put("Pera", 11);
        linkedMapa.put("Durazno", 5);
        linkedMapa.put("Mango", 6);

        System.out.println("\nLinkedHashMap (Mantiene el orden de inserción): " + linkedMapa);

        // Eliminar un elemento
        linkedMapa.remove("Durazno");
        System.out.println("Después de eliminar Durazno: " + linkedMapa);
    }

    public void treeMapa() {
        TreeMap<String, Integer> treeMapa = new TreeMap<>();
        
        treeMapa.put("Manzana", 10);
        treeMapa.put("Pera", 11);
        treeMapa.put("Durazno", 5);
        treeMapa.put("Mango", 6);

        System.out.println("\nTreeMap (Ordenado por clave): " + treeMapa);

        // Obtener el primer y último elemento
        System.out.println("Primera clave: " + treeMapa.firstKey());
        System.out.println("Última clave: " + treeMapa.lastKey());

        // Eliminar el primer elemento
        treeMapa.pollFirstEntry();
        System.out.println("Después de eliminar el primer elemento: " + treeMapa);
    }

    public static void main(String[] args) {
        new Mapa();
    }
}
