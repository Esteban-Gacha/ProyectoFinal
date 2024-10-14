package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int numeroDePasajeros,NumeroDePuertas,NumeroDeBolsasDeAire,NumeroCaballosDeFuerza;
    private double TiempoEnAlcanzar100kmh,precioVenta,precioAlquiler;
    
    public Deportivo(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje,
            boolean nuevo, TipoDeCombustible combustible, TipoDeTransmision transmision, int kilometraje, int numeroDePasajeros,
            int numeroDePuertas, int numeroDeBolsasDeAire, int numeroCaballosDeFuerza, double tiempoEnAlcanzar100kmh,TipoDeVehiculo tipoDeVehiculo) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, kilometraje, nuevo, combustible, transmision, tipoDeVehiculo);
        this.numeroDePasajeros = numeroDePasajeros;
        NumeroDePuertas = numeroDePuertas;
        NumeroDeBolsasDeAire = numeroDeBolsasDeAire;
        NumeroCaballosDeFuerza = numeroCaballosDeFuerza;
        TiempoEnAlcanzar100kmh = tiempoEnAlcanzar100kmh;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public int getNumeroDePuertas() {
        return NumeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        NumeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDeBolsasDeAire() {
        return NumeroDeBolsasDeAire;
    }

    public void setNumeroDeBolsasDeAire(int numeroDeBolsasDeAire) {
        NumeroDeBolsasDeAire = numeroDeBolsasDeAire;
    }

    public int getNumeroCaballosDeFuerza() {
        return NumeroCaballosDeFuerza;
    }

    public void setNumeroCaballosDeFuerza(int numeroCaballosDeFuerza) {
        NumeroCaballosDeFuerza = numeroCaballosDeFuerza;
    }

    public double getTiempoEnAlcanzar100kmh() {
        return TiempoEnAlcanzar100kmh;
    }

    public void setTiempoEnAlcanzar100kmh(double tiempoEnAlcanzar100kmh) {
        TiempoEnAlcanzar100kmh = tiempoEnAlcanzar100kmh;
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

}
