# laboratorioJava

Katas de Java , basadas en un proyecto ficticio: un sistema básico
para la cafetería "El Código". Cada kata es un ejercicio pequeño que resuelve
un problema cotidiano de la cafetería usando solo variables, operadores,
condicionales (`if/else`, `switch`) y bucles (`while`, `do-while`, `for`).
No se usan arreglos ni objetos.

El código está en inglés y los mensajes al usuario en español.

## Katas

| Kata | Nombre | Qué hace |
|---|---|---|
| 1 | Calculadora de propinas | Calcula la propina y el total a pagar, y avisa si la propina es muy alta o muy baja |
| 2 | Clasificador de bebidas | Clasifica una bebida como caliente, templada o fría según su temperatura |
| 3 | Calculadora de pedidos con IVA | Suma los productos de un pedido, calcula el IVA del 19% y aplica descuento si el total pasa de $50.000 |
| 4 | Validador de horarios | Dice si la cafetería está abierta según el día y la hora, usando `switch` |
| 5 | Menú interactivo | Menú con `do-while` y `switch` que suma los productos elegidos |
| 6 | Clientes por hora | Calcula total, promedio y hora pico de clientes sin usar arreglos |

Las katas 7 y 8 son retos opcionales y no están resueltas todavía.

Cada kata es una clase con su propio `main` (`Kata1.java`, `Kata2.java`, etc.).

## ConsoleScanner

Clase de apoyo que envuelve el `Scanner` de Java para no repetir el código de
lectura en cada kata.

- `ConsoleScanner.readInt(String message)`: muestra el mensaje, lee un entero
  por consola y lo devuelve.

Ejemplo:

    int day = ConsoleScanner.readInt("Escribe el día");

## Cómo ejecutarlo

    javac *.java
    java Kata4

Cambia `Kata4` por la kata que quieras correr. Requiere Java 21 o una versión
reciente, porque se usa el `switch` con `->`.