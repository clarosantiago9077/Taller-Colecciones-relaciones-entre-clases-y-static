# Taller-Colecciones-relaciones-entre-clases-y-static
PARTE C Y PREGUNTAS

Reto 1
Error: java.util.ConcurrentModificationException
Ocurre porque el for-each usa un iterador que detecta que la lista cambió cuando se hace remove dentro del ciclo. Se soluciona recorriendo con índice desde el final.

Reto 2
cancionMasLarga recorre la lista y devuelve la de mayor duración, o null si está vacía.

Reto 3
getCanciones devuelve una copia de la lista. Al hacer clear a la copia, la playlist no cambia porque son listas distintas.

Reto 4
Error: Puesto(int) is not public in Puesto; cannot be accessed from outside package
El constructor no es público, así que solo Parqueadero puede crear puestos. Eso es composición: el todo crea y posee sus partes.

Reto 5
Predicción: 3, true, false, 2, true
Las posiciones 0 y 1 son la misma referencia, por eso da true. La posición 2 es otro objeto, por eso da false. El remove quita solo la primera aparición, así que quedan 2 y x sigue en la lista.

Preguntas
1. int es primitivo y el ArrayList solo guarda objetos. Integer es su clase envoltorio.
2. Cada lista guarda referencias. Quitar la canción de una lista no destruye el objeto. Es agregación.
3. Playlist y Cancion es agregación: las canciones se crean afuera y se comparten. Parqueadero y Puesto es composición: el parqueadero crea los puestos y no existen sin él.
4. totalCanciones es de la clase y se comparte entre todas. titulo es de cada objeto.
5. Un método static no tiene objeto en curso, y this es el objeto en curso.

   DIAGRAMAS

   <img width="1200" height="640" alt="image" src="https://github.com/user-attachments/assets/9b151fff-f3b1-4e58-82d5-8fab0cd96ba2" />

   <img width="1200" height="560" alt="image" src="https://github.com/user-attachments/assets/cdb493b4-6a09-4444-898a-304205088e4d" />


