package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo{

    private int numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasAire;
    private boolean aireAcondicionado, camaraReversa, velocidadCrucero, frenosABS, sensoresColision, sensorTraficoCruzado, asistentePermanenciaCarril;

    public Sedan(String marca, String referencia, String cambios, int velocidadMaxima, int cilindraje, int modelo,
            Estado estado, Combustible combustible, Transmision transmision, int kilometraje, int numeroPasajeros,
            int numeroPuertas, int capacidadMaletero, int numeroBolsasAire, boolean aireAcondicionado,
            boolean camaraReversa, boolean velocidadCrucero, boolean frenosABS, boolean sensoresColision,
            boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
        super(marca, referencia, cambios, velocidadMaxima, cilindraje, modelo, estado, combustible, transmision,
                kilometraje);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.frenosABS = frenosABS;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
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

    public boolean isFrenosABS() {
        return frenosABS;
    }

    public void setFrenosABS(boolean frenosABS) {
        this.frenosABS = frenosABS;
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

    
    @Override
    public String toString() {
        return "Sedan [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", capacidadMaletero="
                + capacidadMaletero + ", numeroBolsasAire=" + numeroBolsasAire + ", aireAcondicionado="
                + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", velocidadCrucero=" + velocidadCrucero
                + ", frenosABS=" + frenosABS + ", sensoresColision=" + sensoresColision + ", sensorTraficoCruzado="
                + sensorTraficoCruzado + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + "]";
    }





    
}
