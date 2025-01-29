package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoContoller {
    private Map<Integer,Empleado> empleados;
    public EmpleadoContoller() {
        empleados  = new HashMap<>();
    }
    /**
     * @param empleado ingresar al mapa
     * @return False si no ingreso porque ya existe
     *         True si ingreso correctamente
     */
    public boolean addEmpleado(Empleado empleado){
        if (!empleados.containsKey(empleado.getId())) {
            empleados.put(empleado.getId(), empleado);
            return true;
        }
        
        return false;
    }
    public Empleado getEmpleadoById(int id){
        return empleados.get(id);
    }
    public void displayEmpleado(){
        for (Map.Entry<Integer,Empleado>  empleadoEntry: empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }
    public void displayEmpleadoSoloNombres(){
        for (Map.Entry<Integer,Empleado>  empleadoEntry: empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue().getName());
        }
    }
    public void displayLlaves(){
        for (Integer key  : empleados.keySet()) {
            System.out.println(key);
        }
    }
    public void displayEmpleadoValues(){
        for (Empleado valor  : empleados.values()) {
            System.out.println(valor);
        }
    }

}