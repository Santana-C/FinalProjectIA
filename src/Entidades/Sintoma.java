package Entidades;

/*@author Santana*/
public class Sintoma {
    private String nombre;
    private String clave;
    private boolean respuesta;

    public Sintoma(String nombre, String clave, boolean respuesta) {
        this.nombre = nombre;
        this.clave = clave;
        this.respuesta = respuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
    
}
