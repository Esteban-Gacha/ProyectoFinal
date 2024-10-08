package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private String marca, referencia, cambios;
    private int velocidadMaxima, cilindraje, modelo, kilometraje;
    private Estado estado;
    private Combustible combustible;
    private Transmision transmision;

    public Vehiculo(String marca, String referencia, String cambios, int velocidadMaxima,
            int cilindraje, int modelo, Estado estado, Combustible combustible, Transmision transmision, int kilometraje) {
        this.marca = marca;
        this.referencia = referencia;
        this.cambios = cambios;
        this.transmision = transmision;
        this.modelo = modelo;
        this.estado = estado;
        this.combustible = combustible;
        this.transmision = transmision;
        this.kilometraje=kilometraje;
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

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", referencia=" + referencia + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", cilindraje=" + cilindraje + ", modelo=" + modelo + ", kilometraje=" + kilometraje
                + ", estado=" + estado + ", combustible=" + combustible + ", transmision=" + transmision + "]";
    }

}
