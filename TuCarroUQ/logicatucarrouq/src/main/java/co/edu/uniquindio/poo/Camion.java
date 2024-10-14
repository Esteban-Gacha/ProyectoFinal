package co.edu.uniquindio.poo;

public class Camion extends Vehiculo{
    private int numeroDeEjes;
    private double capacidadDeCarga;
    private boolean aireAcondicionado,frenosDeAire,ABS;
    private String tipoCamion;


    public Camion(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, boolean nuevo,
            Combustible combustible, Transmision transmision, int kilometraje, int numeroDeEjes,
            double capacidadDeCarga, boolean aireAcondicionado, boolean frenosDeAire, boolean ABS, String tipoCamion) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, nuevo, combustible, transmision, kilometraje);
        this.numeroDeEjes = numeroDeEjes;
        this.capacidadDeCarga = capacidadDeCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.ABS = ABS;
        this.tipoCamion = tipoCamion;
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(int numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosDeAire() {
        return frenosDeAire;
    }

    public void setFrenosDeAire(boolean frenosDeAire) {
        this.frenosDeAire = frenosDeAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
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
