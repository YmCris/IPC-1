/*Ejercicio de Clases Abstractas:
Se necesita desarrollar un sistema para una aplicación de música en línea que gestione diferentes tipos de contenido musical, como canciones, álbumes y listas de reproducción.
Cada tipo de contenido musical tiene atributos y comportamientos específicos.
Por ejemplo, una canción tiene un título, un artista y una duración, mientras que un álbum puede contener múltiples canciones y tener un año de lanzamiento.
Se desea implementar una funcionalidad para calcular la duración total de reproducción de un contenido musical, independientemente de su tipo.
Esto implica sumar las duraciones de las canciones individuales en el caso de un álbum o una lista de reproducción.
Además, se planea agregar nuevos tipos de contenido musical en el futuro, como podcasts o audiolibros,
que también necesitarán ser incluidos en el cálculo de la duración total de reproducción.
Se requiere diseñar un sistema de clases que incluya una clase abstracta llamada ContenidoMusical,
que sirva como clase base para los diferentes tipos de contenido musical. Esta clase abstracta debe contener un método abstracto para obtener la duración del contenido y
un método concreto para calcular la duración total de reproducción de un conjunto de contenido musical.
Además, se deben implementar clases concretas para cada tipo de contenido musical (canción, álbum, lista de reproducción, etc.)
que hereden de la clase ContenidoMusical y proporcionen una implementación concreta del método abstracto para obtener la duración del contenido.
El sistema debe demostrar el uso adecuado de clases abstractas en Java para definir un comportamiento común entre diferentes tipos de objetos
y facilitar la extensibilidad del sistema al permitir la adición de nuevos tipos de contenido musical en el futuro.*/
package com.ymcris.ipc1.i.clasesabstractas.practice;

/**
 *
 * @author crist
 */
public final class Main {

    public static void main(String[] args) {

    }
}
