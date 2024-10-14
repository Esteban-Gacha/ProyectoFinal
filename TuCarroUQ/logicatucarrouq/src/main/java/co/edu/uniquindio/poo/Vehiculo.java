package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private String marca, referencia, cambios;
    private int velocidadMaxima, cilindraje, kilometraje;
    private boolean nuevo;
    private TipoDeCombustible combustible;
    private TipoDeTransmision transmision;
    private TipoDeVehiculo tipoDeVehiculo;
    private double precioVenta,precioAlquiler;
    




    public Vehiculo(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje,
            int kilometraje, boolean nuevo, TipoDeCombustible combustible, TipoDeTransmision transmision,
            TipoDeVehiculo tipoDeVehiculo) {
        this.marca = marca;
        this.referencia = referencia;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.kilometraje = kilometraje;
        this.nuevo = nuevo;
        this.combustible = combustible;
        this.transmision = transmision;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean getEsNuevo() {
        return nuevo;
    }

    public void setEsNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public TipoDeCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoDeCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoDeTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(TipoDeTransmision transmision) {
        this.transmision = transmision;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public TipoDeVehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(TipoDeVehiculo tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public abstract double calcularPrecioVenta();

    public abstract double calcularPrecioAlquiler(int dias);

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", referencia=" + referencia + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", cilindraje=" + cilindraje + ", modelo=" + ", kilometraje=" + kilometraje
                + ", es nuevo=" + nuevo + ", combustible=" + combustible + ", transmision=" + transmision + "]";
    }

}
