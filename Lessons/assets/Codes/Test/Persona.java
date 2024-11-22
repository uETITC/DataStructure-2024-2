package Test;

public class Persona {
    private String nombre;
    private int edad;
    // Agrega 3 atributos más de diferente tipo de variable
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        // Modifica el constructor y agrega los tres atributos que se definieron anteriormente
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        // Modifica este método y agrega los atributos que agregaste
    }
}
