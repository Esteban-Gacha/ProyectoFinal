package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DetalleTransaccion {

    private int diasPrestamo,cantidad;
    private LocalDate fechaActual=LocalDate.now();
    private LocalDate fechaEntregaPrestamo;
    private double subtotal;
    private boolean esAlquiler;
    private Vehiculo vehiculo;

    public DetalleTransaccion(boolean esAlquiler ,Vehiculo vehiculo,int cantidad) {
        this.cantidad = cantidad;
        this.esAlquiler=esAlquiler;
        this.vehiculo=vehiculo;
    }


    public int getDiasPrestamo() {
        return diasPrestamo;
    }


    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double getSubtotal() {
        return subtotal;
    }


    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    public boolean isEsAlquiler() {
        return esAlquiler;
    }


    public void setEsAlquiler(boolean esAlquiler) {
        this.esAlquiler = esAlquiler;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }


    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }


    public LocalDate getFechaEntregaPrestamo() {
        return fechaEntregaPrestamo;
    }


    public void setFechaEntregaPrestamo(LocalDate fechaEntregaPrestamo) {
        this.fechaEntregaPrestamo = fechaEntregaPrestamo;
    }


    public void calcularDiferenciaDias(LocalDate fechaActual, LocalDate fechaEntregaPrestamo){
        int dias=(int)ChronoUnit.DAYS.between(fechaActual, fechaEntregaPrestamo);
        setDiasPrestamo(dias);

    }


    public void calcularSubtotal(){
        if(!esAlquiler){
            setSubtotal(vehiculo.calcularPrecioVenta());
        }else{
            setSubtotal(vehiculo.calcularPrecioAlquiler(diasPrestamo));
        }
    }


    @Override
    public String toString() {
        return "DetalleTransaccion [diasPrestamo=" + diasPrestamo + ", cantidad=" + cantidad + ", subtotal=" + subtotal
                + ", esAlquiler=" + esAlquiler + ", vehiculo=" + vehiculo + "]";
    }
    
}
