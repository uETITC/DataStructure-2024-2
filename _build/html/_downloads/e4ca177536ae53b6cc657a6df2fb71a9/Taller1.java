import java.util.Scanner; 
import java.time.LocalDate;

class Taller1{
  private String name = "Sebastian";
  private LocalDate date = java.time.LocalDate.now();
  private String number;
  public static void main(String[] args){

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Ingresa un número: ");
    String number = myObj.nextLine();        // Read user input
  
    System.out.println("1ER PUNTO:");
    new Taller1().PrimerPunto();

    System.out.println("2DO PUNTO:");

    System.out.println("3RO PUNTO:");
    new Taller1().TercerPunto(number);
    // new Taller1().TercerPunto(Integer.parseInt(args[0])); // using the args variable

    System.out.println("4TO PUNTO:");
    new Taller1().CuartoPunto();

    System.out.println("5TO PUNTO:");
    new Taller1().QuintoPunto(Double.parseDouble(number));
    //new Taller1().QuintoPunto(Double.parseDouble(args[0]));
  }

  public void PrimerPunto(){
    System.out.printf("  Olá, %S, como você está hoje (%s)? %n", name, date);
    System.out.printf("  La suma entre %d y %d es %d %n", 13, 5, 13+5);
    System.out.printf("  El modulo de %f y %d es %d %n", 13.22f, 2, 13%5);
  }

  public void TercerPunto(String porcentaje){
    new Porcentaje().Imprimir(porcentaje);
  }

  public void CuartoPunto(){
    // Cinco decimales
    String string1 = String.format("  Cinco decimales: %.5f", Math.PI);
    System.out.println(string1);

    // No decimales
    String string2 = String.format("  No decimales: %.0f", Math.PI);
    System.out.println(string2);

    // Números hexadecimales
    String string3 = String.format("  Hexadecimal de %d es: %x", 255, 255);
    System.out.println(string3);

    // Notación cientifica con 3 digitos
    String string4 = String.format("  Notación cientifica con 3 digitos: %.2e", Math.E);
    System.out.println(string4);

    // Número con 7 espacios al inicio 
    String string5 = String.format("  Padded number (agregando 0s a la izquierda): %05d", 420);
    System.out.println(string5);

    // Imprimiendo fechas
    String string6 = String.format("  Date: %1$td-%1$tm-%1$tY", date);
    System.out.println(string6);

    // Imprimiendo bolean
    String string7 = String.format("  ¿Hoy tendras un buen día?: %b", true);
    System.out.println(string7); 
  }

  public void QuintoPunto(double temperatura){
    double celcius = (temperatura-32)*5/9;
    System.out.printf("  %.3f C° son %.3f °F %n", temperatura, celcius);

    double fahrenheit = temperatura*9/5+32;
    System.out.printf("  %.3f F° son %.3f °C %n", temperatura, fahrenheit);
  }
}

class Porcentaje{
  public void Imprimir(String number){
    int porcentaje = Integer.parseInt(number);
    if (porcentaje>=0 && porcentaje<=100) {
      System.out.printf("  %d %%: %s %n", porcentaje, "#".repeat(porcentaje));
      System.out.printf("  %d %%: %s %n", porcentaje/2, "#".repeat(porcentaje/2));
      System.out.printf("  %d %%: %s %n", porcentaje/8, "#".repeat(porcentaje/8));
    } 
    else{
      System.out.println("  ¡ERROR!: Intenta de nuevo, el número que ingresaste no esta en el rango de 0 a 100.");
    }
    
  } 
}