package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Concesionario {
    // Listas para almacenar empleados, administradores y vehículos
    private Collection<Empleado> empleados;
    private Collection<Administrador> administradores;
    private Collection<Vehiculo> vehiculos;
    private Collection<Transaccion> ventas;
    private static final String NOMBRE="TuCarroUQ";

    // Constructor
    public Concesionario() {
        empleados = new LinkedList<>();
        administradores = new LinkedList<>();
        vehiculos = new LinkedList<>();
        ventas=new LinkedList<>();

    }
    
    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Collection<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Collection<Transaccion> getVentas() {
        return ventas;
    }

    public void setVentas(Collection<Transaccion> ventas) {
        this.ventas = ventas;
    }

    public static String getNombre() {
        return NOMBRE;
    }

    // Métodos para agregar empleados, administradores y vehículos

    public boolean existeEmpleado(String identificacion){
        boolean banderilla=false;
        for(Empleado empleado :empleados){
            if(empleado.getIdentificacion().equals(identificacion)){
                banderilla=true;
            }
        }
        return banderilla;

    }
    public void agregarEmpleado(Empleado empleado) {
        if(!existeEmpleado(empleado.getIdentificacion())){
            empleados.add(empleado);
        }
    }
    public boolean existeAdministrador(String identificacion){
        boolean banderilla=false;
        for(Administrador administrador : administradores){
            if(administrador.getIdentificacion().equals(identificacion)){
                banderilla=true;
            }
        }
        return banderilla;

    }
    public void agregarAdministrador(Administrador administrador) {
        if(!existeAdministrador(administrador.getIdentificacion())){
            administradores.add(administrador);
        }
        
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }





}

