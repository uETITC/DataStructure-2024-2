# Instalación

## Historia

Java fue desarrollado por Sun Microsystems en 1995 como un lenguaje de programación robusto, portátil y orientado a objetos. Su objetivo era permitir que los desarrolladores escribieran código una vez y lo ejecutaran en cualquier dispositivo, gracias a la Máquina Virtual Java (JVM). Java ha evolucionado para convertirse en uno de los lenguajes más populares y utilizados en el mundo, siendo fundamental en aplicaciones empresariales, desarrollo web, móviles (Android) y sistemas embebidos. Aprender Java es crucial para cualquier programador, ya que ofrece una base sólida en programación orientada a objetos y una amplia demanda en la industria tecnológica, asegurando versatilidad y oportunidades de empleo.

::::{grid}

:::{grid-item}
:margin: auto auto 0 0
:columns: 6

<img src="../../images/java_graph.png" width="100%">

:::

:::{grid-item}
:margin: auto auto 0 0
:columns: 6

<iframe width="100%" height="280px" src="https://www.youtube.com/embed/Og847HVwRSI?si=WxbTYoHGrHXVX1nl" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
:::
::::

Imagen tomada de [Programming Languages: A Usage-based Statistical Analysis and Visualization](https://www.researchgate.net/publication/353521212_Programming_Languages_A_Usage-based_Statistical_Analysis_and_Visualization).


Puedes encontrar más información sobre llama en Wikipedia, [Java (programming language)](https://en.wikipedia.org/wiki/Java_(programming_language)). 

## JVM vs JRE vs JDK

::::{grid}

:::{grid-item}
:margin: auto auto 0 0
:columns: 4

<img src="../../images/matrioska.png" width="100%"/>

:::

:::{grid-item}
:margin: auto auto 0 0
:columns: 8

<img src="../../images/java_diagram.png" width="100%"/>

:::
::::


## Interpretado vs Compilado


::::{grid}

:::{grid-item}
:margin: auto auto 0 0
:columns: 6

<iframe width="100%" height="280px" src="https://www.youtube.com/embed/1OukpDfsuXE?si=Tv7n6i9PxWBl5TfW" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

:::
:::{grid-item}
:margin: auto auto 0 0
:columns: 6

<iframe width="100%" height="280px" src="https://www.youtube.com/embed/I1f45REi3k4?si=M_LBGtFO6iEgQn8L" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
:::
::::

## Hello World en Java

En esta clase, aprenderás a escribir, compilar y ejecutar un programa simple en Java que imprima 'Hello World' en la consola. Exploraremos cómo hacerlo desde diferentes entornos de desarrollo: la línea de comandos (CLI), Eclipse, NetBeans y Visual Studio Code (VS Code). Este conocimiento te proporcionará una base sólida para trabajar con Java en cualquier entorno.

Después exploraremos los tipos de variables en java y como imprimirlos de diferentes formas.


### Instalación de Java

Lo más recomendable es descargar la versión más reciente de java, 22, pero para evitar inconveniendes se sugiere descargar la versión 21.

::::{tab-set}
:::{tab-item} Windows 

Descarga openjdk de la página oficial de [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html). 
:::  
:::{tab-item} Ubuntu

Descargar la versión 21 de java 

```bash
sudo apt install openjdk-21-jdk
```

:::
::::

Para verificar si java fue instalado correctamente abre una terminal: CMD o de Power Shell si estas en Windows, o una terminal de Ubuntu, y ejecuta:

```bash
java -version
javac -version
```
Posible resultado:

```bash
java version "23.0.1" 2024-10-15
Java(TM) SE Runtime Environment (build 23.0.1+11-39)
Java HotSpot(TM) 64-Bit Server VM (build 23.0.1+11-39, mixed mode, sharing)
```

### Ejecutando Java

:::::{tab-set}
::::{tab-item} Línea de Comandos

**Línea de Comandos (CLI)**

**Paso 1:** Asegúrate de tener Java instalado.
- Abre una terminal y escribe `java -version`. Debes ver la versión de Java instalada.
- Si no está instalado, descárgalo e instálalo desde [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

**Paso 2:** Crear el archivo fuente.
- Abre tu editor de texto favorito y escribe el siguiente código:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

- Guarda el archivo como `HelloWorld.java`.

**Paso 3:** Compilar el código.
- Navega al directorio donde guardaste `HelloWorld.java` usando la terminal.
- Ejecuta el siguiente comando para compilar el programa:

```bash
javac HelloWorld.java
```

- Esto generará un archivo `HelloWorld.class`.

**Paso 4:** Ejecutar el programa.
- Ejecuta el programa compilado con el siguiente comando:

```bash
java HelloWorld
```

- Deberías ver "Hello World" impreso en la consola.

::::
::::{tab-item} JShell

JShell es una herramienta de la línea de comandos que viene con Java a partir de la versión 9. Es un REPL (Read-Eval-Print Loop) para Java, que permite ejecutar fragmentos de código de forma interactiva sin la necesidad de compilar y ejecutar un programa completo. Es ideal para probar pequeños fragmentos de código o para aprender y enseñar conceptos de Java.

**Paso 1:** Iniciar JShell.
- Abre una terminal o línea de comandos.
- Escribe `jshell` y presiona Enter para iniciar JShell.

**Paso 2:** Escribir y ejecutar el código "Hello World".
- Una vez dentro de JShell, simplemente escribe el siguiente código para imprimir "Hello World":

```java
System.out.println("Hello World");
```

- Presiona Enter y JShell ejecutará el comando, mostrando "Hello World" inmediatamente en la consola.

**Paso 3:** Trabajar con variables y métodos en JShell.
- Puedes declarar variables y escribir métodos directamente en JShell. Por ejemplo, declara una variable:

```java
int x = 10;
```

- JShell te mostrará el valor asignado.
- También puedes definir métodos:

```java
void greet() {
    System.out.println("Hello from JShell!");
}
```

Y llamarlo inmediatamente después:

```java
greet();
```

Esto imprimirá "Hello from JShell!" en la consola.

**Paso 4:** Salir de JShell.
Para salir de JShell, escribe:

```java
/exit
```

o ingresa el comando `ctrl+d`, esto cerrará la sesión de JShell.

::::
::::{tab-item} VSC

**Visual Studio Code (VSC)**

Es altamente recomendado que descarguen [Anaconda](https://www.anaconda.com/download), este es un entorno desarrollado para Python que permite trabajar con notebooks de forma sencilla y óptima.

**Paso 1:** Instalar Visual Studio Code y la extensión de Java.
- Descarga Visual Studio Code desde [aquí](https://code.visualstudio.com/).
- Instala la extensión de Java: Ve a la sección de extensiones (ícono de cubos) y busca `Java Extension Pack`. Instálala.

**Paso 2:** Crear un nuevo archivo Java.
- Abre VS Code y crea un nuevo archivo llamado `HelloWorld.java`.

**Paso 3:** Escribir el código.
-  Escribe el código "HelloWorld" ya creado anteriormente en el editor.

**Paso 4:** Ejecutar el programa.
- Guarda el archivo y haz clic en `Run` en la esquina superior derecha de VS Code o presiona `Ctrl + F5`.
- VS Code compilará y ejecutará el programa, mostrando "Hello World" en la terminal integrada.

**Paso 5:** Java Notebooks.
- Descargar e instalar [IJava](https://github.com/SpencerPark/IJava). Pueden seguir el tutorial [Java in Jupyter Notebooks -- Part 1: Introduction to Java Programming in Jupyter Notebook ](https://www.youtube.com/watch?v=UKT6t9R5RHA).

::::
::::{tab-item} Eclipse

**Paso 1:** Descargar e instalar Eclipse.
- Descarga Eclipse desde [aquí](https://www.eclipse.org/downloads/). 
- Instala la opción para desarrolladores de java (java developer), luego abre Eclipse.

**Paso 2:** Crear un nuevo proyecto Java.
- En Eclipse, selecciona `File` > `New` > `Java Project`.
- Nombra el proyecto como `HelloWorldProject` y haz clic en `Finish`.

**Paso 3:** Crear la clase `HelloWorld`.
- Haz clic derecho en la carpeta `src` dentro del proyecto y selecciona `New` > `Class`.
- Nombra la clase como `HelloWorld` y asegúrate de que la opción `public static void main(String[] args)` esté seleccionada.
- Haz clic en `Finish`.

**Paso 4:** Escribir el código.
- En la ventana de edición de Eclipse, escribe el código de "HelloWorld" antes creado.

**Paso 5:** Ejecutar el programa.
- Haz clic derecho en el archivo `HelloWorld.java` y selecciona `Run As` > `Java Application`.
- El programa se ejecutará y mostrará "Hello World" en la consola de Eclipse.

::::
::::{tab-item} NetBeans

**Paso 1:** Descargar e instalar NetBeans.
- Descarga NetBeans desde [aquí](https://netbeans.apache.org/download/index.html).
- Instala y abre NetBeans.

**Paso 2:** Crear un nuevo proyecto Java.
- En NetBeans, selecciona `File` > `New Project`.
- Selecciona `Java` > `Java Application` y haz clic en `Next`.
- Nombra el proyecto como `HelloWorldProject` y haz clic en `Finish`.

**Paso 3:** Crear la clase `HelloWorld`.
- NetBeans crea una clase principal automáticamente si eliges "Create Main Class" al crear el proyecto. Si no, crea una nueva clase.
- Escribe el código "HelloWorld" ya creado anteriormente en el editor.

**Paso 4:** Ejecutar el programa.
- Haz clic en el botón `Run Project` (ícono de triángulo verde).
- Verás "Hello World" en la ventana de salida de NetBeans.

::::
::::{tab-item} Docker

Docker es una plataforma de contenedorización que permite empaquetar aplicaciones junto con todas sus dependencias en un contenedor ligero y portátil. Esto asegura que la aplicación funcione de manera idéntica en cualquier entorno, lo que es particularmente útil en desarrollo, pruebas y despliegue.

**Paso 1:** Instalar Docker.
- Asegúrate de tener Docker instalado en tu sistema. Puedes descargarlo e instalarlo desde [Docker](https://www.docker.com/products/docker-desktop).

**Paso 2:** Crear el archivo fuente de Java.
- Crea un archivo llamado `HelloWorld.java` en un directorio de tu elección con el siguiente contenido:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

**Paso 3:** Crear un `Dockerfile`.
- En el mismo directorio donde guardaste `HelloWorld.java`, crea un archivo llamado `Dockerfile` (sin extensión) con el siguiente contenido:

```Dockerfile
# Usar la imagen base de OpenJDK
FROM openjdk:21-jdk

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo Java en el contenedor
COPY HelloWorld.java /app

# Compilar el archivo Java
RUN javac HelloWorld.java

# Definir el comando para ejecutar el programa
CMD ["java", "HelloWorld"]
```

**Paso 4:** Construir la imagen de Docker.
- Abre una terminal en el directorio donde están ubicados `HelloWorld.java` y el `Dockerfile`.
- Ejecuta el siguiente comando para construir la imagen de Docker:

```bash
docker build -t java-hello-world .
```

- Docker construirá la imagen, compilando el código Java dentro del contenedor.

**Paso 5:** Ejecutar el contenedor.
- Una vez construida la imagen, ejecuta el siguiente comando para correr el contenedor y ver el resultado:

```bash
docker run --rm java-hello-world
```

- El contenedor se ejecutará y deberías ver "Hello World" impreso en la consola.

**Paso 6:** Limpiar (opcional).
- Si deseas eliminar la imagen de Docker que has creado, puedes hacerlo con el siguiente comando:

```bash
docker rmi java-hello-world
```

::::
::::{tab-item} Google Colab

`````{tab-set}
````{tab-item} Línea de Comandos (CLI)

**Paso 1:** Preparar Google Colab para Java.
- Google Colab está diseñado principalmente para Python, pero también puedes ejecutar código Java en él utilizando una configuración especial.
- Abre Google Colab desde [colab.research.google.com](https://colab.research.google.com/).

**Paso 2:** Crear una nueva libreta.
- Haz clic en `New Notebook` para crear una nueva libreta en Google Colab.

**Paso 3:** Configurar el entorno para ejecutar Java.
- En la primera celda de la libreta, escribe el siguiente comando para instalar el entorno JDK en Google Colab:

```bash
!apt-get install openjdk-21-jdk
```

- Ejecuta la celda (Ctrl + Enter) para instalar el JDK. Esto permitirá que puedas compilar y ejecutar código Java.

**Paso 4:** Escribir y ejecutar el código "Hello World".
- En una nueva celda, escribe el código Java:

```java
%%writefile HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

- Ejecuta la celda para guardar el archivo `HelloWorld.java`.

**Paso 5:** Compilar y ejecutar el programa.
- En una nueva celda, compila el programa con el siguiente comando:

```bash
!javac HelloWorld.java
```

- Luego, ejecuta el programa con el siguiente comando:

```bash
!java HelloWorld
```

- Verás "Hello World" impreso en la consola de salida de Colab.

````
````{tab-item} Kernel de Java

Instala el kernel de Java copiando y pegando el código de la sección de [Ejecucción en Google Colab](execuingColab) en la primera casilla.

Ahora conectate de forma local y después reinicia el kernel. Ya realizado este proceso no se debe repetir, si no podrías causar un error. 

**Paso 1**

<img src="../../images/colab1.png" width="90%" style="margin: 100 auto 0 auto;">

**Paso 2**

<img src="../../images/colab2.png" width="90%">

Si todo esta correcto ahora debe aparecer conectado el notebook con dos barras verde (ram y cpu) y un chulo verde.

**Paso 3**

<img src="../../images/colab3.png" width=90%>

````
`````
::::
:::::

## Tipos de Variables


```{figure} https://www.altexsoft.com/static/blog-post/2024/2/59771e86-6989-4a76-9695-1e572a24c2ed.webp
---
width: 100%
name: data_types
---
Clacificación de las variables en java. Imagen tomada de [Data Structure: Definition, Types, and Examples](https://www.altexsoft.com/blog/data-structure/).
```

```{figure} https://static.wikia.nocookie.net/java/images/0/0c/Variables.jpeg
---
width: 80%
name: data_types2
---
Tipos de variables en java. Imagen tomada de [Variables Java](https://java.fandom.com/wiki/Variables).
```

## Conclusiones

En esta clase, aprendimos cómo ejecutar un programa básico en Java que imprime "Hello World" utilizando diferentes entornos de desarrollo. Cada entorno tiene sus propias ventajas y es importante familiarizarse con ellos para poder trabajar en diferentes contextos profesionales. Esta base te permitirá abordar proyectos más complejos en el futuro.

Además, revisamos los tipos de variables en Java y como estos se suelen operar entre si, sin olvidar las formas en las que se pueden imprimir (tarea).

## Ejercicio

::::{admonition} Taller 1

1. Crea un Notebook en VSC con el kernel de java donde se muestren las operaciones entre caracteres, cuerdas (string), y números (int, float, double, etc). Además agrega el código de la clase "HelloWorld" que ya hemos creado pero personaliza el texto. Deben ser por lo menos 7 ejemplos.
2. Utilizando el código del punto anterior, crea una clase (asígnale un nombre diferente) donde se imprima por lo menos 7 variables con los ejemplos del primer punto. 
3. Crea una clase llamada Porcentaje que dado un número entero imprima el número con signo de porcentaje seguido de la misma cantidad de símbolos #, es decir, dado el número 27 la clase debe imprimir:

```text
27%: ###########################
77%: #############################################################################
```

Revisa la primera referencia en [Documentación](documentacion).

1. Resuelve el problema [Fahrenheit to Celsius](https://www.codeabbey.com/index/task_view/fahrenheit-celsius) de [CodeAbby](https://www.codeabbey.com/). Agrega el código al notebook que solucione el problema para un número. **Opcional**: Agrega un pantallazo de la imagen generada por CodeAbby al entregar el código que resuelve el problema, es decir, que pasa las pruebas de CodeAbby.
2. Crea una clase llamada Impresiones donde se impriman varias variables en diferentes formatos, utilizando el método `Format()` de Java. Revisa las dos últimas referencias de guías y documentos. Escribe por lo menos 7 ejemplos.

:::{warning}
Todos los códigos deben ser presentados en un Notebook llamado **Taller1.ipynb** que debe estar en el repositorio del curso y que después debe ser cargado al Campus Virtual.

<b>Fecha Máxima de Entrega: Agosto 24 media noche.</b>
:::
::::

## Recursos Adicionales

### Guias 

- [Oracle - Java Platform, Standard Edition Java Shell User’s Guide](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm#JSHEL-GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8)
- [Differences between JDK, JRE and JVM](https://www.geeksforgeeks.org/differences-jdk-jre-jvm/)
- [Java Virtual Machine](https://www.startertutorials.com/corejava/java-virtual-machine.html)
- [Class Structure & SyntaxS2C Home « Class Structure & Syntax](https://server2client.com/javaobjclasses/classstructure.html)

(documentacion)=
### Documentación

- [OpenJDK - java - String class](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/lang/String.java)
- [Java String format() Method](https://www.w3schools.com/java/ref_string_format.asp)
- [Java String format()](https://www.javatpoint.com/java-string-format)
- [openjdk - Docker Official Image](https://hub.docker.com/_/openjdk)
- [openjdk - openjdk:21-jdk - Multi-platform](https://hub.docker.com/layers/library/openjdk/21-jdk/images/sha256-728a7010f5cc48db66d282d81694e49e9735a1490e831b0bf7a25cfc1b6e964c)

### Vídeos de Youtube 
- [#4 How Java Works ](https://www.youtube.com/watch?v=NHrsLjhjmi4)
- [Understand the Differences between JVM vs JRE vs JDK in java in one video #1.3](https://www.youtube.com/watch?v=RYd_hagCiVk)
- [Floating Point Numbers - Computerphile ](https://www.youtube.com/watch?v=PZRI1IfStY0)