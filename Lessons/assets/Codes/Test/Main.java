package Test;
public class Main {
  public static void main(String[] args) {
      // Creación de un objeto de la clase Persona y añade los atributos faltantes
      Persona persona1 = new Persona("Nestor", 25);
      persona1.mostrarInformacion(); // Imprime: Nombre: Juan, Edad: 25, etc
      
      // Creación de otro objeto de la clase Persona y añade los atributos faltantes
      Persona persona2 = new Persona("Clara", 30);
      persona2.mostrarInformacion(); // Imprime: Nombre: Ana, Edad: 30, etc
  }
}