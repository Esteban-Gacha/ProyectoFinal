package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo {
    private int numeroDePasajeros,numeroBolsasAire;
    private double capacidadDeMaletero;
    private boolean airesAcondicionado,camaraReversa,velocidadCrucero,ABS,sensoresColision,sensorTraficoCruzado,asistentePermanenciaCarril,es4x4;

    public Camioneta(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje,
            boolean nuevo, Combustible combustible, Transmision transmision, int kilometraje, int numeroDePasajeros,
            int numeroBolsasAire, double capacidadDeMaletero, boolean airesAcondicionado, boolean camaraReversa,
            boolean velocidadCrucero, boolean ABS, boolean sensoresColision, boolean sensorTraficoCruzado,
            boolean asistentePermanenciaCarril, boolean es4x4) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, nuevo, combustible, transmision, kilometraje);
        this.numeroDePasajeros = numeroDePasajeros;
        this.numeroBolsasAire = numeroBolsasAire;
        this.capacidadDeMaletero = capacidadDeMaletero;
        this.airesAcondicionado = airesAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.ABS = ABS;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
        this.es4x4 = es4x4;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public double getCapacidadDeMaletero() {
        return capacidadDeMaletero;
    }

    public void setCapacidadDeMaletero(double capacidadDeMaletero) {
        this.capacidadDeMaletero = capacidadDeMaletero;
    }

    public boolean isAiresAcondicionado() {
        return airesAcondicionado;
    }

    public void setAiresAcondicionado(boolean airesAcondicionado) {
        this.airesAcondicionado = airesAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
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
