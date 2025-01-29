package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {

    public Mapa() {
        hashMap();
        linkedHashMap();
        treeMap();
    }

    public void hashMap() {
        System.out.println(" HASH MAP -----------------");
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 0);
        System.out.println(mapa);
        //VERIFICAR SI EXISTE EN EL MAPA EL OBJETO SEGIN LA CLAVE
        System.out.println(mapa.containsKey("Pera"));
        System.out.println(mapa.containsKey("Kiwi"));
        //OBTENER EL VALOR DE SEGUN LA LLAVE
        System.out.println(mapa.get("Pera"));
        //ELIMINAR POR LLAVE
        mapa.remove("Pera");

        System.out.println(mapa);
    }

    public void linkedHashMap() {
        System.out.println("LINKED HASH MAP -----------------");
        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 0);
        System.out.println(mapa);
        //VERIFICAR SI EXISTE EN EL MAPA EL OBJETO SEGIN LA CLAVE
        System.out.println(mapa.containsKey("Pera"));
        System.out.println(mapa.containsKey("Kiwi"));
        //OBTENER EL VALOR DE SEGUN LA LLAVE
        System.out.println(mapa.get("Pera"));
        //ELIMINAR POR LLAVE
        mapa.remove("Pera");

        System.out.println(mapa);
    }

    public void treeMap() {
        System.out.println("TREE MAP -----------------");
        Map<String, Integer> mapa = new TreeMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 0);
        System.out.println(mapa);
        //VERIFICAR SI EXISTE EN EL MAPA EL OBJETO SEGIN LA CLAVE
        System.out.println(mapa.containsKey("Pera"));
        System.out.println(mapa.containsKey("Kiwi"));
        //OBTENER EL VALOR DE SEGUN LA LLAVE
        System.out.println(mapa.get("Pera"));
        //ELIMINAR POR LLAVE
        mapa.remove("Pera");

        System.out.println(mapa);

    }
}
