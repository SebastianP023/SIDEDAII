package ec.edu.epn.sidedaii.model;

/**
 * Modelo: contiene la informacion general del sistema SIDEDAII.
 */
public class SistemaModel {

    private final String nombre = "SIDEDAII";
    private final String nombreCompleto =
            "Sistema Didactico de Estructuras de Datos y Algoritmos II";
    private final String institucion = "Escuela Politecnica Nacional";
    private final String carrera = "Ingenieria en Sistemas";

    public String getNombre() {
        return nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getCarrera() {
        return carrera;
    }
}
