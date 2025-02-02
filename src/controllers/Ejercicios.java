package controllers;

import java.util.HashMap;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);
        System.out.println("STR1:");
        str1 = leer.next();
        System.out.println("STR2:");
        str2 = leer.next();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] cadena1 = str1.toCharArray();
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] cadena2 = str2.toCharArray();
        //Hacer la comparacion primera donde se verifica que los string tengan diferentes tamaños, si es asi retorna falso
        if (str1.length() != str2.length()) {
            return false;
        }
        //Añadir los caracteres en los mapas, para verificar si el caracter ya existe con constainsKey.
        //Si lo tiene añade al valor un +1,sino, lo deja en 1. Esto es para facilitar el uso del metodo de comparacion
        //equals que compara los valores y no las claves.
        for(char a: cadena1){
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for(char a: cadena2){
            if (map2.containsKey(a)) {
                map2.put(a, map2.get(a) + 1);
            } else {
                
                map2.put(a, 1);
            }
        }
        return map.equals(map2);

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
        System.out.println("Ingresa el objetivo: ");
        Scanner leer = new Scanner(System.in);
        objetivo = leer.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        //Digamos que el objetivo es 5, y los primeros numeros son 1 y 4.
        
        for (int i = 0; i < nums.length; i++) {
            // vuelta 1: complemento = 4
            // vuelta 2: complemento = 1
            int comprobador = objetivo - nums[i];
            // vuelta 1 : No entra
            // vuelta 2 : Entra porque revisa que la clave se encuentra agregada
            if (map.containsKey(comprobador)) {
                // VUELTA FINAL : crea un array de tamaño segun el hash map que tenemos
                return new int[] { map.get(comprobador), i };
            }
            // vuelta 1 : Se agrega al HashMap el 1
            map.put(nums[i], i);
        } 
        //SI NO AY CONINCIDENCIAS
        return null;
    }
}
