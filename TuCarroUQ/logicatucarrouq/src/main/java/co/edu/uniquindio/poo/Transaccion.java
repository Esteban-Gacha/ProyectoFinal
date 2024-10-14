package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Transaccion {
    private LocalDate fechaTransaccion=LocalDate.now();
    private double total=0;
    private Collection<DetalleTransaccion> detallesTransaccion;
    private Cliente cliente;


    public Transaccion(Cliente cliente) {
        this.cliente = cliente;
        detallesTransaccion=new LinkedList<>();
    }


    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }


    public void setFechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public Collection<DetalleTransaccion> getDetallesTransaccions() {
        return detallesTransaccion;
    }


    public void setDetallesCompra(Collection<DetalleTransaccion> detalleTransaccion) {
        this.detallesTransaccion=detalleTransaccion;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarDetallesTransaccion(DetalleTransaccion transaccion){
        detallesTransaccion.add(transaccion);
    }

    public void eliminareDetallesTransaccion(DetalleTransaccion transaccion){
        detallesTransaccion.remove(transaccion);
    }

    public void calcularTotal(){
        total=0;
        for(DetalleTransaccion transaccion: detallesTransaccion){
            double subtotal=transaccion.getSubtotal();
            total+= subtotal;
        }
        setTotal(total);
    }


    @Override
    public String toString() {
        return "Transaccion [fechaTransaccion=" + fechaTransaccion + ", total=" + total + ", detallesTransaccion="
                + detallesTransaccion + ", cliente=" + cliente + "]";
    }






    
}
