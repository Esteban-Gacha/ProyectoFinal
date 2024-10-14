package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private String marca, referencia, cambios;
    private int velocidadMaxima, cilindraje, kilometraje;
    private boolean nuevo;
    private Combustible combustible;
    private Transmision transmision;

    public Vehiculo(String marca, String referencia, String cambios, int velocidadMaxima,
            int cilindraje, boolean nuevo, Combustible combustible, Transmision transmision, int kilometraje) {
        this.marca = marca;
        this.referencia = referencia;
        this.cambios = cambios;
        this.transmision = transmision;
        this.nuevo = nuevo;
        this.combustible = combustible;
        this.transmision = transmision;
        this.kilometraje = kilometraje;
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

    public boolean getEstado() {
        return nuevo;
    }

    public void setEstado(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public abstract void calcularPrecioVenta();

    public abstract void calcularPrecioAlquiler(int dias);

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", referencia=" + referencia + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", cilindraje=" + cilindraje + ", modelo=" + ", kilometraje=" + kilometraje
                + ", es nuevo=" + nuevo + ", combustible=" + combustible + ", transmision=" + transmision + "]";
    }

}
