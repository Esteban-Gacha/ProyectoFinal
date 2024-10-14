package co.edu.uniquindio.poo;

import java.util.Collection;

public class Administrador extends Empleado {

    // Constructor
    public Administrador(String nombre, String identificacion, String contrasena, String preguntaSeguridad, String respuestaSeguridad) {
        super(nombre, identificacion, contrasena, preguntaSeguridad, respuestaSeguridad);
    }
    
    // Método para registrar empleados
    public void registrarEmpleado(Collection<Empleado> empleados, Empleado nuevoEmpleado) {
        empleados.add(nuevoEmpleado);
    }
    
    // Método para bloquear un empleado (ejemplo de manejo de estado de cuenta)
    public void bloquearEmpleado(Empleado empleado) {
        empleado.setContrasena(null); // Esto simula el bloqueo de la cuenta eliminando la contraseña
    }
    
    // Método para generar reportes de transacciones de los empleados
    public void generarReporte(Collection<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println("Transacciones de " + empleado.getNombre() + ":");
            for (Transaccion transaccion : empleado.getTransacciones()) {
                System.out.println(transaccion);
            }
        }
    }

    @Override
    public String toString() {
        return "Administrador []";
    }


}
