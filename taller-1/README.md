# Sistema de Gestión de Biblioteca

Este proyecto implementa un sistema de gestión de una biblioteca utilizando los principios de **Programación Orientada a Objetos (POO)** en Java. Permite gestionar libros, usuarios y préstamos de manera eficiente.

## Tabla de Contenidos
1. [Descripción del Proyecto](#descripción-del-proyecto)
2. [Tecnologías Usadas](#tecnologías-usadas)
3. [Estructura del Proyecto](#estructura-del-proyecto)
4. [Cómo Ejecutar el Proyecto](#cómo-ejecutar-el-proyecto)
5. [Lógica de la Solución](#lógica-de-la-solución)
6. [Funcionalidades del Sistema](#funcionalidades-del-sistema)

## Descripción del Proyecto
Este sistema permite a un **Bibliotecario** gestionar libros y realizar préstamos a **Usuarios**. Cada **Usuario** puede solicitar un máximo de tres libros. El sistema utiliza conceptos fundamentales de POO como **herencia**, **encapsulamiento**, **polimorfismo** e **interfaces**.

## Tecnologías Usadas
- **Java 12** o superior
- **IntelliJ IDEA** (IDE recomendado)

## Estructura del Proyecto
BibliotecaPOO/ ├── src/ │ ├── Persona.java # Clase abstracta base para Usuario y Bibliotecario │ ├── Usuario.java # Clase para los usuarios que solicitan libros │ ├── Bibliotecario.java # Clase para el bibliotecario que gestiona los préstamos │ ├── Libro.java # Clase que representa los libros de la biblioteca │ ├── Gestionable.java # Interfaz para gestionar préstamos y devoluciones │ └── Main.java # Contiene el método main para simular el sistema └── README.md # Este archivo


### Clases Principales:
- **Persona**: Clase abstracta con atributos comunes para Usuario y Bibliotecario.
- **Usuario**: Hereda de Persona y representa a los clientes que pueden pedir préstamos.
- **Bibliotecario**: Hereda de Persona e implementa la interfaz Gestionable, gestionando los préstamos y devoluciones.
- **Libro**: Clase que representa los libros, con métodos para prestar y devolver.
- **Gestionable**: Interfaz que define los métodos para gestionar los préstamos y devoluciones de libros.

## Cómo Ejecutar el Proyecto

### Requisitos Previos
- Tener instalado **Java 12** o superior.
- Tener instalado **IntelliJ IDEA** (o cualquier otro IDE compatible con Java).

### Pasos para Ejecutar
1. Clona o descarga el repositorio en tu máquina local:
   ```bash
   git clone <URL-del-repositorio>
2. Abre IntelliJ IDEA y selecciona la opción Open para abrir el proyecto.

3. Asegúrate de que el JDK esté configurado correctamente. Puedes hacerlo yendo a: `File -> Project Structure -> Project -> Project SDK`

4. Compila y ejecuta el proyecto seleccionando la clase `Main.java` y presionando el botón de Run (flecha verde en la parte superior derecha del IDE) o usa el atajo `Shift + F10`.

5. El programa simulará el proceso de gestión de la biblioteca, mostrando en la consola la secuencia de préstamos y devoluciones de libros.   

## Lógica de la Solución
El sistema sigue los principios de Programación Orientada a Objetos de la siguiente manera:

1. Clases y Herencia:

- Se crea una clase abstracta `Persona` con los atributos `nombre` y `apellido`, de la cual heredan las clases  `Usuario` y `Bibliotecario`.
- Ambas clases implementan el método `mostrarDatos()` para mostrar información personalizada.
2. Encapsulamiento:

- La clase `Libro` tiene atributos privados (`título`, `autor`, `isbn`, `disponible`), asegurando que solo se puedan modificar a través de los métodos get y set.
- Los métodos `prestar()` y `devolver()` de la clase `Libro` manejan el estado de disponibilidad, validando si el libro está disponible antes de permitir que sea prestado.
3. Polimorfismo:

- Se sobrecarga el método `prestar()` en la clase `Bibliotecario` para que acepte un objeto `Usuario` como parámetro y verifique si el usuario ya ha alcanzado el máximo de préstamos permitidos.
4. Interfaces:

- Se define la interfaz `Gestionable` que incluye los métodos `prestarLibro()` y `devolverLibro()`. Esto promueve el uso de abstracción y desacoplamiento.
5. Programación Funcional vs. POO:

- En el método `main`, se cuenta el total de libros prestados de dos formas:
  1. **POO**: Sumando manualmente si los libros están prestados o no.
  2. **Funcional**: Utilizando un stream para filtrar y contar los libros prestados.

## Funcionalidades del Sistema
- **Prestar Libros**: El bibliotecario puede prestar un libro a un usuario, siempre que el usuario no tenga más de tres libros prestados y el libro esté disponible.
- **Devolver Libros**: El bibliotecario puede registrar la devolución de un libro.
- **Mostrar Datos**: Se puede mostrar información personalizada de los usuarios y bibliotecarios.
- **Contar Libros Prestados**: El sistema cuenta cuántos libros están actualmente prestados, utilizando tanto programación orientada a objetos como funcional.