package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private double precioVenta,precioAlquiler;

    public Moto(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, boolean nuevo,
            TipoDeCombustible combustible, TipoDeTransmision transmision, int kilometraje,TipoDeVehiculo tipoDeVehiculo) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, kilometraje, nuevo, combustible, transmision, tipoDeVehiculo);
        
    }

    @Override
    public double calcularPrecioVenta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecioVenta'");
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecioAlquiler'");
    }

    @Override
    public String toString() {
        return "Moto [precioVenta=" + precioVenta + ", precioAlquiler=" + precioAlquiler + "]";
    }

    
    
}
