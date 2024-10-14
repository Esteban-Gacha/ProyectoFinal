package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{

    public Moto(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, boolean nuevo,
            Combustible combustible, Transmision transmision, int kilometraje) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, nuevo, combustible, transmision, kilometraje);
        
    }

    @Override
    public void calcularPrecioVenta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecioVenta'");
    }

    @Override
    public void calcularPrecioAlquiler(int dias) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecioAlquiler'");
    }
    
}
