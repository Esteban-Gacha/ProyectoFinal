package co.edu.uniquindio.poo;

import java.time.LocalDate;

public interface Reporteable {
    String generarReporte(LocalDate desde, LocalDate hasta);
}
