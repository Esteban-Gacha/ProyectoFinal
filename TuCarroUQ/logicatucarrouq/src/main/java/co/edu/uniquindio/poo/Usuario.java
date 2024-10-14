package co.edu.uniquindio.poo;

public abstract class Usuario {
    private String nombre;
    private String identificacion;
    private String contrasena;
    private String preguntaSeguridad;
    private String respuestaSeguridad;
    

    public Usuario(String nombre, String identificacion, String contrasena, String preguntaSeguridad, String respuestaSeguridad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contrasena = contrasena;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }
    
    // Método para autenticar usuario
    public boolean autenticar(String identificacion, String contrasena) {
        return this.identificacion.equals(identificacion) && this.contrasena.equals(contrasena);
    }
    
    // Método para recuperar contraseña mediante pregunta de seguridad
    public boolean recuperarContrasena(String respuesta) {
        return this.respuestaSeguridad.equalsIgnoreCase(respuesta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", identificacion=" + identificacion + ", contrasena=" + contrasena
                + ", preguntaSeguridad=" + preguntaSeguridad + ", respuestaSeguridad=" + respuestaSeguridad + "]";
    }


}

