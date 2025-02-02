
import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {

    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();

        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtrl = new EmpleadoContoller();
        empCtrl.addEmpleado(new Empleado(1, "David","Senior" ));
        empCtrl.addEmpleado(new Empleado(2, "Juan","Senior" ));
        empCtrl.addEmpleado(new Empleado(3, "Andres","Senior" ));
        boolean result = empCtrl.addEmpleado(new Empleado(1, "David", "2"));
        System.out.println(result);
        empCtrl.displayEmpleadoSoloNombres();
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        System.out.println(" EJERCICIO ANGRAMAS -------");
        System.out.println("Ingresa las dos cadenas");
        Ejercicios ejecutar = new Ejercicios();
        System.out.println(ejecutar.areAnagrams("",""));
        System.out.println(" EJERCICIO SUMA DE NUMEROS-------");
        int[] numeros = {1, 4, 3, 6};
        int[] result = ejecutar.sumatoriaDeDos(numeros,0);
        if (result == null) {
            System.out.println("No hay nada ");
        }else{
            System.out.println(" La suma de estos numeros da el objetivo ");
            for (int a : result) {
                System.out.print(a);
            }
        }
        
    }
    
}
